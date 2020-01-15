---
layout: work
type: Lab
num: 10
worktitle: Binary Search Trees
---

## Overview

In this lab, we will implement a Binary Search Tree and visualize the
processes of insertion, deletion, and rotation.

## Materials

-   IntelliJ
-   Lab partner

## Setup

1.  Download the [skeleton](../code/binarySearchTrees.zip) for this
    project.
2.  Unpack the code into a new IntelliJ Java project.

## Description

We can efficiently store information with arrays and linked lists, but
determining if an element is present could take a linear search through
each element if the data is not sorted. At best, sorting will take *O(n
log n)*, and so we explore an alternative here which incorporates the
idea of binary search into a linked structure of nodes.

Our items to be stored and compared in this lab will be strings. For
testing purposes, I recommend using single letters as entry, however,
full words can also be used.

Methods that remain to be implemented in the `TreeNode` class have been
marked with TODO for easy identification.

## Step 1: `insert()` and `contains()`

Complete the `insert()` and `contains()` methods in the `TreeNode`
class. The test case `BinarySearchTreeTester.test1()` should pass if
your solutions are correct.

## Step 2: Tree Statistics and Visualization

Complete the `height()`, `size()`, `getMin()`, and `getMax()` methods in
the `TreeNode` class. Then run `BinaryTreeApp`. As you add nodes to your
tree, you should see the statistics updated on the left. Make sure the
values are correct by experimenting with different tree structures.

## Step 3: Traversals

Complete the `preOrder()`, `postOrder()`, and `inOrder()` methods in the
`TreeNode` class. The parameter is a `Consumer` object that performs an
operation on each value. They should pass their unit tests, and also you
can test them in `BinaryTreeApp`.

## Step 4: Deletion

Implement the `remove()` method. Note that it does not return the
removed node; it returns the node upon which it was invoked, and
rebuilds the tree as it exits from its recursive calls. Follow the
comments carefully. It should pass its unit tests and again is testable
on the GUI, by clicking on nodes you wish to remove.

## Step 5: Rotations

Implement left and right rotations. When correct, they should pass their
unit tests, and you can also test them in the GUI by clicking on the
node that you wish to rotate. As with `remove()`, these methods return
the rebuilt tree nodes.

## Step 6: Evaluation

Create trees with 3, 7, and 15 nodes. First, create a balanced tree.
Next, erase the tree and create a degenerate tree that is completely
linear. Then, use rotations to transform each linear tree into a
balanced tree. Record in your evaluation document the number of
rotations you needed to perform to balance each tree. Discuss how you
identified the need for a rotation when examining each tree.

Also answer the following questions about the deck of cards we have employed for
visualizing binary search trees:

1.  Describe a situation in class when the deck of cards was useful in
    helping you understand the algorithms of binary search trees.
2.  Describe a situation in lab when the deck of cards was useful in
    debugging your implementation of binary search trees.
3.  Did any parts of the graphic design of the cards confuse or obscure
    their purpose?

## What to Hand In

Submit `TreeNode.java` as well as your evaluation document.

## Grading

* To earn a 6, complete Step 1
* To earn a 9, do the above and Step 2
* To earn a 11, do the above and Step 3
* To earn a 14, do the above and Step 4
* To earn a 16, do the above and Step 5
* To earn a 20, do the above and Step 6
