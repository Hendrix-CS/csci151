---
layout: work
type: Lab
num: 3
worktitle: Mazes - Enums and 2D Arrays
---

## Overview

In this lab, we will write classes encapsulating a 2D array, write
Enums, and test them with JUnit.

## Materials

-   IntelliJ
-   JavaFX
-   Lab partner

## Setup

1.  Download the [skeleton](../code/maze151.zip) for this project.
2.  Unpack the code into a new IntelliJ Java project.
3.  Also download [JavaFX](https://gluonhq.com/products/javafx).
4.  To set up JavaFX:
    -   Select Project Structure from the File menu.
    -   Select Global Libraries.
    -   Press the + sign to add a library. (Select "Java".)
    -   Go to the "lib" directory within JavaFX.
    -   Select all of the \*.jar files within that directory. Click OK.
    -   Rename the library javafx11 instead of javafx-sdk. Then Click
        Apply and OK.
    -   Go back to Project Structure and Global Libraries.
    -   Right-click on javafx11, and select Add to Modules. Click Apply
        and OK.
    -   Try running MazeApp. If a small window appears, everything
        works!

## Description

The puzzles inherent in [generating a
maze](https://en.wikipedia.org/wiki/Maze_generation_algorithm) and
[solving a maze](https://en.wikipedia.org/wiki/Maze_solving_algorithm)
lie at the heart of some very interesting
[problems](https://en.wikipedia.org/wiki/Category:Search_algorithms) in
computer science. Most obvious might be using Google Maps to find
directions from one location to another.

In this lab, you will create the necessary data structures to represent
a maze computationally, allowing a user to wander through the maze
toward a goal. In later labs, we will implement algorithms to generate and solve
mazes.

To start, run the code in MazeApp. After you click on "Reset Maze", you
should see the GUI layout here.

![](../images/mazegui1.png)

The Clear/Fill selection allows a user to manually create a maze on the
screen. This will be completed by you in steps 1 and 2 of this lab, and
augmented in step 3. The Place Explorer and Place Goal selections will
be implemented in step 4, which will also incorporate the movement
buttons Left, Forward and Right, found on the bottom of the screen.
Steps 5 and 6 will implement code for the Randomize and Solve buttons.

There are two important elements already present in the code for this
project

#### Cell

This enum records the state of a Cell in the Maze. A cell can be OPEN,
CLOSED, or VISITED. Each cell knows its color, what state of the cell
should occur when the cell is flipped, and if it can be entered by an
Explorer.

#### Position

This class keeps track of an x and y coordinate. It has an accessor
method for each of these two variables, and can determine if it is
adjacent or equal to another Position.

## Step 1 - Maze

The core storage of the pathways and walls in the maze is in the Maze
class. It holds a 2D array of Cells as the only field.

### Step 1.1 - Implementation

You will need to write code for the following methods.

### Step 1.2 - Testing

Run the `MazeTest` suite, and ensure your above methods are passing
these tests.

## Step 2 - Puzzle

The Puzzle class is our central model for this program. It will hold a
Maze, an Explorer, and a Position to represent the Goal in our maze. In
this step, you will complete the code for interacting with the Maze.

### Step 2.1 - Implementation

You will need to write code for the following methods.

### Step 2.2 - Testing

Run the `PuzzleTest` suite, and ensure your above methods are passing
these tests.

### Step 2.3 - GUI

Now, run the `MazeApp` class, and test out your code with the GUI. You
should be able to select squares and open and close pathways in the
maze.

![](../images/mazegui2.png)

## Step 3 - Avoiding Rooms

We can add a restriction on the ability of the user to create mazes with
large rooms. A room is defined as any four OPEN Cells that form a 2x2
square.

Uncomment code labeled for this step in

-   MazeTest
-   PuzzleTest

### Step 3.1 - Direction

You will add the implementations for the `getClockwise`,
`getCounterClockwise` and `getRotation` methods of the `Direction` enum.
Use the standard compass rose to map each Direction to its clockwise and
counterclockwise neighbor. For the rotation, you should return the angle
in degrees for each orientation, where SOUTH is at 0 degrees, WEST is
90, NORTH is 180, and EAST is -90.

### Step 3.2 - Direction Testing

Verify that your Direction is working with the DirectionTest suite.

### Step 3.3 - Maze Updates

In the `Maze` class, implement the following method

### Step 3.4 - Puzzle Updates

You will need to update your `clear` method of the Puzzle. It should now
be the case that the only Cells that can be cleared are those in the
Maze that will not cause a room to be formed.

### Step 3.5 - Testing

Test out your code with the `MazeTest` and `PuzzleTest` suite.

### Step 3.6 - GUI

Run the GUI to interact with your code.

![](../images/mazegui3.png)

## Step 4 - Explorer and Goal

Uncomment code labeled for this step in

-   MoveTest
-   MazeTest
-   PuzzleTest
-   Explorer
-   MazeController

The Explorer code is completed for you, and an Explorer can move around
the maze and look ahead according to their internal Position and
Direction. There are three pieces of code we will need to complete for
the Explorer and Goal portions of the Puzzle class.

### Step 4.1 - Update Maze

Write a new method for Maze.

#### `public int numOpenNeighbors(Position p)`

This method returns the number of neighbors for a given position that
are open. This does not include the given position, only its four
neighbors, one in each Direction.

### Step 4.2 - Move

Fill in the code for the Move enum. Create three elements, FORWARD, LEFT
and RIGHT. Add two abstract methods for `newPosition` and `newDirection`
as shown below, and then provide an implementation for each of the three
directions.

### Step 4.3 - Move Testing

Verify that your Move is working with the MoveTest suite.

### Step 4.4 - Puzzle Explorer

More methods are now required in the Puzzle class. Complete the
implementation of the following methods.

### Step 4.5 - Puzzle Goal

Finally, add two more methods to Puzzle to allow for a Goal Position to
be placed in the Puzzle.

### Step 4.6 - Puzzle Testing

Verify that your Puzzle is working with the PuzzleTest suite.

### Step 4.7 - GUI

Run the GUI to interact with your code.

![](../images/mazegui4.png)

## What to Hand In

Submit your `Maze.java`, `Puzzle.java`, `Direction.java` and `Move.java`
implementations, along with any additional files you created for your
implementations.

## Grading


* To earn a 5, complete Step 1
* To earn a 10, do the above and Step 2
* To earn a 15, do the above and Step 3
* To earn a 20, do the above and Step 4
