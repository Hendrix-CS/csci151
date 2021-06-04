---
layout: work
type: Lab
num: 2
worktitle: Prisoner's Dilemma
---

## Overview

In this lab, we will develop computational strategies for the Iterated
Prisoner's Dilemma.

## Materials


1.  Download the [skeleton](../code/151-prisoner.zip) for this project.
2.  Extract the file to your desired location.
3.  Open IntelliJ.
4.  Select `File` \> `Open` \> and the project directory.
5.  Go to the Package Explorer, and make sure the desired files are in
    place.

## Description

The [Prisoner's
Dilemma](https://en.wikipedia.org/wiki/Prisoner's_dilemma) is a classic
example in [Economic Game
Theory](https://en.wikipedia.org/wiki/Game_theory). Two burglars are
taken in by police. They are simultaneously interrogated in separate
rooms. Each burglar must decide whether to **COOPERATE** with *each
other* to stay quiet, or **DEFECT** and talk to the police.

-   If they both COOPERATE, then they will only spend a small time in
    prison.
-   If one DEFECTs and the other COOPERATEs, the defector is set free
    while the cooperator goes to prison for a long time.
-   If they both DEFECT, then both will spend a medium amount of time in
    prison

It is temping to try and DEFECT when the other player COOPERATEs, but
they will have the same idea, and the rational end result is that both
DEFECT. So much for cooperation.

However, if we put the burglars in this situation repeatedly, without
knowing when the process will end, a different outcome is possible. This
is known as the [Iterated Prisoner's
Dilemma](https://en.wikipedia.org/wiki/Prisoner's_dilemma#The_iterated_prisoner's_dilemma).
Now, burglars can start to formulate strategies of how to play based on
the history of interactions with the other player.

In this lab, you will be coding up different strategies for players. We
will assign points for the different outcomes as follows, with higher
points being better for the players. (negative points imply time in
prison)

-   If they both COOPERATE, each player gets +10.
-   If one DEFECTs and the other COOPERATEs, the defector gets +15 while
    the cooperator gets -10.
-   If they both DEFECT, then both will get -5.

### Step 1

To design a strategy, create a class that implements the
[Strategy](../code/Strategy.java) interface, and place it in the
`strategies` package. [Three](../code/Tit4Tat.java)
[simple](../code/Naive.java) [examples](../code/Evil.java) have been
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
reflection document via
[Moodle](http://moodle.hendrix.edu) by the next lab period.

We will run a simulation competition during class the following Wednesday.

## Grading

* To earn a 3, write one strategy
* To earn a 6, write two strategies
* To earn a 8, write three strategies
* To earn a 11, write four strategies
* To earn a 14, write five strategies
* To earn a 17, do the above and use an array in one of your strategies
* To earn a 20, do the above and place in the top *10* strategies in the tournament, or use a very creative strategy.
