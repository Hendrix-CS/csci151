---
layout: work
type: Lab
num: 5
worktitle: Mazes - Breadth First Search
---

## Overview

In this lab, we will implement generic version of the Queue
data type within the context of searching a maze.

Materials
---------

-   IntelliJ
-   Lab partner

Setup
-----

1.  Download the [skeleton](../code/mazelabqs.zip) for this project.
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
maze with either a depth-first search or breadth-first search.

To start, run the code in MazeApp. After you click on "Randomize", you
should see the GUI layout here.

![](../images/mazegui7.png)

There are a few new pieces to this GUI. First, you will see a way for
you to select a search strategy, either a Stack or a Queue. For each
strategy, you will see a list of implementations available. To start,
you will find the code for the ArrayStack included in the
`maze.searchers` directory.

Second, you will notice that there are statistics in the lower portion
of the GUI, recording the number of OPEN, CLOSED, and VISITED squares.

Third, there is an error box underneath the Solve button, to report when
things go wrong with the underlying implementations. It will also report
the number of steps taken when a solution trail is found through
searching.

This project contains a working implementation of the Maze Lab and
Project, so you do not have to revise any of your earlier code to add
this functionality.

Step 1 - ListNode\<E\>
----------------------

To implement the generic version of a Stack and Queue with nodes, your
first task is to reimplement the Node class to be Generic. All of your
implementations for this lab will be located in the `maze.searchers`
directory.

### Step 1.1 - Implementation

You will first need to create a file called `ListNode.java` that
implements the Node class we discussed. It should have an `E value`, and
a `ListNode next` reference as components, along with get and set
methods for the value and next fields.

While the name of the file is `ListNode.java`, the name of your class
should be `ListNode<E>`.

Step 2 - ListStack\<E\>
-----------------------

We next revise your earlier ListIntStack code to be a generic
implementation.

### Step 2.1 - Implementation

Write a class called `ListStack<E>`. This will need to implement the
`Stack<E>` interface, and have at least a `ListNode<E>` called top as a
field.

Note that there is an additional method to implement. For ListNode
implementations, the `capacity` method should return the size.

### Step 2.2 - Testing

Run the `ListStackTest` suite, and ensure your above methods are passing
these tests.

### Step 2.3 - GUI

Now, run the `MazeApp` class, and test out your code with the GUI. You
should be able to select between the ArrayStack and ListStack
implementations.

Step 3 - ListQueue\<E\>
-----------------------

Now that you are comfortable with generic implementations, write a Queue
using the `ListNode<E>` from Step 1.

### Step 3.1 - Implementation

Your implementation will have two fields as discussed in class, a head
and a tail. Create a new Class, implementing the `Queue<E>` interface
and completing all of the necessary methods.

While the name of the file is `ListQueue.java`, the name of your class
should be `ListQueue<E>`.

### Step 3.2 - Testing

Test out your code with the `ListQueueTest` suite

### Step 3.3 - GUI

Run the GUI to interact with your code. There should be an available
implementation in the Queue section.

Step 4 - ArrayQueue\<E\>
------------------------

Finally, write a Queue using an array-based implementation.

### Step 4.1 - Implementation

Your implementation will have three fields as discussed in class, a head
index field and a size field, plus a generic array of type E elements.
Create a new Class, implementing the `Queue<E>` interface and completing
all of the necessary methods.

While the name of the file is `ArrayQueue.java`, the name of your class
should be `ArrayQueue<E>`.

Your code needs to be efficient in terms of the space used. You should
treat your array of elements as a circular array, and only resize the
array when all positions are full of valid elements in the queue.

The `capacity` of the Array implementations is the length of the array
used to store the elements.

### Step 4.2 - Testing

Verify that your ArrayQueue is working with the `ArrayQueueTest` suite.

### Step 4.3 - GUI

Run the GUI to interact with your code.

## Step 5 - Evaluation

Create 10 mazes of size 30x30 and for each maze and strategy (Stack and
Queue), record the number of visited nodes as a percentage of the total
number of open spaces in the initial maze. You can choose either
implementation for each data type.

Use this data to compare the Stack versus Queue search strategies. Does
either strategy have any clear strengths or weaknesses?

## What to Hand In

Submit your ListNode.java, ListStack.java, ListQueue.java and
ArrayQueue.java implementations, along with a document for your
evaluation in Step 5.

## Grading

  Cumulative Progress   Points Earned
  --------------------- ---------------
  Step 1                5
  Step 2                10
  Step 3                15
  Step 4                17
  Step 5                20
