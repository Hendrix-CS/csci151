---
layout: work
type: Lab
num: 9
worktitle: Skip Lists
---

## Overview

This lab will:

-   Teach you about skip lists, a very cool data structure that combines
    the benefits of sorted arrays and linked lists;
-   Give you experience working with linked structures, extensible
    arrays, and stacks.

## Materials

-   IntelliJ
-   Lab partner

## Description

If we want to maintain a sorted list of items, from what we have seen so
far we have two options:

-   Keep a sorted array. Pro: we can use binary search, so finding
    things takes <span class="math inline">\\(O(\\lg n)\\)</span> time.
    Con: in order to insert a new item we have to shift everything to
    make room, which takes <span class="math inline">\\(O(n)\\)</span>.
-   Keep a sorted linked list. Con: we have to use linear search, which
    takes <span class="math inline">\\(O(n)\\)</span>. Pro: once we have
    found the correct place, inserting can be done in <span
    class="math inline">\\(O(1)\\)</span> time just by moving
    references.

A [**skip list**](https://en.wikipedia.org/wiki/Skip_list) is an
intriguing structure which combines the benefits of both approaches, and
allows us to keep a sorted list such that all operations (lookup,
insert, remove) take <span class="math inline">\\(O(\\lg n)\\)</span>
time.

Fundamentally, a skip list is like a normal (singly) linked list, but
with extra links added that "skip" over parts of the list. These extra
links mean we can avoid having to iterate through every single node when
looking for something in the list: we can start by taking very big hops
in the list until the next big hop would take us beyond what we are
looking for; then we take slightly smaller hops; and so on.

<div class="figure">

![](https://upload.wikimedia.org/wikipedia/commons/8/86/Skip_list.svg)

</div>

For example, the image above illustrates a skip list containing the
numbers <span class="math inline">\\(1\\)</span> through <span
class="math inline">\\(10\\)</span>. Suppose we are looking for <span
class="math inline">\\(8\\)</span>. We start at the node marked "head",
at the topmost level, *i.e.* level 3 (the bottom level is level <span
class="math inline">\\(0\\)</span>). Following the topmost link takes us
to the node containing <span class="math inline">\\(1\\)</span>, which
is smaller than <span class="math inline">\\(8\\)</span>, so we continue
searching. The next link on the top level would take us beyond the end
of the list (*i.e.* it is null, shown as NIL in the above picture), so
we don't follow it. Instead, we stay on the node containing <span
class="math inline">\\(1\\)</span> and move down one level, to level 2.
Now, we follow links on level 2 as long as the items we encounter are
less than <span class="math inline">\\(8\\)</span>: the first link takes
us to the node containing <span class="math inline">\\(4\\)</span>;
another step takes us to <span class="math inline">\\(6\\)</span>; then
the next step would take us past the end of the list, so we stop and
move down to level <span class="math inline">\\(1\\)</span>. On level
<span class="math inline">\\(1\\)</span>, the next step would take us to
<span class="math inline">\\(9\\)</span>, which is too big. So instead
we move down again to level <span class="math inline">\\(0\\)</span>,
and then follow links to <span class="math inline">\\(7\\)</span> and
finally to <span class="math inline">\\(8\\)</span>. The point is to
notice how we were able to find <span class="math inline">\\(8\\)</span>
without ever having to look at the nodes containing <span
class="math inline">\\(2\\)</span>, <span
class="math inline">\\(3\\)</span>, or <span
class="math inline">\\(5\\)</span>.

How do we determine how "tall" each node should be? The answer is: by
flipping a coin! Each time we create a node, we randomly decide how tall
it should be by flipping a coin and seeing how many times in a row the
coin comes up heads. We then add one level for each coin toss that came
up heads. Every node has height at least <span
class="math inline">\\(1\\)</span>; and then it has a 1/2 chance of
having height at least <span class="math inline">\\(2\\)</span>; a 1/4
chance of having height at least <span
class="math inline">\\(3\\)</span>; a 1/8 chance of height at least
<span class="math inline">\\(4\\)</span>; and so on. So on average, we
expect that at each level there will be half as many nodes as the
previous level. Conversely, on the very top level, we expect to find
only one or two nodes, so each step will cover about half the list; on
the next level down, each step between nodes will cover about 1/4 the
list; and so on. Thus, we expect searching for a given node to take
<span class="math inline">\\(O(\\lg n)\\)</span> steps on average. As we
will see, we also expect adding a new node to take <span
class="math inline">\\(O(\\lg n)\\)</span> steps on average: we can find
the right location for it in <span class="math inline">\\(O(\\lg
n)\\)</span>, just as with a sorted array, but then we can quickly add
it just by shifting pointers around.

## Setup

1.  Download the [skeleton](../code/skiplist.zip) for this project.
2.  Unpack the code into a new Eclipse Java project.
3.  Add in the JUnit library to your project settings if necessary.

## Step 1: SkipNode

The first step is to make a generic `SkipNode<E>` class to represent
single nodes in our skip list. Each node should contain two fields:

-   A generic data item of type `Optional<E>`;
-   An `ArrayList` of `Optional` references to other `SkipNode`s. Index
    `i` of the `ArrayList` will contain the link to the next node on
    level `i`.

Add the following methods to your `SkipNode` class:

-   A constructor `SkipNode(Optional<E> data)` which makes a skip node
    containing the given data, and creates an empty `ArrayList` of
    references.
-   `getHeight`: returns the *height* of the node, defined simply as the
    length of the `ArrayList`.
-   `getData`: returns the `data` item stored in the node.
-   `getNext`: takes a level as a parameter and returns a reference to
    the next node on the given level, or `Optional.empty()` if the node
    is not tall enough to contain something at the given level.
-   `addNext`: takes a reference to an `Optional<SkipNode>` as a
    parameter, and appends it to the `ArrayList`, *i.e.* the node
    becomes one level taller.
-   `setNext`: takes two parameters, a level and a reference to an
    `Optional<SkipNode>`, and sets the reference at that level to the
    given reference. Does nothing if the node is not tall enough (*e.g.*
    if a node has height 3 then calling `setNext(5, ...)` should do
    nothing, because the node does not contain a reference at level 5).

Each of these methods should only be a few lines of code at most. If
they are longer than that, you are doing something wrong.

## Step 2: Locating

We are now ready to start implementing skip lists. I have provided some
starter code in [`SkipList.java`](../code/SkipList.java); you will be
filling in some of the important methods.

To cut down on the number of special cases we have to deal with, note
that a skip list will always start with a "dummy" or "sentinel"
`SkipNode` which contains no data. (This dummy node has already been
created for you in the `SkipList` constructor.) This way, `front` itself
never needs to point to a different node; we can just change the
references in the dummy node just as we would with any other node. In
addition, we can ensure that the dummy node is always as tall as the
tallest node in the remainder of the list, so we can start at the
highest level just by looking at the height of the initial dummy node.

The first step is to implement the `locate` method, which performs the
important task of looking for a given data item. It should work very
similarly to the process described in the introduction: it starts
following links in the top level, and keeps moving down level by level
while staying to the left of the node being searched for. However, it
returns more than just return the data itself: in particular, it returns
a stack of references to nodes encountered during its search. On top of
the stack is the last node encountered at level 0; the next item in the
stack is the last node encountered at level 1 (*i.e.* the last node we
were on before deciding to move down to level 0); the next item is the
last node encountered at level 2; and so on.

We can use this `locate` method and its stack of previous nodes to
implement many other methods---in fact, `locate` is used to implement
all the other methods such as `add`, `lookup`, and `remove`.

Here is how `locate` should work:

-   Create a new, empty stack of `SkipNode`s (you can use the standard
    Java `Stack` class).
-   Keep track of our current `SkipNode`. Begin at `front`.
-   For each level <span class="math inline">\\(l\\)</span>, starting at
    the highest level and proceeding to level <span
    class="math inline">\\(0\\)</span>:
    -   Keep following links at level <span
        class="math inline">\\(l\\)</span> until following the next link
        would either take us off the end of the list, or would lead to a
        node containing a `data` item which is greater than **or equal
        to** the item we are looking for. That is, if you see that the
        next node contains the item we are looking for, you should *not*
        follow the link! This is because we need the stack to contain
        all the nodes which are *previous* to the node we are searching
        for.
    -   Push the current `SkipNode` on the stack.

You won't really be able to test your implementation yet---keep going to
the next step!

## Step 3: Adding

### Step 3a: Implementation

In order to add a new item to the skip list, we begin by using `locate`
to find the place where it should go.

Next, we decide how tall to make the new node using coin flips. To
simulate a "coin flip" you can call `Math.random()`, and make a new node
if the value returned is less than 0.5.

Here is how `insertSkipListNode` should work:

-   Create a new `SkipNode`.
-   Pop the first `SkipNode` from the stack; call it `prev`. This will
    be the previous node on level 0. Insert the newly created `SkipNode`
    right after this previous level 0 node by:
    -   Adding a reference to the new node which points to whatever
        `prev` was pointing to on level 0.
    -   Now set `prev` to point to the new node on level 0 instead.
-   Now for the fun part: we have to decide how tall to make the newly
    created node by flipping a coin (at this point it has height <span
    class="math inline">\\(1\\)</span>).
-   As long as a "coin flip" results in heads:
    -   Increment the current level (use a local variable to keep track)
    -   If the stack is empty, just add an `Optional.empty()` reference
        to the top of the new node.
    -   Otherwise, pop a `SkipNode` from the stack (call it `prev`), and
        insert the new node after `prev` on the current level. That is,
        the new node should point to whatever `prev` used to point to on
        the current level, and `prev` should now point to the new node.
-   Finally, we may need to grow the height of the dummy node at the
    front of the skip list to match the height of the node we just
    created. As long as the height of `front` is less than the height of
    the new node, keep increasing the height of `front` by adding
    references to the new node.

Finally, create an `add` method which takes an item of type `E` as a
parameter. It should first call `locate`, and then call
`insertSkipListNode` with the returned stack of nodes. Don't forget to
increment the `size` too!

### Step 3b: Testing

You should now be able to test your implementation. Run the unit tests
in `SkipListTest`. It should pass `testAdd()` and `testHeight()`. Note
that `testHeight()` may require a few seconds to complete.

You can also test your code using the GUI visualizer. Run `SkipListApp`.
You can add elements to your SkipList and see them visualized on the
interface. Here is an example of a string it may display:

    D : d n r r
    d : k | | |
    k : n | | |
    n : p r | |
    p : r | | |
    r : t u u /
    t : u | | |
    u : v z / |
    v : z | | |
    z : / / | |

Note that the list is displayed "sideways", with the lowest layer at the
left and the top layer to the right.

Each row corresponds to a node in the `SkipList`, with the data stored
in the node listed at the left. `D` represents the "dummy" node at the
front of the list, which does not store any data. To the right of the
colon you can see how tall each node is; each number shows the data
contained in the node the link at that level points to. So, for example,
from the row

    r : t u u /

We can see that this is a node containing the data value `r`; at level 0
it points to `t` (the very next node); at levels 1 and 2 it points to
the node containing `u`. The frontslash (`/`) represents an empty node.
For example:

    z : / / | |

shows a node containing `z` with height 2. Both of its forward pointers
are empty. That could change if otehr values are inserted later.

## Step 4: Lookup and Remove

Now add `lookup` and `remove` methods.

-   `public Optional<E> lookup(E toFind)`: this should work by calling
    `locate`, and then checking whether the node on top of the returned
    stack points on level 0 to a node containing a data item that
    `.equals(toFind)`. If so, return that data item. Otherwise, return
    `Optional.empty()`.

(Remember that this is useful because `toFind` and the data item might
not be exactly identical, even though they are `.equal`---for example,
we could implement a dictionary using a `SkipList` of `Association`s,
which are `.equal` as long as their keys are.)

-   `public Optional<E> remove(E toRemove)`: this method should call
    `locate`, and then check whether the node on top of the returned
    stack points on level 0 to a node containing the thing we want to
    remove. If not, do nothing and return `Optional.empty()`. If it
    does, then we want to remove that next node. You will need to loop
    over its layers and set the previous node in each layer (which are
    on the stack) to point to the node beyond it. Don't forget to
    decrement the `size`.

## Step 5: Evaluation

Experiment with SkipListApp for a while. Create 3 skiplists each of
sizes 8, 16, and 32, for a total of 9 skiplists. For each skiplist, copy
the string version of the list into your document. Then answer these
questions:

-   What is the maximum height?
-   How close is the maximum height to the log of the list size?
-   How many nodes have heights above 1 but below the maximum?
-   How well dispersed are the taller nodes throughout the list?

## What to Hand In

Submit `SkipList.java` and `SkipNode.java`, as well as your evaluation
document.

## Grading

* To earn a 7, complete Step 1
* To earn a 10, do the above and Step 2
* To earn a 12, do the above and Step 3
* To earn a 16, do the above and Step 4
* To earn a 20, do the above and Step 5
