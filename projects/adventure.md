---
layout: work
type: Project
num: 3
worktitle: Text Adventure
basicdue: Wednesday, April 1st
finaldue: Thursday, April 9th
---

## Overview

    You are in MC Reynolds 315.  Banks of desks stretch southwards
    and upwards into the gloom.  The blackboard broods, dark and empty,
    like a giant watchful eye.  The door is to the west.

    There is an eraser here.

    ? take eraser
    Taken.

    ? inventory
    You are carrying:
      an eraser

    ? go west

    You are standing at the east end of the hallway on the third
    floor of MC Reynolds. 315 is to the east, and Dr. Goadrich's
    office is to the south. The hallway continues to the north and
    west.

    ? go south
    You start to go that way but then change your mind.

    ? go north

    You are standing in a hallway on the third floor of MC Reynolds,
    which extends to the south.  To the east is 317; to the north,
    a doorway; to the west, a bathroom.

    ? go east

    You are in MC Reynolds 317.  It is bright and sunny.
    The chalkboard is covered with pictures and writing.

    There is a stick of chalk here.

    ? drop eraser
    Dropped.

In this project, you will implement an *adventure game engine*
for [Interactive Fiction](https://en.wikipedia.org/wiki/Interactive_fiction)
which can read in a description of a *world* and allow the user to explore it, as
shown in the example above. Famous examples of this type of game
are [Zork](http://www.web-adventures.org/cgi-bin/webfrotz?s=ZorkDungeon&n=1468)
and [Adventure](http://www.web-adventures.org/cgi-bin/webfrotz?s=Adventure&n=1469).

The goals of this project are to:

-   give you more experience using common data structures such as lists,
    maps/dictionaries, and sets;
-   and to give you experience putting together a medium-size
    application with multiple interacting classes.

## Timeline

-   You are required to turn in a Basic and Itermediate working version
    by **{{page.basicdue}}**; see below for the requirements.
-   The final version, which includes the Advanced features
    and at least one Expert feature is due on **{{page.finaldue}}**, which should
    give you plenty of time. Get started early!

## Materials

-   Download the [skeleton](../code/Adventure.zip) for this project.

{% include note.html content="**Read this project description carefully!** There are a lot of moving
parts to this project and a lot of things that have to be explained. You
will certainly not be able to remember everything and will need to refer
back to this document frequently. I strongly suggest **printing this
project description on paper** so you can more easily refer to it, write
notes, and so on." %}

## Skeleton Code Description

### `Direction.java` and `Verb.java`

`Direction.java` represents a *direction* in which the player can move,
such as "south", "northwest", or "up". `Verb.java` represents something
the player can *do*, such as "go", "take", or "drop".

Both are implemented as *enumerations*, declared using the `enum`
keyword, which is like a special class that provides a list of possible
values. You can refer to these special values by prefixing the name of
the enumeration: for example, `Direction.SOUTHEAST` or `Verb.GO`. Adding
a new direction or a new kind of action (if you decide to do so while
making your own extensions to the project) is as simple as adding a new
name to the appropriate list.

Both `Direction` and `Verb` also provide a `parse` method, which can be
used to convert from a `String`. For example, `Direction.parse("up")`
returns `Direction.UP`.

### `Command.java`

`Command.java` provides the `Command` class, which is responsible for
taking a `String` representing something the player types, and breaking
it down into pieces such as a `Verb` and/or a `Direction`. In
particular, a `Command` may contain three pieces of information
extracted from the player's `String`:

-   A `Verb`
-   A `Direction`
-   The name of an item (called the `Noun`)

For example, `Command c = new Command("look north")` creates a `Command`
object which breaks down the string `look north` into pieces. Calling
`c.getVerb()` will return `Verb.LOOK`, and `c.getDirection()` will
return `Direction.NORTH`.

As another example, `Command c = new Command("look at eraser")` will
create a `Command c` such that `c.getDirection()` is
`Direction.UNKNOWN`, but `c.getNoun()` is `"eraser"`. Note that small
words like `"at"` are simply ignored.

There is a bit more you can do with `Command`; take a look at the
comments in `Command.java` for more info.

### `Hendrix.yml`

The provided `Hendrix.yml` file describes a simple world centered
around the third floor of MC Reynolds. Note that **you do not have to
write code to read `Hendrix.yml` (or any other `.yml` files)!**
Instead, you should use the provided SnakeYAML library to read them for
you. See the section below on `snakeyaml` and `AdventureDemo.java` for
an explanation of how to do this.

`Hendrix.yml` uses the standard [YAML format](http://yaml.org/), which
is intended to be a simple, human-readable format for describing
structured data.

-   Key-value pairs (i.e. dictionaries) are specified as `key: value`.
-   Lists are specified as either `[item1, item2, ...]` or as a sequence
    of bullet points.
-   Dictionaries and lists can be nested using indentation.

Entries in the file are separated by three hyphens `---`. Let's look at
a single entry from `Hendrix.yaml` as an example.

    type: location
    id: MC317
    name: MC Reynolds 317
    desc: You are in MC Reynolds 317.
    longdesc: |
      You are in MC Reynolds 317.  It is bright and sunny.
      The chalkboard is covered with pictures and writing.
    exits:
      west: hallwayEB
      out: hallwayEB
    items:
      - name: stick of chalk
        aliases: [chalk]
        desc: |
          It is a fat, high-quality piece of Japanese chalk,
          with the word "Hagoromo" written on the side in
          black letters.  You seem to recall that Dr. Yorgey
          always uses this kind of chalk.  Perhaps he
          accidentally left it here after teaching Algorithms.
        goal: yorgey
        goalmessage: |
          You return the chalk to Dr. Yorgey, who seems very grateful.
        score: 5
      - name: blackboard
        aliases: [board, chalkboard, pictures, picture, writing]
        portable: false
        desc: |
          The blackboard has several pictures of graphs traced
          over in yellow, green, blue, and orange chalk, along
          with lots of writing.  You can make out a few words
          like "lemma" and "theorem", but the rest seems to be
          about things like "flows" and "cuts" and "values".
          You realize it is probably left over from Algorithms.
      - name: sun
        portable: false
        desc: You could hurt your eyes that way!

As you can see, an entry consists of a top-level dictionary with keys
like `type`, `id`, `name`, and so on. Let's go through each key one by
one:

-   The `type` specifies what kind of thing is being described by this
    entry (a location, an item, a monster, a magic spell, ...?, etc.).
    The only `type` in the provided `Hendrix.yaml` file is `location`,
    but you could extend it with your own new kinds of entries. (Note
    that if you make your own new kinds of entries, you can use whatever
    keys make sense for that entry: everything else in the list below is
    specific to `location`s. For example, a `type: monster` entry would
    not need to have `exits`; it would have whatever keys and values are
    needed to describe a monster.)

-   The `id` is a string used to uniquely identify this location. As we
    will see, it is used to specify which locations link to which other
    locations. (*Hint*: you will probably want to use a dictionary
    (`HashMap`) mapping `id`s to locations!)

-   The `name` is a short name for the location. Unlike the `id`, it
    does not have to be unique (for example, in `Hendrix.yaml` there are
    multiple locations which are all named `Hallway`).

-   The `desc` is a short (one-line) description of the location which
    can be displayed to the user.

-   The `longdesc` is a longer description of the location which can be
    displayed to the player. Notice how it starts with the `|`
    character, which is special YAML syntax indicating the start of a
    long string which extends over multiple lines.

-   Up to this point, each key has been associated to a string value.
    However, the next key, `exits`, is associated to a value which is
    itself a dictionary. (In YAML, structured types (dictionaries or
    lists) can be nested inside others just by indenting them.) The
    dictionary associated to `exits` maps directions to location IDs.
    This specifies which directions the player can `go` from this
    location, and the `id` of the location the user will end up in if
    they do. Notice that this means locations do not inherently exist in
    a grid or any other sort of physical space; they can be linked
    together however you want.

    In the given example, two directions (`out` and `west`) both lead to
    the same location (`hallwayEB`); in general there could be more
    exits leading to different locations.

-   The last key is `items`, which contains a list of dictionaries. Each
    element of the list is marked by an indented hyphen, and contains a
    dictionary describing a single item which is at this location. Items
    can contain the following keys:
    -   `name`: the name of the item. This should be unique.
    -   `aliases`: a list of alternate names the player can use to refer
        to the item. If no `aliases` key is present (as in the case of
        the `sun` item in the example above), the item has no aliases.
    -   `desc`: a description of the item.
    -   `portable`: a `true`/`false` value specifying whether the player
        can pick the item up. If no `portable` key is present (as in the
        case of the `chalk`), it defaults to `true`.
    -   `goal`: this is the `id` of a `location` where the player should
        take this item and `drop` it. In the above example we can see
        that the player should take the `chalk` item to the location
        with the id `yorgey`.
    -   `goalmessage`: a message which can be shown to the player when
        they drop the item at the `goal` location.
    -   `score`: the number of points the player receives when they drop
        the item at the `goal` location.

A few miscellaneous notes:

-   What is the difference between `name`, `desc`, and `longdesc`? It is
    really up to you, but here is how I use them in my implementation:
    -   `name` is used when telling the user what they can see in a
        given direction:

            ? look east
            You can see MC Reynolds 317 in that direction.

    -   `longdesc` is shown to the player the first time they visit a
        location, or when they explicitly `look` at their surroundings.
    -   `desc` is shown to the player on subsequent visits to a location
        after the first (because it might be annoying to keep printing
        the same long description over and over every time they come
        back to a location).

-   One last feature present in `Hendrix.yaml` is that some locations
    have the key `article`. This is a grammatical aid to make the output
    flow better, and indicates an article which can be prepended to the
    name of the location when using it in a sentence. For example, since
    `MC Reynolds 317` has no `article`, it would simply be displayed as:

        ? look east
        You can see MC Reynolds 317 in that direction.

    whereas the locations with name `hallway` specify `article: a`, and
    will thus be displayed as:

        ? look east
        You can see a hallway in that direction.

    rather than `"You can see hallway in that direction."`, which sounds
    wrong.

### `snakeyaml-1.18.jar` and `AdventureDemo.java`

{% include note.html content="**You do not have to write code to read in YAML files!** Instead, you
should use the provided SnakeYAML library to read them for you. This
will return some structured objects from which you can extract the
information you want." %}

Using SnakeYAML has several advantages:

-   You do not have to write your own parser (which can be rather
    tricky). All the parsing is handled for you by SnakeYAML.
-   It is easy to extend the format with your own new features.
-   It makes it possible to exchange world files with others, even if
    your adventure engines support different sets of features. Your
    engine can simply ignore entry types or keys that it does not know
    what to do with.

`AdventureDemo.java` provides an example of how to use SnakeYAML to
parse a `.yaml` file, and how to extract information from its output. It
also demonstrates how to read user input and parse it using the provided
`Command` class. Feel free to use `AdventureDemo.java` as the basis for
your own implementation.

## Requirements

This project must be completed **individually**.

There are four levels of implementation for your project, Basic,
Intermediate, Advanced, and Expert.

### LEVEL 1: BASIC

By {{page.basicdue}} you must submit a Basic and Intermediate working version.

A Basic version handles the
following minimum requirements:

#### 1.1 Read YAML Files

Accept the provided world description file `Hendrix.yaml`, or any
other file using the same format. Keep in mind that you are not writing a program to
let the user play a *particular* adventure, but an *engine* which
will allow the user to explore any world described in a file of the
proper format.

#### 1.2 Player Location
Keep track of the player's current location, and print out a
description of the location.

#### 1.3 Player Movement

Allow the user to move around via the `go` command.

### LEVEL 2: INTERMEDIATE

An Intermediate program will also implement the following features:

#### 2.1 Item Display

When the player enters a new location, print out all the items at
    that location.

#### 2.2 Collect Items

Allow the user to pick up and drop items via the `take` and `drop`
commands.

#### 2.3 Inventory Command

Keep track of what the user is currently carrying and allow them to
view their current inventory with the `inventory` command.

#### 2.4 Track Score

Keep track of the user's current score, and increase their score
when they drop an item in that item's goal location.

A project which meets the Basic and Intermediate levels **and uses good
code style and documentation** will receive a 85 points.

{% include note.html content="It is **not** a requirement to make your output look exactly
like mine in the example above! Use your creativity and judgment. If you
have an idea of something you would like to do differently and are
unsure whether it would meet the requirements, feel free to ask." %}

### LEVEL 3: ADVANCED

In order to get an A on the project, you should implement all the Advanced
features *in addition to* at least one Expert feature.

#### 3.1 New YAML world

Design your own world (by making another `.yaml` file) and submit it
along with your project. These will be collected and published for
the whole class (and future classes!) to enjoy.

#### 3.2 Look Command

-   The basic version of `look` takes the name of an item and simply prints
    out a description of the item. Note you should only print a
    description of items which are either in the current location or
    in the player's inventory.

        ? look at eraser
        A dusty old eraser.

        ? look at chalk
        I don't see one of those here.

-   The `look` command by itself should simply print a description
    of the current location.

        ? look

        You are standing at the east end of the hallway on the third
        floor of MC Reynolds. 315 is to the east, and Dr. Goadrich's
        office is to the south. The hallway continues to the north and
        west.

        ? drop eraser
        Dropped.

        ? look

        You are standing at the east end of the hallway on the third
        floor of MC Reynolds. 315 is to the east, and Dr. Goadrich's
        office is to the south. The hallway continues to the north and
        west.

        There is an eraser here.

-   Finally, extend the `look` command to take a direction, which
    prints out the name of the location in that direction (if any).

        ? look west
        You can see a hallway in that direction.

        ? look east
        There's nothing to see that way.


#### 3.3 Short Description

After visiting a location once, on subsequent visits just print the
`desc` instead of the `longdesc`.

        You are in MC Reynolds 315.  Banks of desks stretch
        southwards and upwards into the gloom.  The blackboard broods, dark
        and empty, like a giant watchful eye.  The door is to the west.

        There is an eraser here.

        ? go west

        You are standing at the east end of the hallway on the third
        floor of MC Reynolds. 315 is to the east, and Dr. Goadrich's
        office is to the south. The hallway continues to the north and
        west.

        ? go east

        You are in MC Reynolds 315.

        There is an eraser here.

        ? look

        You are in MC Reynolds 315.  Banks of desks stretch southwards
        and upwards into the gloom.  The blackboard broods, dark and empty,
        like a giant watchful eye.  The door is to the west.

        There is an eraser here.


#### 3.4 Portable Items

Distinguish between portable and non-portable items; only allow the
user to pick up portable items. In addition, non-portable items
should not be listed when telling the user what items are in a
particular location.

        ? look at blackboard
        The blackboard is empty. It looks as though it has
        been recently washed.

        ? take sock
        I don't see one of those here.

        ? take blackboard
        You can't take that!


#### 3.5 Item Aliases

Allow the user to refer to items by any of their listed `aliases`.

        ? look at board
        The blackboard is empty. It looks as though it has
        been recently washed.

        ? look at chalkboard
        The blackboard is empty. It looks as though it has
        been recently washed.


#### 3.6 Help

Implement a `help` command. For example, it might look like this
(but might be different depending on what other features you add to
your engine):

        ? help
        Explore your surroundings.  You can get points by taking certain
          objects to certain other locations.

        Available commands:
          go <dir>        - move in a certain direction
          look            - look at your surroundings
          look <dir>      - see what location lies in a given direction
          look [at] <obj> - look at an object in your location or inventory
          take <obj>      - pick up an object
          drop <obj>      - put down an object
          inventory       - see what you are carrying
          score           - see your current score
          help            - show this help message
          quit            - quit

        Available directions:
          north south east west northeast northwest southeast southwest up down in out

### LEVEL 4: EXPERT

Most Expert extensions will require you to extend the `.yaml` file format
with additional keys or entry types. Fortunately, that is as easy as
simply adding them, and then looking for the new key or entry type in
your engine. For example, suppose you wanted to add a `weight` key to
items. You would simply add something like `weight: 10` as a key-value
pair in the description of an item; then, in your engine, you could do
something like

    Integer w = itemMap.get("weight");
    int weight = (w == null) ? 5 : w;

In this example, I chose to use a default weight of 5 if the value `w`
is `null` (meaning the key `weight` was not found). This means my engine
will still be compatible with `.yaml` files that do not specify a
`weight` key for items; it will simply use a default weight.

Here are some ideas for other ways you could extend your engine and the
types of worlds it can support. Of course, you should not feel limited
to these. Use your imagination! Please come by and discuss your ideas
with me; I am happy to help you brainstorm and plan how to implement
them.

-   Add **other characters and/or monsters** which can inhabit the world
    along with the player, and possibly even move around. You could, for
    example, add a new key `characters:` to locations, much like the
    existing `items:` key, to specify characters which start out at that
    location. Alternatively, you could create a new kind of top-level
    entry such as `type: character` which describes a character.
    Depending on what kind of characters you want to create, you would
    have to decide what keys and values to use to describe them.
    -   If you want the player to be able to fight the other characters,
        you could give them keys such as `health`, `attack`, etc.
    -   If you want the player to be able to converse with the other
        characters, you could specify a conversation tree of statements
        and potential responses the player can choose among.

-   Add a **combat system** that allows the player to fight monsters.

-   Limit the amount the player can carry; give each item a **weight**.

-   Items can have **special actions** associated with them which print
    special messages, give the player points, or cause other things to
    happen in the world. For example, a `shovel` item might have a
    special `dig` action associated with it, which allows the player to
    reveal special items or dig a tunnel to a previously inaccessible
    location.

-   Add simple **conditionals** that allow the world to change in certain
    ways depending on the actions of the player. For example, certain
    directions might be locked unless the player is carrying a certain
    item; certain messages might change depending on what has happened
    so far.

## A Note on Dictionaries and Sets

In this project you will almost certainly use a lot of dictionaries. For
a fast Java dictionary implementation, you should use the [`HashMap`
class](https://docs.oracle.com/javase/13/docs/api/java/util/HashMap.html).
We don't yet know how it is implemented (we will learn how to implement it in
a later lab) but you already know how to use it.

In addition, you can use `HashSet` if you want to keep a collection of
things in no particular order, and be able to easily add and remove
items. For example, this sort of structure is ideal for keeping track of
the player's inventory.

## Don't Panic

This project might at first glance appear huge, and there is certainly a
lot to read and understand before you can get started. But

1. it is not
quite as bad as it looks (trust me!),
2. it is easy to develop
incrementally, so you can get something very simple working first and
then keep adding features as you go,
3. you have plenty of
time---get started early, ask for help when you are stuck, and keep
plugging away at it.

As a point of reference, my solution (which implements all the required
extensions, though not an additional extension) is about 500 lines of
code, not counting the starter code. But keep in mind that a sizable
fraction of that (perhaps half?) consists of blank lines, comments, and
boring getter/setter methods.

## What to Hand In

For your final submission, you should turn in a `.zip` file containing:

-   All the `.java` files necessary to run your project. **Please
    include** even the provided starter code, even if you did not change
    them, to make it as easy as possible for me to run your code.

-   Any `.yaml` world files you created (you must create at least one).
    If you added any special features to your engine, this is your
    opportunity to show them off.

-   A `README.txt` file containing a description of your engine, any
    `.yaml` files you submitted, and any special features you added that
    I should look for.

## Grading

|Criteria|Score|
||----|:---:|
| Reads the provided world description file Hendrix.yaml, and loads the information into appropriate objects.  | **10**   |   
| Keeps track of the player's current location, and prints out a description of the location.  |  **10**    |  
| Allows the user to move around via the go command.  | **10**     |
| Print out all the items at a new location | **5** |
| Users can pick up and drop items | **10** |
| Users can view their current inventory | **10** |
| Keep track of the current score | **5** |
| Includes a student-designed YAML file   |**10**      |
| A look command takes the name of an item (either in the current location or in the player's inventory) and prints out a description of the item. |  **5**       |
| By itself, the look command prints a description of the current location.   |   **5**     |  
| Given a direction, the look command prints out the name of the location in that direction.  |   **5**       |
| After visiting a location once, on subsequent visits print the desc instead of the longdesc.   |  **5**       |
| Allow the user to pick up (portable) items.  | **5**       |
| The user may refer to items by any of their listed aliases.  |   **5**       |
| A help command lists all commands.  |  **5**       |
| Includes at least one additional extension.   | **10**      |
| Includes a helpful README    |  **5**       |
| **Total**     |    **120**|
