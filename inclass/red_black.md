---
layout: work
type: Algorithm
worktitle: <span style="color:red">Red</span>-Black Trees
---

{% include note.html content="The sibling of a parent node will be referred to as a *pibling*." %}

## Invariants

1. Every node is either <span style="color:red">red</span> or **black**.
2. The root node is **black**.
3. Both children of a <span style="color:red">red</span> node are **black**. (assume null children are **black**)
4. For each node, all paths to descendant leaves contain the same number of **black** nodes.

## Insertion

1.	Perform a binary-search-tree insertion to add the node. Call the node X.
2.	Color node X <span style="color:red">red</span>.
3.	Cases:
    1. *X is the root node?*
        1. Color is **black**.
    2. *Both parent and pibling are <span style="color:red">red</span>?*
        1. Color parent and pibling **black**.
        2. Color grandparent <span style="color:red">red</span>.
        3. X is now the grandparent, and repeat the Cases section.
    3. *Parent is <span style="color:red">red</span>, pibling is **black**?*
        1. *X is left-child and parent is right-child?*
            1. Color grandparent <span style="color:red">red</span>.
            2. Color X **black**.
            3. Rotate left on parent.
            4. Rotate right on grandparent.
        2. *X is right-child and parent is left-child?*
            1. Color grandparent <span style="color:red">red</span>.
            2. Color X **black**.
            3. Rotate right on parent.
            4. Rotate left on grandparent.       
        3. *X and parent are both left children?*
            1. Color grandparent <span style="color:red">red</span>.
            2. Color parent **black**.
            4. Rotate right on grandparent.
        4. *X and parent are both right children?*
            1. Color grandparent <span style="color:red">red</span>.
            2. Color parent **black**.
            4. Rotate left on grandparent.


Adapted from Chapter 13 of *Introduction to Algorithms, 2nd Edition* by Cormen, Leiserson,
Rivest, and Stein, and [notes of unknown provenance](http://mainline.brynmawr.edu/Courses/cs246/spring2016/lectures/16_RedBlackTrees.pdf).



