---
layout: work
type: Homework
num: 2
worktitle: Making Toast
---

Write a class called `Toaster` to represent a simple object to make tasty toasted
treats. These treats will be represented by `Strings`.

The toaster should have a constructor that will bring in how many items this
toaster can hold. Your components should be an array for the items, and an
integer for the number of items currently in the toaster. For example:

    Toaster tst = new Toaster(2);

would create a `Toaster` that can hold two items, and currently has zero items.

You will need 3 additional functions:

* `public String add(String t)` - this will bring in a string to be toasted,
add it to the toaster if there is room, and return `“READY”`, otherwise it
will return the item back to the user.

* `public void toast()` - this will add the prefix “toasted” to all items in the toaster.

* `public String extract()` - this will remove and return a single item from
the toaster at a time. If there are no items, it will return the string `“NONE”`.

You may use IntelliJ to test your code. Turn in a copy of your
`Toaster.java` file through Teams by the due date.
