---
layout: work
type: Lab
num: 5
worktitle: Mazes - Breadth First Search
---

## Overview

In this lab, we will implement a generic version of the Queue
data type within the context of searching a maze.

Materials
---------

-   IntelliJ
-   Lab partner

Setup
-----

1.  Download the [skeleton](../code/maze151bfs.zip) for this project.
2.  Unpack the code into a new IntelliJ Java project.

Description
-----------

In Lab 4, we explored searching a maze for a goal using a stack to
organize our potential Trails. The stack allowed us to search in a
depth-first search manner. In other words, we would explore down a trail
as far as possible, and backtracked if we reached a dead end in our
journey, because we were search the youngest potential trail next.

But there are other ways to search. We now want to investigate a
breadth-first search approach, where the oldest potential trail is
expanded next.

In this lab, you will create the necessary data structures to search a
maze with breadth-first search.

{% include note.html content="This project contains a working implementation of the Maze
Enum and Array Lab, so you do not have to revise any of your earlier code to add
this functionality." %}

## Step 1 - ListQueue\<E\>

To implement the generic version of a Stack with nodes, you
should use the generic `ListNode<E>` class we implemented last lab.

{% include important.html content="All of your
implementations for this lab will be located in the `maze.searchers`
directory." %}

### Step 1.1 - Implementation

Write a class called `ListQueue<E>`. This will need to implement the
`Queue<E>` interface, and have at least a `ListNode<E>` called `front`
and another called `back` as fields.

### Step 1.2 - `public void add(E item)`

Create a new `ListNode<E>` that stores the `item`.

If the queue `isEmpty`, then set `front` to this new `ListNode<E>`.

Otherwise, the current `back` should refer to this new `ListNode<E>` as its `next`.

Finally, redirect `back` to reference this new `ListNode<E>`.

### Step 1.3 - `public E remove()`

Call the `emptyCheck` method. This will throw an `IllegalStateException`
if the queue is empty.

Save the value stored in `front`, and redirect `front` to point to the `next` `ListNode<E>`.

Return the value you stored.

### Step 1.4 - `public E element()`

Call the `emptyCheck` method. This will throw an `IllegalStateException`
if the queue is empty.

Return the value stored in the `front` `ListNode<E>`.

### Step 1.5 - `public int size()`

If `front` is `null`, return 0.

Otherwise, return the number of `ListNode<E>` that are chained from the `front` node.

### Step 1.6 - Testing

Run the `ListQueueTest` suite, and ensure your above methods are passing
these tests.

### Step 1.7 - GUI

Run the GUI to interact with your code.

## Step 2 - ArrayQueue\<E\>

Write a class called `ArrayQueue<E>`. This will need to implement the
`Queue<E>` interface. The `E[] stuff` field is provided for you, you
will need to add the necessary `int`s to track the data. I recommend
starting with `front` and `size` both equal to 0.

{% include note.html content="As we discussed, if you use the
fields of front and size, you can always
calculate the back of the queue using (front + size) % stuff.length ." %}

### Step 2.1 - `public void add(E item)`

If there is no more room in the `stuff` array, you will need to **resize**.

* Create a new array twice as big as `stuff`.
* Copy over each item into the new array, *taking care to reorder the elements so that the front
is at index 0*.
* Redirect the `stuff` reference to the new array.
* Reset `front` to be 0.

Now, you can always add the new item to the `back` spot in the `stuff` array,
and increment the `size`.

### Step 2.2 - `public E remove()`

Call the `emptyCheck` method. This will throw an `IllegalStateException`
if the queue is empty.

Save the value in the `front` index of the array.

Increment the value of `front`.

Decrement the value of `size`.

Return the item you stored.

{% include note.html content="Note that we should
always *increment* front with the caveat that our new value might exceed the length
of the stuff array. Use modular arithmetic to ensure that front will always
be a valid index." %}

### Step 2.3 - `public E element()`

Call the `emptyCheck` method. This will throw an `IllegalStateException`
if the queue is empty.

Return the item in the `front` spot of the `stuff` array.

### Step 2.4 - `public int size()`

Return the `size` field.

### Step 2.5 - Testing

Run the `ArrayQueueTest` suite, and ensure your above methods are passing
these tests.

{% include important.html content="Your code needs to be efficient in terms of the space used. You should
treat your array of elements as a circular array, and only resize the
array when all positions are full of valid elements in the queue." %}

### Step 2.6 - GUI

Run the GUI to interact with your code.

## Step 3 - Evaluation

Create 10 mazes of size 30x30 and for each maze, record the number of visited
nodes as a percentage of the total
number of open spaces in the initial maze.

Use this data to compare the Stack (from your previous lab) versus Queue search strategies. Does
either strategy have any clear strengths or weaknesses?

## What to Hand In

Submit your ListQueue.java and
ArrayQueue.java implementations via Teams, along with a document for your
evaluation in Step 3.

## Grading

* To earn a 8, complete Step 1
* To earn a 16, do the above and Step 2
* To earn a 20, do the above and Step 3
