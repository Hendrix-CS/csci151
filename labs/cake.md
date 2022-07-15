---
layout: work
type: Lab
num: 2
worktitle: How to Divide a Cake
---

## Overview

In this lab, we will develop computational strategies for a simple game
about dividing a cake.

## Materials


1.  Download the [skeleton](../code/cake151.zip) for this project.
2.  Extract the file to your desired location.
3.  Open IntelliJ.
4.  Select `File` \> `Open` \> and the project directory.
5.  Go to the Package Explorer, and make sure the desired files are in
    place.

## Description

> Once upon a time two children, Ryan and Isla, found a cake. Ryan said: “Splendid! I will eat the cake.” Isla said: “No, that is not fair! We found the cake together, and we should share and share alike; half for you and half for me.” Ryan said, “No, I should have the whole cake!” Isla said, “No, we should share and share alike; half for you and half for me.” Ryan said, “No, I want the whole cake.” Isla said, “No, let us share it half and half.” Along came an adult who said: “You shouldn’t fight about this; you should compromise. So Ryan gets three quarters of the cake.”

adapted from Raymond Smullyan’s *[This Book Needs No Title: A Budget of Living Paradoxes](https://www.amazon.com/This-Book-Needs-Title-Touchstone/dp/0671628313/)*.

The above situation is related to the [Prisoner's
Dilemma](https://en.wikipedia.org/wiki/Prisoner's_dilemma) a classic
example in [Economic Game
Theory](https://en.wikipedia.org/wiki/Game_theory). If the children
are given two options, ask for ALL the cake, or ask for HALF the cake, what
should they choose?

-   If they both ask for HALF the cake, then they will both get 50% of the cake.
-   If one asks for HALF while the other asks for ALL of the cake, then
we will split the cake as above, 25% and 75%. However, because the adult had to mediate, each player will be required to give 10% of the cake to the adult. This means that the player who asked for HALF only get 15%, while the player who asked for ALL the cake gets 65%.
-   If they both ask for ALL the cake, then the cake will be split evenly between them as a compromise. However, again the adult gets their mediation cut, so each player ultimately gets 40% of the cake.

It is temping to try and ask for ALL the cake when the other player does not, but they will have the same idea, and the rational end result is that both
will get less.

However, if we put the children in this situation repeatedly, without
knowing when the process will end, a different outcome is possible. This
is known as the [Iterated Prisoner's
Dilemma](https://en.wikipedia.org/wiki/Prisoner's_dilemma#The_iterated_prisoner's_dilemma).
Now, the children can start to formulate strategies of how to play based on
the history of interactions with the other player.

In this lab, you will be coding up different strategies for players trying
to optimize the amount of cake you receive.

### Step 1

To design a strategy, create a class that implements the
[Strategy](../code/Strategy.java) interface, and place it in the
`strategies` package. [Three](../code/Timid.java)
[simple](../code/Greedy.java) [examples](../code/Mimic.java) have been
provided.

Your grade will depend upon the total number of strategies you create,
subject to the following constraints:

-   No strategy may duplicate the behavior of any of the three provided
    strategies.
-   Every strategy must use some persistent state.
-   Each strategy should be named after the last names of the authors. For example,
    students named Mark Goadrich and Brent Yorgey would create `GoadrichYorgey1.java`,
    `GoadrichYorgey2.java`, and so forth.
-   To earn an "A", at least one strategy must use an array.

To run a simulation with your strategies, execute the `Simulator` class.

## Evaluation

In an evaluation document, reflect on your choices for each strategy.
Write a few sentences about your goals in writing these
strategy. If you were playing this game in real life, would you use
any of the strategies you wrote? Why or why not?

## What to Hand In

Submit all of your strategy files (**the .java files you wrote**) and your
reflection document via Teams by the next lab period.

We will run a simulation competition during class the following Wednesday.

## Grading

* To **Partially Complete** this lab, write five strategies.
* To **Complete** this lab, do the above and
    * use an array in one of your strategies
    * place in the top *10* strategies in the tournament, or 
    * use a very creative strategy.
