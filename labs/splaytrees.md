---
layout: work
type: Lab
num: 11
worktitle: Splay Trees
---

## Overview

In this lab, we will implement rotations for Binary Search Trees and use them to implement a Splay Tree.

## Materials

-   IntelliJ
-   Lab partner

## Setup

1.  Download the [skeleton](../code/151splay.zip) for this
    project.
2.  Unpack the code into a new IntelliJ Java project.

## Description

We can efficiently adapt the structure of our binary search trees to match 
the distribution of data access pattern. Every time a node is accessed through
the `contains` method, that node will need to rotate up its branch to eventually
become the root.

A new button is available in the GUI to call the `contains` method of the tree, which
will return `true` or `false` in the message window to the right.

The unit tests have been rewritten to expect the splay operation as part of the containsHelper method. Mostly everything should be failing at the beginning of the lab.

{% include note.html content="Data entry has been updated, so that the input string
is divided into the component characters. This makes it much easier to build large trees and test the splay operation." %}

![](../assets/images/splaylab.png){: .img-fluid}

## `Optional` vs `null` reminder

One way to implement a `TreeNode` in Java is to use `null` for the `left`
and `right` children when these children are empty. However, this opens up
the possibility for a `NullPointerException` if we code incorrectly, and
we won't know if the exception is because of this or some other
unexpected `null` in our algorithm.

In this lab, we will use a special class in Java called `Optional`. This
class can be used in lieu of `null`, so you know exactly what error you are
getting and why. We wrap all of our `TreeNode` objects in an
`Optional` object. So, instead of saying `left == null`, we would
ask 'left.isPresent()'. If `left` exists, then we can get the `TreeNode` by
saying `left.get()`.

{% include important.html content="To make a new child, we would say something like
`left = Optional.of(new TreeNode(value))`." %}

Methods that remain to be implemented in the `TreeNode` class have been
marked with TODO for easy identification.

## Step 1: Rotations

Implement left and right rotations. As with `remove()`, these methods return
the rebuilt tree nodes.

When correct, they should pass their unit tests.

Also test them in the GUI by clicking on the node that you wish to rotate. 

## Step 2: Adding splay to `containsHelper`

Follow the pseudocode listed in the `containsHelper` method, which will return 
a splayed tree when the target element is found, and `Optional.empty()` when 
the target element is not found. Once this is working properly, you should pass
all of the unit tests.

## Step 3: Evaluation

Paste the following string into the input box and select `Insert`. Discuss the shape of the tree created.

`qazxswedcvfrtgbnhyujmkiolp`

Then paste the below text (the first chapter from [Pride and Prejudice by Jane Austin](https://www.gutenberg.org/cache/epub/1342/pg1342.txt)) into the input box and select `Contains`. Discuss the shape of the new tree and how the distribution of letters
in the text has affected the tree shape.

>
It is a truth universally acknowledged, that a single man in possession
of a good fortune must be in want of a wife.
However little known the feelings or views of such a man may be on his
first entering a neighbourhood, this truth is so well fixed in the minds
of the surrounding families, that he is considered as the rightful
property of some one or other of their daughters.
“My dear Mr. Bennet,” said his lady to him one day, “have you heard that
Netherfield Park is let at last?”
Mr. Bennet replied that he had not.
“But it is,” returned she; “for Mrs. Long has just been here, and she
told me all about it.”
Mr. Bennet made no answer.
“Do not you want to know who has taken it?” cried his wife, impatiently.
“_You_ want to tell me, and I have no objection to hearing it.”
This was invitation enough.
“Why, my dear, you must know, Mrs. Long says that Netherfield is taken
by a young man of large fortune from the north of England; that he came
down on Monday in a chaise and four to see the place, and was so much
delighted with it that he agreed with Mr. Morris immediately; that he is
to take possession before Michaelmas, and some of his servants are to be
in the house by the end of next week.”
“What is his name?”
“Bingley.”
“Is he married or single?”
“Oh, single, my dear, to be sure! A single man of large fortune; four or
five thousand a year. What a fine thing for our girls!”
“How so? how can it affect them?”
“My dear Mr. Bennet,” replied his wife, “how can you be so tiresome? You
must know that I am thinking of his marrying one of them.”
“Is that his design in settling here?”
“Design? Nonsense, how can you talk so! But it is very likely that he
_may_ fall in love with one of them, and therefore you must visit him as
soon as he comes.”
“I see no occasion for that. You and the girls may go--or you may send
them by themselves, which perhaps will be still better; for as you are
as handsome as any of them, Mr. Bingley might like you the best of the
party.”
“My dear, you flatter me. I certainly _have_ had my share of beauty, but
I do not pretend to be anything extraordinary now. When a woman has five
grown-up daughters, she ought to give over thinking of her own beauty.”
“In such cases, a woman has not often much beauty to think of.”
“But, my dear, you must indeed go and see Mr. Bingley when he comes into
the neighbourhood.”
“It is more than I engage for, I assure you.”
“But consider your daughters. Only think what an establishment it would
be for one of them. Sir William and Lady Lucas are determined to go,
merely on that account; for in general, you know, they visit no new
comers. Indeed you must go, for it will be impossible for _us_ to visit
him, if you do not.”
“You are over scrupulous, surely. I dare say Mr. Bingley will be very
glad to see you; and I will send a few lines by you to assure him of my
hearty consent to his marrying whichever he chooses of the girls--though
I must throw in a good word for my little Lizzy.”
“I desire you will do no such thing. Lizzy is not a bit better than the
others: and I am sure she is not half so handsome as Jane, nor half so
good-humoured as Lydia. But you are always giving _her_ the preference.”
“They have none of them much to recommend them,” replied he: “they are
all silly and ignorant like other girls; but Lizzy has something more of
quickness than her sisters.”
“Mr. Bennet, how can you abuse your own children in such a way? You take
delight in vexing me. You have no compassion on my poor nerves.”
“You mistake me, my dear. I have a high respect for your nerves. They
are my old friends. I have heard you mention them with consideration
these twenty years at least.”
“Ah, you do not know what I suffer.”
“But I hope you will get over it, and live to see many young men of four
thousand a year come into the neighbourhood.”
“It will be no use to us, if twenty such should come, since you will not
visit them.”
“Depend upon it, my dear, that when there are twenty, I will visit them
all.”
Mr. Bennet was so odd a mixture of quick parts, sarcastic humour,
reserve, and caprice, that the experience of three-and-twenty years had
been insufficient to make his wife understand his character. _Her_ mind
was less difficult to develope. She was a woman of mean understanding,
little information, and uncertain temper. When she was discontented, she
fancied herself nervous. The business of her life was to get her
daughters married: its solace was visiting and news.