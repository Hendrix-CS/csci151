---
layout: work
type: Project
num: 4
worktitle: Final Project
designdue: Friday, April 25
finaldue: Thursday, May 8th, 8:30-11:30am
---

## Description

In this project, you will create a program of your own design,
incorporating elements of data structures in your implementation.

## Materials

-   IntelliJ, JavaFX and SceneBuilder
-   [Java 21 API](https://docs.oracle.com/en/java/javase/21/docs/api/index.html)

## Description

Unlike the other projects, you may work with one partner for the final
project. You can also work individually if you wish.

You have wide latitude in choosing what to do for your final project.
Your program can be anything you like,
subject to the following requirements

-   You must incorporate a GUI built with JavaFX and SceneBuilder.
-   The GUI should have some persistent state that is modeled by classes
    of your own creation.
-   The classes should represent an abstraction of the underlying data
    representation.
-   Your model must incorporate numerous classes and enums in a sensible
    organization. Use the Maze or TicTacToe labs as a goal to strive for
    in your project.
-   You must incorporate a trie, `HashSet`, `HashMap`, `TreeSet`, `TreeMap`, `PriorityQueue`, `Stack`, or `ArrayDeque`
    into your application in a useful and natural way. 

Your project
idea **must** be approved via email or conversation prior to the design submission.
**Get started early!** Waiting until just before
the deadline to start thinking about your final project will be too
late.

## Design

By {{page.designdue}}, you must turn in a design document describing
your project and planning details of how you will implement it.

{% include warning.html content="You should start thinking about, designing, and even
implementing your project before this!" %}

Your design must include:

*   An **overview** of your project and your motivation for choosing this
    topic and the way(s) in which your project creatively goes beyond what
    we have done in class and labs.
*   A **description of the classes** you will use to decompose the
    information in your project, with a list of the variables and
    methods in each class.
*   A discussion of **the data structure you are incorporating**, why you selected it,
    and why the asymptotic time complexity of its operations is a good match for your
    project requirements.
*   A **sketch** of the JavaFX GUI for your project.
*   A **timeline** of steps you will take to complete your project with
    deadlines for each step. Plan not just what you must do but the
    ordering of steps that will allow you to complete by the final
    deadline.

You should be as detailed as possible for full credit in your
description. Time spent on the design will pay off immensely as you
implement your project.

Feel free to use the [Java 21
API](https://docs.oracle.com/en/java/javase/21/docs/api/index.html) as a
reference for any piece of Java you might need.

## What to Hand In

Submit a zip file containing your whole project via Teams, and an
evaluation document detailing how your application changed from your
original submitted design, any unique
and interesting features in your application, and any joys or struggles
you encountered in creating your application.

## Presentation

* You will be presenting your final project to the rest of the students in
the course. 
* The final exam period for this course is {{page.finaldue}}.
* Your presentation should include the following 6 slides:
  * Title slide
    * Name of project
    * Name(s) of students creating the project
  * Project Goals
  * Degree of Achievement of Goals
  * Featured Data Structure
  * Unique/Interesting Features
  * Joys/Struggles encountered creating the application
* After you present your slides, give a demonstration of
  your project. The demonstration should run from 30-60 seconds.
* The presentation as a whole should last about 5 minutes.

## Grading

To achieve **Level 1 Complete**, your project must 
* be structured based on a design document that includes an overview, a description, a sketch, and a timeline,
* incorporate a GUI built with JavaFX and SceneBuilder,
* incorporate at least two original classes or enums,
* be free of syntactic errors preventing compilation,
* include at least one GUI components with event handlers that visibly change the GUI, 
* the GUI has persistent state modeled by a pertinent class of the student’s creation, representing an abstraction of the underlying data representation.

To achieve **Level 2 Complete**, your project must
* incorporate numerous classes and enums in a sensible organization, roughly at the level of the Maze or TicTacToe labs,
* incorporate at least one trie, `HashSet`, `HashMap`, `TreeSet`, `TreeMap`, `PriorityQueue`, `Stack`, or `ArrayDeque`,
* work as intented (no bugs or missing elements)
* be something that someone would conceivabley want to use,
* exhibit some creativity and have some interesting features, and
* include an evaluation document that:
  * adequately describes the project;
  * discusses how data is incorporated into and retrieved from its central data structure;
  * correctly states the asymptotic time complexity of each operation invoked on the central data structure;
  * discusses why, in light of the time complexity of those operations, the data structure is a good choice for the application.
