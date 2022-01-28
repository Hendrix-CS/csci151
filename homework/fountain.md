---
layout: work
type: Practice
num: 1
worktitle: Instantiable Classes
---

Write a class called `Fountain`.  Objects of
this class will have three component variables:

* the capacity of the fountain (in liters),
* the amount of water currently in the fountain (also in liters), and
* whether the fountain is currently running or not.

Fountains start out empty, in the `off` state, with a given capacity.
For example,

`Fountain fountain = new Fountain(200);`

should create a `Fountain` object representing an empty
fountain which is not running and has a capacity of 200 liters of
water.

Besides the constructor, you will need three additional methods:
`add(int liters)`, `toggle()`, and `look()`.

* When `public void add(int liters)` is called, the given number of liters of
  water are added to the fountain.  (Note that `liters` could
  be negative, in which case water will be removed from the
  fountain.) However:
  * The fountain cannot hold more than its capacity. If the
    total contents of the fountain would exceed its capacity, the
    excess liters overflow and the fountain will contain exactly its
    capacity.
  * The contents of the fountain cannot become negative.  If the
    fountain becomes empty then it should automatically turn off.

* When `public void toggle()` is called:

  * If the fountain is on, it will turn off.
  * If the fountain is off but it is empty, it cannot turn on.
  * If the fountain is off and contains some water, it will turn
    on.

* When `public String look()` is called, it `return`s a string explaining
  what the fountain looks like.  The string should say whether the
  fountain is on or off, and how much water it contains.

Here is a sample Main class in Java that tests the fountain.

```
public class Main {
  public static void main(String[] args) {
    Fountain f = new Fountain(200);
    System.out.println(f.look());  
    f.toggle();
    System.out.println(f.look());
    f.add(120);
    System.out.println(f.look());
    f.toggle();
    System.out.println(f.look());
    f.add(397);
    System.out.println(f.look());
    f.toggle();
    System.out.println(f.look());
    f.toggle();
    System.out.println(f.look());
    f.add(-90);
    System.out.println(f.look());
    f.add(-200);
    System.out.println(f.look());
 }
}
```

When you run the above code, here is a sample of output that you could see.
Your implementation does not have to produce exactly the same messages, as
long as they contain the same information.

```
The fountain is off. It contains 0 liters of water.
The fountain is off. It contains 0 liters of water.
The fountain is off. It contains 120 liters of water.
Sploosh! The fountain is on. It contains 120 liters of water.
Sploosh! The fountain is on. It contains 200 liters of water.
The fountain is off. It contains 200 liters of water.
Sploosh! The fountain is on. It contains 200 liters of water.
Sploosh! The fountain is on. It contains 110 liters of water.
The fountain is off. It contains 0 liters of water.
```
