---
layout: work
type: Lab
num: 4
worktitle: Mazes - Depth First Search
---

## Overview

In this lab, we will implement generic version of the Queue
data type within the context of searching a maze.

## Materials

-   IntelliJ
-   Lab partner

## Setup


1.  Download the [skeleton](../code/mazelabqs.zip) for this project.
2.  Unpack the code into a new IntelliJ Java project.

## Description

In Lab 3, we explored searching a maze for a goal using a stack to
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
strategy, you will see a list of implementations available.
You will find the starter code for the ArrayStack included in the
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

## ArrayStack ????

Our first task is to implement a generic Stack class that can be used in many
pieces of the code, for generating and then solving mazes.

### Step 5 - Creating Random Mazes

Uncomment code labeled for this portion in

-   MazeController

First, you will be creating random mazes by implementing the
tunnelRandomly function. You will use the randomDirections method of
Direction.

#### `public void tunnelRandomly()`

Create a stack of Positions, and push (0,0) onto the stack.

While the stack still has Positions:

-   Pop the top Position from the stack.
-   If this Position is in the maze and is filled, and if this Position
    has no more than one open neighbor,
    -   Clear this position
    -   Add the neighbors to the stack in a **random** order.

![](../images/mazegui5.png)

### Step 6 - Solving Mazes

Uncomment code labeled for this portion in

-   Trail
-   PuzzleTest
-   MazeController

Finally, you will write an algorithm to solve a maze with the solve
method.

#### `public Trail solve()`

If there is no Explorer in the maze or no Goal in the maze, then return
null.

Create a stack of Trails, and push the Trail starting at the Explorer's
position onto the stack.

While the stack still has potential Trails, and you have not reached the
goal:

-   Pop the top Trail from the stack.
-   If the Trail end is the goal Position, return this Trail
-   If the Cell in the Maze at the Trail end is OPEN
    -   Mark it as a VISITED Cell
    -   Add new Trails based on this Trail for each of the neighbors to
        the stack.

## Step 1 - ListNode\<E\>

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

## Step 2 - ListStack\<E\>

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

## What to Hand In

Submit your Maze.java, Puzzle.java, Direction.java and Move.java
implementations, along with any additional files you created for your
implementations.

## Grading


* To earn a 3, complete Step 1
* To earn a 10, do the above and Step 2
* To earn a 14, do the above and Step 3
* To earn a 17, do the above and Step 4
* To earn a 20, do the above and Step 5


  Cumulative Progress                                                              Points Earned
  -------------------------------------------------------------------------------- ---------------
  Step 1                                                                           8
  Step 2                                                                           10
  Step 3                                                                           13
  Step 4                                                                           15
  Step 5                                                                           17
  Step 6                                                                           19
  Finish all six steps and submit a screenshot of a 20x20 maze you have created.   20
