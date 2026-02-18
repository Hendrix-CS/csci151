---
layout: work
type: Algorithm
worktitle: <span style="color:red">Red</span>-<strong>Black</strong> Trees
---

{% include note.html content="The sibling of a parent node will be referred to as a *pibling*." %}

## Invariants

1. Every node is either <span style="color:red">red</span> or **black**.
2. The root node is **black**.
3. Both children of a <span style="color:red">red</span> node are **black**. (assume null children are **black**)
4. For each node, all paths to descendant leaves contain the same number of **black** nodes.

## Insertion

*	Perform a binary-search-tree insertion to add the node. Call the node X.
*	Color node X <span style="color:red">red</span>.
*	Cases:
    1. *X is the root node?*
        * Color X **black**.
    2. *Parent is <span style="color:red">red</span>*?
        1. Color grandparent <span style="color:red">red</span>.
        2. *Pibling is <span style="color:red">red</span>?*
            1. Color parent and pibling **black**.
            2. X now refers to the grandparent, and repeat the Cases section.
        3. *Pibling is **black**?*
            1. *X is left-child and parent is right-child? (zig-zag)*

                1. Color X **black**.
                2. Rotate right on parent.
                3. Rotate left on grandparent.
            2. *X is right-child and parent is left-child? (zag-zig)*

                1. Color X **black**.
                2. Rotate left on parent.
                3. Rotate right on grandparent.       
            3. *X and parent are both left children? (zig-zig)*

                1. Color parent **black**.
                2. Rotate right on grandparent.
            4. *X and parent are both right children? (zag-zag)*

                1. Color parent **black**.
                2. Rotate left on grandparent.


Adapted from Chapter 13 of *Introduction to Algorithms, 2nd Edition* by Cormen, Leiserson,
Rivest, and Stein, and [notes of unknown provenance](http://mainline.brynmawr.edu/Courses/cs246/spring2016/lectures/16_RedBlackTrees.pdf).