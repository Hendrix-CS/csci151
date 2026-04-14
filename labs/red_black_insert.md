---
layout: work
type: Lab
num: 11
worktitle: Red-Black Trees
---

## Overview

In this lab, we will implement rotations for Binary Search Trees and use them to implement the insertion
operation for Red-Black Trees.

## Materials

* IntelliJ
* Lab Partner

## Setup

1.  Download the [skeleton](../code/151rbt.zip) for this project.
2.  Unpack the code into a new IntelliJ Java project.

## Description

### Step 1

Run `BinaryTreeApp`. Add a few nodes to the tree. Observe that all the nodes are red,
and the tree is not balanced.

Next, explore the source code. Begin with `RBNode.java`. Observe the following:
* Each node has a color, a key, two children, and a parent.
* The children are of class `RBChild` and the parent is an `RBParent`. These two data types 
  are **sentinels**, so that we can avoid `null` pointers.
* Next, look over the `Leaf` class. See how it implements the `RBChild` interface.
* Then, look over the `RedBlackTree` class. See how it implements the `RBParent` interface.
* Now examine `RBChild` anew, paying careful attention to how it implements both interfaces.

**Explain to the instructor or TA how the `Leaf`, `RedBlackTree`, and `RBNode` classes interact.**

### Step 2

Read over `RBNode` again, paying careful attention to the methods that contain the word `assert` in
the title.

**Explain to the instructor or TA the properties of binary search trees in general or red-black trees in particular that are enforced by each assertion.**

### Step 3

Read over `RBNode` again, paying careful attention to the methods you are required to implement.

Pull out your flowchart and another piece of paper. On the separate piece of paper, write down which
aspects of the flowchart are handled by each method you are required to implement.

**Explain your understanding of the relationship between the flowchart and the code to the instructor or TA.**

### Step 4

Implement red-black tree insertion by completing **all** required methods. Test your code using both the GUI 
and the randomized-tree unit test. Once your code passes the randomized-tree unit test:
**Show the instructor or TA the passing test result, and also show your visualized tree in the GUI.**

