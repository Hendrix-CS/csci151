---
layout: work
type: Lab
num: 9
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
animation example we will deconstruct and augment a bouncing ball demonstration,
then apply these lessons to make a rocket launch and land.

## Animation Demonstration

1.  Download the [skeleton](../code/animationdemo.zip) for the next two steps.
2.  Unpack the code into a new IntelliJ Java project.

In this demo, you will find a `BouncyBall` class, the Model portion of our application,
that controls a bouncing ball in a javafx `Pane`.
Our FXML view consists of a `BorderPane` with a `Pane` in the center.
The `DemoController` class
coordinates between the events collected in the `Pane` view and the `BouncyBall` model,
and the `BouncyBallView` class projects the `BouncyBall` on the screen.

Run the GUI to see 5 balls drawn and move on the pane with random directions and
speeds. When you select a ball, it will change color to red and stop moving. You can
drag the ball to a new location. When you drop the ball, it will turn blue and
start moving again.

## Step 1 - Animation Extensions

Now you will make additions to this demo, to solidify your understanding
of GUI applications and learn the particulars of animation.

### Step 1.1

Add two Buttons to the GUI that will Start and Stop the AnimationTimer. You will
need to add two functions to the DemoController with @FXML annotations, and map
the buttons to these functions. These functions should call `clock.start()` and
`clock.stop()` respectively.

### Step 1.2

Allow the `Pane` in DemoController to accept MousePressed events. When the
pane is pressed, call the `makeBouncyBall` method. You will notice that new balls
appear! However, they also appear when you try to pick up and move the
other balls. To prevent this, both of the MousePressed callback methods will need
to consume the events they handle, through calling `event.consume()`.

### Step 1.3

Augment the `Movement` private class to slowly grow and shrink the
balls. First, you should add a `setRadius(double radius)` method to the `BouncyBall`
class that sets the radius. Then, add in two fields to the private `Movement` class,
one for the current `radius`, initialized at 25, and one called `dr` for the rate of change,
initialized at 0.1. In the for loop, set the radius of each `BouncyBall` b to the current radius. Following the for loop, add the following lines:

<!-- -->


    radius += dr;
    if (radius > 40 || radius < 25) {
        dr *= -1;
    }

### Step 1.4

Make one more alteration to the AnimationDemo project, of your choice.

### Step 2 - Rocket Launcher

Now, you will add an animation to an existing JavaFX program.

1.  Download the [skeleton](../code/RocketLauncher.zip).
2.  Unpack the code into a new IntelliJ Java project.

Notice again the `View` classes that have been created for each of the
model components. Spend some time browsing the `CanisterView` and `RocketView`
classes to see how they simplify the process of updating the GUI when your
model changes.

Test out the application. Right now, the rocket will immediately go into space when
Blast Off is clicked, and go back to the ground immediately when Launch is clicked.

Your job is to replace this with a slow animation, altering and adapting the code
from the animation demonstration above. Below is a rough guide, it is vague on purpose, I would like you to explore and work with your partner to devise a good solution to this step.

I recommend you start by deleting the if/else in the beginning of `update` in `RocketView`. Copy in the `Movement` class to the controller, and start slicing it up. It will be helpful to store a speed for the rocket, and a current Y value for the rocket, so you can update these variables in the `handle` loop. Be sure to make the buttons inactive while the rocket is moving.

## What to Hand In

Create a zip file of your edited AnimationDemo project. Submit the zip via Teams.
Create a zip file of your edited RocketLauncher project. Submit the zip via Teams.

## Grading

* To **Partially Complete** this lab, complete Step 1.
* To **Complete** this lab, do the above and complete Step 2.
