---
layout: work
type: Formative Assessment
num: 1
worktitle: Eating Candy
---

Write a class called `TootsiePop` to represent a hard candy lollipop filled with
chocolate-flavored chewy candy.

You will have two components, a `String` for the flavor and an `int` for the number of licks.

Your constructor method will bring in an initial number of licks and a flavor.
For example:

    TootsiePop p = new TootsiePop("Strawberry", 40);

You will need four additional methods:

* `public boolean canLick()` which returns `true` if the `TootsiePop` has licks remaining.

* `public void lick()` which removes one lick from the `TootsiePop` if there are licks remaining.

* `public void bite()` which removes all licks.

* `public String toString()` which returns a String representation of the object, such as `"strawberry: 0"`.

Also, write a `Main` class that includes a `public static void main(String[] args)` method that fully tests and demonstrates that your class is working.

Feel free to use IntelliJ to test your code. Be ready to demonstrate your program to the instructor by the due date.
