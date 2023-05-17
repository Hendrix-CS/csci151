---
layout: work
type: Project
num: 3
worktitle: JavaFX Animation
---

## Overview

In this project, you will create a program with a Graphical User
Interface (GUI) and animation built using JavaFX and Scene Builder.

## Materials

-   IntelliJ, JavaFX and SceneBuilder
-   **This project must be completed independently, without a partner**
-   [Java 19 API](https://docs.oracle.com/en/java/javase/19/docs/api/index.html)
-   [JavaFX Layout Tutorial](https://www.vojtechruzicka.com/javafx-layouts-basic/)
-   [JavaFX API](https://openjfx.io/javadoc/17/)
<!-- -   [Sample Pig Game Project](../code/151-pig.zip) -->

## Description

Write a Java Application. Your program can be anything you like, subject
to the following requirements

-   You must incorporate a GUI built with JavaFX and SceneBuilder.
-   At least one of the GUI components should have an event handler that
    produces visible changes in the GUI.
-   The program should include an interactive animation that makes use of the
    various Shape classes.  
-   The GUI should have some **persistent state** that is modeled by a class
    of your own creation. 
    - The `Controller` should have an instance of this class as one of its attributes.    
    - The class should represent an abstraction of the underlying data representation. 
    - The class should have a central data structure as one of its attributes, used in a manner pertinent to the application and suitable to the data structure.
    - The central data structure can be an array, linked list, `PriorityQueue`, `ArrayList`, `Stack`, or `ArrayDeque`.
-   The program should do something useful or interesting. It need not
    be complex, but it should be something that someone would
    conceivably want to use.

Feel free to use the [Java 19 API](https://docs.oracle.com/en/java/javase/19/docs/api/index.html) as a reference for any
piece of Java you might need.

## What to Hand In

Submit a zip file containing your whole project via Teams, and an
evaluation document detailing the intent of your application, any unique
and interesting features in your application, and any joys or struggles
you encountered in creating your application.

## Grading

To **Partially Complete** this project, your project must 
* incorporate a GUI built with JavaFX and SceneBuilder,
* be free of syntactic errors preventing compilation,
* include at least one GUI component with event handlers that visibly change the GUI, 
* use an interactive animation that makes use of the various Shape classes, and                  
* the GUI has persistent state modeled by a pertinent class of the student’s creation, representing an abstraction of the underlying data representation.
  * the `Controller` has an instance of this class as an attribute.
  * the class uses an array, linked list, `PriorityQueue`, `ArrayList`, `Stack`, or `ArrayDeque` in a useful and pertinent way.

To **Complete** this project, the project must, 
* work as intented (no bugs or missing elements)
* be something that someone would conceivably want to use,
* exhibit some creativity and have some interesting features, and
* include an evaluation document that:
  * adequately describes the project;
  * discusses how data is incorporated into and retrieved from its central data structure;
  * correctly states the asymptotic time complexity of each operation invoked on the central data structure;
  * discusses why, in light of the time complexity of those operations, the data structure is a good choice for the application.
  