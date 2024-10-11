---
layout: work
type: Lab
num: 7
worktitle: Mazes - A* Search
---

## Overview

In this lab, we will implement a Heap for performing an intelligent
search of a maze.

## Materials

-   IntelliJ
-   Lab partner

## Setup

1.  Download the [skeleton](../code/maze151astar.zip) for this project.
2.  Unpack the code into a new IntelliJ Java project.

## Description

It is possible to do more than just find a solution trail in a maze. We
now wish to find the minimum length path from the explorer to the goal
state. While the Stack interface would be optimal in space, it was not
guaranteed to find the minimum length trail. The Queue interface
performed better, but at the expense of remembering all possible trails
at a given level.

With a Heap that implements a Priority Queue, we can balance both space
and time in our search. In this lab, we will implement this Heap,
organized to always have the minimum element available in constant time.
If we assign priority in a certain way, we will be implementing [A\*
Search](https://en.wikipedia.org/wiki/A*_search_algorithm), a classic
pathfinding algorithm.

## Step 1 - Parent and Children

Complete the `parent()`, `left()`, `right()`, and `legal()` methods.
Each method has a corresponding test case which will pass with a correct
solution.

## Step 2 - `isHeap()`

We will be implementing a Heap where the **minimum** node will be the
root of the Heap. Our implementation will use an ArrayList to store all
the elements of our Heap. Complete the `isHeap()` method so that it will
check that all of the properties of a Heap are present. Namely, you must
verify that each element is *smaller* than its children elements.

To compare elements, we will be using the
[Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html)
class in Java. You can assume a call to `comparator.compare(t1, t2)` will return -1 if `t1` is 
less than `t2`, 0 if they are equal, and 1 if `t1` is greater than `t2`.

Because of our use of an `ArrayList` to track the elements, we will always assume
that the elements form a Heap that is as compact as possible.

If your implementation is correct, it should pass all four `testIsHeap`
test cases.

## Step 3 - `swap`

Swapping two elements in an array is an extremely common operation, and
useful for both adding and removing elements from a heap. Implement the
`swap()` method, and make sure `testSwap()` passes.

## Step 4 - `element` and `add`

The next method to implement is `element`. This should return the **root**
element, which will always be stored in the first position of the
ArrayList. <!--Make sure to do the `emptyCheck` to throw an exception if there are no elements in the heap.-->

Then, you should implement the `add` method. New elements are added to
the end of the ArrayList, and then filtered up repeatedly when the
element is found to be less than its parent. Use the Comparator object
to calculate if an element is greater or less than another element.

{% include note.html content="Using the `parent` method will help in creating a cleaner
implementation of `add`." %}

Once these methods are implemented, the `testAdd1()` and `testAdd2()`
test cases should pass.

## Step 5 - `hasSmallerChild` and `smallestChildOf`

Each of these methods considers a parent index. The `hasSmallerChild`
method returns `true` if either or both of its children is smaller in 
value than the parent. It returns `false` if the parent's value is smaller 
than both of its children, or if it does not have any children.

The `smallestChildOf` method returns the index of the right child of the
parent if the right child is present and its value is smaller than that
of the left child. Otherwise, it returns the index of the left child.

Once these two methods are implemented the six `testSmallestChild` tests
should all pass.

## Step 6 - `remove`
<!--Make sure to do the `emptyCheck` to throw an exception if there are no elements in the heap.-->
Elements can be removed from the heap through a filtering process
similar to adding to a heap. First, swap the first and last elements.
Next, remove the last element, and save its value to be returned at the
end of the method. The swap could cause a violation of the Heap property
that all parents must be smaller than their children. If the element is
greater than only one of its children, swap these two elements. If the
element is greater than both of its children, swap the smaller of the two
children with the element, so that we don't break the Heap property any
further. Finally, when a swap was made, repeatedly check the subsequent
descendants to guarantee that the Heap property is always preserved.

Once this method is implemented, the `testRemove()` test case should
pass.

{% include note.html content="Using the `hasSmallerChild()` and 
`smallestChildOf()` methods makes it **much** easier to write this method correctly!" %}

## Step 7 - `TrailEstimator`

Our penultimate step is to create the heuristic function for comparing
trails. A `Trail` cannot be properly compared to another trail
without the context of a puzzle. Java lets us compare in another way for
this circumstance. In the `TrailEstimator` class, you will find two
methods. This class is a `Comparator` for the `Trail` objects, which will
have the proper `Puzzle` object available.

The `estimateFor` method should return the length of the given `Trail`,
plus an estimate for the remaining length of the trail. This estimate
should be calculated using the `manhattanDistanceTo` method of the
`Position` class.

The `compare` method will then be able to compare two `Trail` objects,
using using the estimate for each `Trail` calculated in the above method.
Return -1 if the first `Trail` estimate is less than the second, 0 if they
are equal, and 1 if the first `Trail` estimate is greater than the second.

## Step 8 - Evaluation

Compare the new Heap Searcher to the earlier Stack and Queue
implementations. Create 10 random mazes of size 50x50. Now, for each maze and
strategy (Stack, Queue, and Heap), record the number of visited nodes as
a percentage of the total number of open spaces in the initial maze.
Discuss the differences you see between the Stack, Queue, and Heap.

## Grading

* To **Partially Complete** this lab, complete Steps 1, 2, 3, 4, 5, and 6
* To **Complete** this lab, do the above and Steps 7 and 8
