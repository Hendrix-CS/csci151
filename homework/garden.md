---
layout: work
type: Formative Assessment
num: 2
worktitle: Planting a Garden
---

Write a class called `Garden` to represent a dividable plot of land that can be
planted, watered, and harvested.

Create an `Enum` called `Dirt`. Start with the code below. You
are welcome to add methods to it if you would like.

    public enum Dirt {
         EMPTY, SEED, PLANT;
    }

You will have two components, an array of `Dirt` for the plots, and a `String` to hold the type of crop planted in this garden;

Your constructor method will bring in an initial number of plots and a crop type.
It should initialize the plots so there are the required available spaces, and set them all to EMPTY. Also save the crop type of plants grown.

For example:

    Garden g = new Garden(5, "garlic");

You will need three additional methods:

* `public void plant(int plotNum)` which if the specified garden plot is `EMPTY`, convert it to a `SEED`.

* `public void water()` which will check each plot, and if it is a `SEED`, set it equal to a `PLANT`.

* `public String harvest(int plotNum)` which tries to harvest a plant at the specified garden plot. If you find a `PLANT` there,
set the space to `EMPTY` and return the type of plant grown in this garden.
If there is a `SEED`,
return the string `"Needs Water!"`. Otherwise return `"Nothing but Dirt..."`.

Also, write a `Main` class that includes a `public static void main(String[] args)` method that fully tests and demonstrates that your class is working.

eel free to use IntelliJ to test your code. Be ready to demonstrate your program to the instructor by the due date.
