---
layout: work
type: Practice
num: 1
worktitle: Instantiable Classes
---

## Tootsie Pops

Write a class called `TootsiePop` to represent a hard candy lollipop filled with
chocolate-flavored chewy candy.

You will have two components, a `String` for the flavor and an `int` for the number of licks.

Your constructor method will bring in an initial number of licks and a flavor.
For example:

    TootsiePop p = new TootsiePop("Strawberry", 40);

You will need three additional methods:

* `public boolean can_lick()` which returns `true` if the TootsiePop has licks remaining.

* `public void lick()` which removes one lick from the TootsiePop if there are licks remaining.

* `public void bite()` which removes all licks.

## Making Toast

Write a class called `Toaster` to represent a simple object to make tasty toasted
treats. These treats will be represented by `Strings`.

The toaster should have a constructor that will bring in how many items this
toaster can hold. Your components should be an array for the items, and an
integer for the number of items currently in the toaster. For example:

    Toaster tst = new Toaster(2);

would create a `Toaster` that can hold two items, and currently has zero items.

You will need 3 additional methods:

* `public String add(String t)` - this will bring in a string to be toasted,
add it to the toaster if there is room, and return `“READY”`, otherwise it
will return the item back to the user.

* `public void toast()` - this will add the prefix “toasted” to all items in the toaster.

* `public String extract()` - this will remove and return a single item from
the toaster at a time. If there are no items, it will return the string `“NONE”`.
