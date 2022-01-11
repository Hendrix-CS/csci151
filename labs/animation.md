---
layout: work
type: Lab
num: 6
worktitle: JavaFX and Animation
---

## Overview

In this lab, we learn how to create GUI components for an animated application
using JavaFX.

## Materials

-   IntelliJ
-   Lab partner
-   [Scene Builder](http://gluonhq.com/products/scene-builder/)

## Description

To create an application using JavaFX, we will need a number of pieces.
There will often be a Model, View, Controller, and Application. For our
animation example we will deconstruct and augment a bouncing ball demonstration.

## Step 1 - Animation

1.  Download the [skeleton](../code/animationdemo.zip) for the next two steps.
2.  Unpack the code into a new IntelliJ Java project.

In this demo, you will find a `Ball` class, the Model portion of our application,
that controls a bouncing ball in a javafx `Pane`.
Our FXML view consists of a `BorderPane` with a `Pane` in the center.
The `DemoController` class
coordinates between the events collected in the `Pane` view and the `Ball` model.

Run the GUI to see 5 balls drawn and move on the pane with random directions and
speeds. When you select a ball, it will change color to red and stop moving. You can
drag the ball to a new location. When you drop the ball, it will turn blue and
start moving again.

## Step 2 - Animation Extensions

Now you will make additions to this demo, to solidify your understanding
of GUI applications and learn the particulars of animation.

### Step 2.1

Add two Buttons to the GUI that will Start and Stop the AnimationTimer. You will
need to add two functions to the DemoController with @FXML annotations, and map
the buttons to these functions. These functions should call `clock.start()` and
`clock.stop()` respectively.

### Step 2.2

Allow the `Pane` in DemoController to accept MousePressed events. When the
pane is pressed, call the `makeCircle` method. You will notice that new balls
appear! However, they also appear when you try to pick up and move the
other balls. To prevent this, both of the MousePressed callback methods will need
to consume the events they handle, through calling `event.consume()`.

### Step 2.3

Augment the Movement private class to slowly grow and shrink the
balls. First, you should add a `setRadius(double radius)` method to the `Ball`
class that sets the radius. Then, add in two fields to the private `Movement` class,
one for the current `radius`, initialized at 25, and one called `dr` for the rate of change,
initialized at 0.1. In the for loop, set the radius of each `Ball` b to the current
radius. Following the for loop, add the following lines:

<!-- -->


    radius += dr;
    if (radius > 40 || radius < 25) {
        dr *= -1;
    }

### Step 2.4

Make one more alteration to the AnimationDemo project, of your choice.

### Step 3

SOMETHING MORE!!!

## What to Hand In

Create a zip file of your edited AnimationDemo project. Submit the zip via Teams.

## Grading

* To earn a 5, complete Steps 1
* To earn a 12, do the above and Step 2
* To earn a 20, do the above and Step 3