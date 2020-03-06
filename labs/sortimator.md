---
layout: work
type: Lab
num: 8
worktitle: The Sortimator
---

## Overview

In this lab, we will implement multiple sorting algorithms and compare
their perfomance.

## Materials

-   IntelliJ
-   Lab partner

## Setup

1.  Download the [skeleton](../code/151sortimator.zip) for this project.
2.  Unpack the code into a new InteliJ Java project.
3.  Add in the JUnit and JavaFX libraries to your project settings if necessary.
4.  Run the Sortimator.java file in the `sorting.gui` package and verify
    that the GUI is displayed.
5.  Click the Scramble and then Sort buttons to watch an animation of
    the GnomeSort algorithm.

## Step 1 - GnomeSort

Take a look at the code inside `GnomeSorter.java`. This is an example
algorithm demonstrating elements that you should use in your
implementations below. Each algorithm below will need to implement the
`sortAlgorithm` method, which brings in an `ArrayList` to be sorted.

First, we can access the elements in the list with the `get` method, and
determine its size with the `size` method. However, notice that we do
not use the `set` element of the list. Instead, we call our own `set`
method, which takes the list to be set, the index that will be set, and
the element to set in the index location. This roundabout method is used
to assist with the animation.

{% include important.html content="You will need to use this
roundabout `set` method in all of
your implementations." %}

Next, since we have an `ArrayList` of generic elements, we need to call
the `compareTo` method. This will return an integer, equal to 0 if the
two elements are the same, negative if first is smaller than the second,
and positive if the first is larger than the second, according to
whatever ordering scheme is defined. We will want our resulting array to
be sorted from smallest to largest.

{% include note.html content="There is a swap going on in this algorithm. You might
consider implementing a `swap` method as you code below to make your life
easier." %}

## Step 2 - InsertionSorter

Your first sorting algorithm to implement is Insertion Sort. You will be
incrementally placing elements into a sorted array.

Create a new class called `InsertionSorter`. To fit into the Sortimator
hierarchy, it will need to extend the generic `Sorter` class. Also, the
generic type `E` will need to extend the `Comparable` interface. The
name of your class should be

`InsertionSorter<E extends Comparable<E>> extends Sorter<E>`

### Step 2.1 - Implementation

InsertionSort can be implemented with the following algorithm.

-   For each element in the list
    -   If the current element is smaller than the element to its left,
        swap them.
    -   Until you stop making swaps, repeat this check for the next two
        elements to the left.

### Step 2.2 - Testing

Run your code through the `SorterTester` suite to make sure your
implementation has the correct behavior.

## Step 3 - BubbleSorter

Bubble sort is known for its simplicity of code. Repeated passes through
the data quickly push the largest elements to the end, and slowly drag
the smallest elements to the front of the list.

The name of your class should be

`BubbleSorter<E extends Comparable<E>> extends Sorter<E>`

### Step 3.1 - Implementation

BubbleSort can be implemented with the following algorithm.

* Scan through the whole list from left to right.
* When you find elements out of order, swap them into correct order.
* If any elements were found out of order during this scan, repeat.

To save time, each scan can reduce the elements it examines by one,
since on the first pass, we can guarantee that the highest element
will be in the right location, and on the second pass, the second-highest
element will be in the right location, etc.

### Step 3.2 - Testing

Run your code through the `SorterTester` suite to make sure your
implementation has the correct behavior.

## Step 4 - MergeSorter

MergeSort uses recursion to repeatedly split the given list into
smaller lists, sort the smaller lists, and then combine the sorted
sublists into one sorted list.

The name of your class should be

`MergeSorter<E extends Comparable<E>> extends Sorter<E>`

### Step 4.1 - Implementation

First, you will need to create a
`mergeSortHelper(ArrayList<E> array, int start, int end)` method. In order to
do recursion, we will need to track the `start` and `end` indices of our
sublists. The `start` and `end` should be additional parameters along with
the list. Use `end` as we have in other contexts, to be the stopping
index, going up to but not including this index.

So, our sortAlgorithm will call the `mergeSortHelper` method with
`start` as 0 and `end` as the size of the list.

`mergeSortHelper` has the following structure:

-   If the `start` and `end` are at least one element apart
    -   Find the `midpoint` index between `start` and `end`. The `midpoint`
        index should divide `start` and `end` in half.
    -   Call `mergeSortHelper` recursively twice; once on the first half
        of the array, and once on the second half. Use the `start`, `end`,
        and `midpoint` indices to structure the recursive calls properly.
    -   Merge together the two sorted subarrays.

To complete this method, we need a `merge(ArrayList<E> array, int start, int end)` method.
The most straightforward implementation
involves the use of either `ArrayQueue` or `ListQueue` from [Lab 5](maze-bfs.html):

-   Add each element of the first half of the array into a queue.
-   Add each element of the second half of the array into a different
    queue.
-   For each element of the array
    -   if the second queue is empty, or if the first queue is not empty
        and its `element()` value is less than or equal to the `element()`
        value of the second queue, remove the value from the first
        queue and store it at this location in the array with `set`.
    -   Otherwise, remove the value from the second queue and store it
        at this location in the array with `set`.

### Step 4.2 - Testing

Run your code through the `SorterTester` suite to make sure your
implementation has the correct behavior.

## Step 5 - QuickSorter

Whereas MergeSort was an easy journey down the recursion but complicated
merging back up, QuickSort reverse this scheme. Before recursing,
QuickSort partitions the elements of the list, hopefully into two
equal-sized portions, placing the elements smaller than a randomly
chosen pivot element to the left and those elements larger to the right.
These sublists will be semi-sorted, and then repeatedly partitioned
until all elements are in the correct order.

The name of your class should be

`QuickSorter<E extends Comparable<E>> extends Sorter<E>`

### Step 5.1 - Implementation

Again, we will need a recursive helper function, augmenting with the
start and end of the sublist. `quickSortHelper(ArrayList<E> array, int start, int end)`
has the following structure:

-   If the `start` and `end` are at least one element apart
    -   Partition the elements
    -   Recursively apply `quickSortHelper` to the partitioned subarrays

The `partition(ArrayList<E> array, int start, int end)` method should have the
same parameters as the `quickSortHelper` method.

-   Select the last element of the subarray as the `pivot` element.
-   Initialize a variable to track the total number of elements smaller
    than the `pivot`.
-   For each subarray element prior to the `pivot`:
    -   If the element is less than the `pivot`:
        -   Swap it so that it winds up early in the subarray, by using
            the total number of smaller elements we have seen so far to
            determine its destination index.
        -   Increase by one the number of total elements seen that is
            smaller than the `pivot`.
-   Calculate the final position of the `pivot` using the total number of
    elements smaller than it.
-   Move the `pivot` to that final position, and then return that final
    position, as it represents the division point between the subarrays
    that must now be recursively sorted.

{% include note.html content="To speed up your algorithm, avoid making swaps when the two locations
being swapped are the exact same index." %}

### Step 5.2 - Testing

Run your code through the `SorterTester` suite to make sure your
implementation has the correct behavior.

## Step 6 - Evaluation

Describe in your own words the strengths and weaknesses of each of the
four implementations above. Use the `Sortimator` class to run each
algorithm 3 times, on a list of size 20. Record the number of Array
Updates that each method executes, as found through the GUI.

## What to Hand In

Submit your `InsertionSorter.java`, `BubbleSorter.java`, `MergeSorter.java` and
`QuickSorter.java` implementations, along with a document for your
evaluation in Step 6.

## Grading

* To earn a 4, complete Step 1 and 2
* To earn a 8, do the above and Step 3
* To earn a 12, do the above and Step 4
* To earn a 16, do the above and Step 5
* To earn a 20, do the above and Step 6
