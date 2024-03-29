# Red-Black Trees

Adapted from Chapter 13 of *Introduction to Algorithms, 2nd Edition* by Cormen, Leiserson,
Rivest, and Stein

## Rules

1. Every node is either red or black.
2. The root node is black.
3. Both children of a red node are black.
4. For each node, all paths to descendant leaves contain the same number of black nodes.

## Insertion
1.	Perform a binary-search-tree insertion to add the node. Call the node K.
2.	Color the node Red.
3.	Cases:
    1.	Parent(K) is Black. No violations – we are done.
    2.	Parent(K) is Red. We violate Rule 3 above. 
        1.	Parent(K) is a left child. Let S be the right child of Parent(Parent(K)).
            1.	If S is Black or does not exist
                1.	If K is a right child
                    1.	Let K = Parent(K)
                    2.	Left-Rotate the new K
                2.	Set Parent(K) to Black
                3.	Set Parent(Parent(K)) to Red
                4.	Right-Rotate Parent(Parent(K))
            2.	If S is Red
                1.	Set Parent(K) to Black
                2.	Set S to Black
                3.	Set Parent(Parent(K)) to Red
                4.	If Parent(Parent(K)) is in violation, let K=Parent(Parent(K)) and repeat the above
        2.	Parent(K) is a right child. Let S be the left child of Parent(Parent(K)).
            1.	If S is Black or does not exist
                1.	If K is a left child
                    1.	Let K = Parent(K)
                    2.	Right-Rotate the new K
                2.	Set Parent(K) to Black
                3.	Set Parent(Parent(K)) to Red
                4.	Left-Rotate Parent(Parent(K))
            2.	If S is Red
                1.	Set Parent(K) to Black
                2.	Set S to Black
                3.	Set Parent(Parent(K)) to Red
                4.	If Parent(Parent(K)) is in violation, let K=Parent(Parent(K)) and repeat the above
4.	Set root to Black	
