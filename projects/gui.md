---
layout: work
type: Project
num: 2
worktitle: JavaFX GUIs
---

## Overview

In this project, you will create a program with a Graphical User
Interface (GUI) built using JavaFX and Scene Builder.

## Materials

-   IntelliJ, JavaFX and SceneBuilder
-   **This project must be completed independently, without a partner**
-   [Java 17 API](https://docs.oracle.com/en/java/javase/17/docs/api/index.html)
-   [JavaFX Layout Tutorial](https://www.vojtechruzicka.com/javafx-layouts-basic/)
-   [JavaFX API](https://openjfx.io/javadoc/17/)
<!-- -   [Sample Pig Game Project](../code/151-pig.zip) -->

## Description

Write a Java Application. Your program can be anything you like, subject
to the following requirements

-   You must incorporate a GUI built with JavaFX and SceneBuilder.
-   At least two of the GUI components should have event handlers that
    produce visible changes in the GUI.
-   The GUI should have some **persistent state** that is modeled by a class
    of your own creation. The class should represent an abstraction of
    the underlying data representation.
-   The program should do something useful or interesting. It need not
    be complex, but it should be something that someone would
    conceivably want to use.

Feel free to use the [Java 17 API](https://docs.oracle.com/en/java/javase/17/docs/api/index.html) as a reference for any
piece of Java you might need.

## Helpful Hints

This project requires the use of a *persistent state*, as did Project 1, to
record information. The TipCalculator app from Lab 6 did not require a persistent
state, while the ButtonClicker app used an `int` in the controller to remember
state. You will need to use a *class* for your state for full credit on this project.

For this project, try not to think to big, keep your expectations reasonable, this is
the first time you will be creating a JavaFX GUI application by yourself and it will
take effort to get all the GUI pieces working correctly. Work early and often!

Your idea for a project will most likely involve using components that were not discussed in Lab 6. Please investigate what is possible in the
[JavaFX API](https://openjfx.io/javadoc/17/) to see what is available.

One option for a project would be to base your code on one of the Homework classes (Garden, TootsiePop, Toaster).

Alternately, some students have found success revisiting their Project 1 classes and modifying them to use a GUI instead of command line text input.

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

Submit a zip file containing your whole project via Teams, and an
evaluation document detailing the intent of your application, any unique
and interesting features in your application, and any joys or struggles
you encountered in creating your application.

## Grading

|Criteria|Score|
||----|:---:|
|Incorporates a GUI built with JavaFX and SceneBuilder       |      **5**  |    
|At least two of the GUI components have event handlers that visibly change the GUI |   **15** |     
|The GUI has persistent state modeled by a pertinent class of the student’s creation, representing an abstraction of the underlying data representation.  | **20**      |
|Works as intended   |   **15**     |
|Is something that someone would conceivably want to use     |         **5**  |     
|Evaluation document adequately describes the project  |   **5**       |
|Exhibits creativity and has some interesting features        |    **10**   |   
|**Total**        |   **75**|