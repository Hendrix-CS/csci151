---
layout: work
type: Lab
num: 2
worktitle: How to Divide a Cake
---

## Overview

In this lab, we will develop computational strategies for a simple game
about dividing a cake.

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

## Coding

In this lab, you will be coding up different strategies for players trying
to optimize the amount of cake you receive.

### Setup

1.  Download the [skeleton](../code/cake151.zip) for this project.
2.  Extract the folder to your desired location. This should create a `cake151` folder.
3.  Open IntelliJ.
4.  Select `File` \> `Open` \> and the `cake151` project directory you just extracted. Note on Windows, you will probably get a `cake151` directory with a `cake151` directory inside of it when you extract your zip file above. Be sure to open the inner directory.
5.  Go to the Package Explorer on the left, and make sure you can find the `src` folder with three packages `engine`, `specs`, and `strategies` underneath. In these packages, you should find Java files, denoted with blue and gree circle icons.

### Step 1 - Look Around

First, let's make sure everything is set up correctly and you can run the skeleton code. Open the `Simulator` class in the `engine` package and click the green Play button at the top of the class. If everything works, you should see the following output.

```
Name       Total  Greedy   Mimic   Timid
Greedy     48.42   40.00   40.25   65.00
Mimic      46.58   39.75   50.00   50.00
Timid      38.33   15.00   50.00   50.00
```

Note that these three strategies, [Timid](../code/Timid.java), 
[Greedy](../code/Greedy.java), and [Mimic](../code/Mimic.java), are found in the `strategy` package, and they all implement the [Strategy](../code/Strategy.java) interface.

When we run the code, all of the class that implement `Strategy` will be run through a tournament against each other. The `Total` column shows the percentage of the cake gathered by each competitor on average across their rounds versus the other competitors.

During each round of the tourament, a `Strategy` is called upon to play the cake game through two methods. First, `askForAll` is called, and the strategy must answer with a `boolean`, where `true` means they want ALL the cake, and `false` means they ask for HALF the cake.

Once both competitors have been called, the game determines the state and doles out the cake according to the description above. Now, the second method, `rememberOtherLast` is called, and the `boolean` parameter `askedForAll` is what the other player did during the round.

The code in these two methods can be simple or complicated depending on how you want to play the game. Review the three provided classes to see how each strategy makes its decision. Notice how in the above examples, only `Mimic` has any data fields, namely a `boolean`. This is the persistent state of the class. All of the strategies you write in this lab must include persistent state; this could be `boolean`, `int`, `float`, `String`, or arrays, to name a few possibilities. This means they must have a private data member / field, outside of the methods but inside the class, and make use of it in the code somehow. The more state you record, the more you will be able to record the history of game play and have better reactions to opponents' strategies.

### Step 2 - Write Strategies

To add a new strategy, first use IntelliJ to make a new class in the `strategies` package. The easiest way to do this is by right-clicking on the `strategies` folder, choosing `New` \> `Java Class`, then providing a name for your class.

Now add `implements Strategy` right after the `public class MyFirstClass` and before the `{`. IntelliJ will be grumpy, so add the line `import specs.Strategy;` to the top of your file. Now IntelliJ is grumpy for another reason. When the red squiggles appear under the class description, right click on them, and select `Show Context Actions` \> `Implement Methods`. This will automatically add the two needed methods to this class.

Your grade will depend upon the total number of strategies you create,
subject to the following constraints:

-   No strategy may duplicate the behavior of any of the three provided
    strategies.
-   Every strategy must use some persistent state.
-   Each strategy should be named after the last names of the authors. For example,
    students named Mark Goadrich and Brent Yorgey would create `GoadrichYorgey1.java`,
    `GoadrichYorgey2.java`, and so forth.
-   To earn full credit, at least one strategy must use an array.

Be sure to regularly run simulations with your strategies, by executing the `Simulator` class, to check on your syntax and semantics as well as performance.

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

* To **Complete** this lab, 
    * write five strategies,
    * use an array in one of your strategies, or
    * place in the top *10* strategies in the tournament, or 
    * use a very creative strategy.
