---
layout: work
type: Project
num: 1
worktitle: Arrays
---

## Overview

In this project, you will create a useful program with Java. Subject to
a few requirements, you can do whatever you like, although there are a
few suggestions below if you have trouble coming up with something on
your own.

## Materials

-   IntelliJ
-   **This project must be completed independently, without a partner.**
-   [Java 21 API](https://docs.oracle.com/en/java/javase/21/docs/api/index.html)

## Description

Write a Java application. Your program can do anything you like, **except TicTacToe**, subject to the following requirements:

-   You must use Java, with input and output in a `Main` class.
-   You must use an array somewhere in your program.
-   Your program should use at least one class besides `Main`.
-   The program should do something useful, interesting, or fun. It need
    not be complex, but it should be something that someone would
    conceivably want to use.

Feel free to use the [Java 21
API](https://docs.oracle.com/en/java/javase/21/docs/api/index.html) as a
reference for any piece of Java you might need; you are not restricted
to only things we have covered in class. You may incorporate any code
you wish from previous projects, but the majority of your project should
be new code.

## Suggestions

Here are a few suggestions to get you thinking, if you need them. Even
if you choose one of these suggestions, you do **not** have to do it
exactly as described (in fact, you shouldn't!).

**Nim.** Write a program to play the game of Nim (either human vs.
human, or human vs. computer). This classic game starts with some number
of piles of (counters, coins, beans, whatever). On your turn you must
choose one of the remaining piles, and take anywhere from one counter up
to all the counters in that pile. However, you may only take counters
from a single pile on each turn. The winner is whoever takes the very
last counter. Here is what part of an imaginary run of your program
**might** look like:

    A ***     (3)
    B ******* (7)
    C *       (1)
    D         (0)
    E ****    (4)

    Your move? A5
    You can't take that many counters from pile A!  Try again.
    Your move? E3

    A ***     (3)
    B ******* (7)
    C *       (1)
    D         (0)
    E *       (1)

**Water Jugs.** Reimplement the [Water Jug game from CSCI
150](http://hendrix-cs.github.io/csci150/labs/waterjug.html) in Java.

**Connect 4.** Implement a classic grid-based two-player
game such as Connect 4.

**Game of Life or other cellular automaton.** Implement the classic
[Game of Life](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life),
or some other cellular automaton.

## Academic Integrity

As a reminder:

-   You **may** consult online resources (Java tutorials, StackOverflow
    questions, ...), and you may even use snippets of code you find
    there, but you **must** clearly cite them in your project, by adding
    a comment with the URL of the resource you used along with a short
    explanation of how you used it.
-   You **may** discuss your project with other students in the class,
    but you **may not** look at another student's code, or share your
    code with another student. If you need help debugging your code, see
    an instructor or a TA.

## What to Hand In

Submit a zip file via Teams containing

-   your **whole project**, along with
-   an **evaluation document** detailing the intent of your application,
    any unique and interesting features in your application, and any
    joys or struggles you encountered in creating your application.

## Grading

To receive **Level 1 Credit** for this project, your project must 
* be free of syntactic errors preventing compilation,
* have a `Main` class that:
  * receives input from the keyboard and
  * displays text output on the screen,
* use an array, and                                                    
* use at least one class besides `Main` that has a natural mapping to the problem 
  domain.

To receive **Level 2 Credit** for this project, the project must, 
* work as intented (no bugs or missing elements)
* correctly instantiate an object of a class besides `Main`,
* be something that someone would conceivably want to use,
* use named constant values, enums, or computed values rather than magic numbers,
* exhibit some creativity and have some interesting features, and
* include an evaluation document that adequately describes the project.
