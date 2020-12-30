---
# Feel free to add content and custom Front Matter to this file.
# To modify the layout, see https://jekyllrb.com/docs/themes/#overriding-theme-defaults

layout: course-multi
---

# <a name="description">Overview</a>

{{ site.description }}

## <a name="goals">Learning Goals</a>

Upon completing this course, our goal is for you to be able to:

1. Build substantial computer programs with graphical user interfaces to effectively solve realistic problems.
2. Understand and implement fundamental data structures to manage complexity.
3. Explain the compromises necessary to develop efficient programs.
4. Use and justify appropriate programming algorithms for specific tasks.
5. Decouple problem specification from program implementation through abstraction.
6. Employ test-driven and empirical methods to understand the behavior of a program.
7. Discuss the ways programming languages employ distinct features to solve problems.
8. Develop an aptitude and skills for independent learning.

## <a name="resources">Software</a>

{% include resources.html content=site.resources %}

## <a name="additional-resources">Resources</a>

{% include resources.html content=site.extra-resources %}

<hr>

# Attendance

We will be meeting this semester on campus. Remote learning will be accessible
through Microsoft Teams and the OWL in the classroom.
This course will be using all of our scheduled time slots (8:10 - 9:00am MWF) for synchronous meetings
throughout the semester. I expect you to be present and participating in our discussions
and small group work sessions. If you are remote for any reason, I expect you to participate with video and audio turned on for at least part of
each class. If you have difficulties meeting these expectations,
please contact me, the Office of Academic Success, the IT HelpDesk, and the Provost's Office
to discuss alternate accomodations.


# <a name="inclasscode">In-Class Code</a>

When we write code together in class, it will be posted here!


<!--
| Date | Topic | Code |
|:----:|------||-----||
| F 21 Aug | Python Review | |
| M 24 Aug | Intro to Java | [MondaySample.java]({{site.baseurl}}/code/MondaySample.java) |
| W 26 Aug | Java Memory and Arrays | [StackHeap1]({{site.baseurl}}/inclass/StackHeap1.pdf) [StackHeap2]({{site.baseurl}}/inclass/StackHeap2.pdf) |
| F 28 Aug | Instantiable Classes | [JackInTheBox.java]({{site.baseurl}}/inclass/JackInTheBox.java) |
| M 31 Aug | Interfaces | [HolidayLight.java]({{site.baseurl}}/inclass/HolidayLight.java) [ConditionalLight.java]({{site.baseurl}}/inclass/ConditionalLight.java) [ArrayLight.java]({{site.baseurl}}/inclass/ArrayLight.java) |
| F 4 Sep | 2D Arrays User Input | [LightsOut.java]({{site.baseurl}}/inclass/LightsOut.java) [Main.java]({{site.baseurl}}/inclass/Main.java) |
| M 7 Sep | Enums | [Currency.java]({{site.baseurl}}/inclass/Currency.java) [ChangeMaker.java]({{site.baseurl}}/inclass/ChangeMaker.java) |
| W 9 Sep | ArrayStack | [DirectionInRoom.pdf]({{site.baseurl}}/inclass/DirectionInRoom.pdf) [PostFixCalculator.pdf]({{site.baseurl}}/inclass/PostFixCalculator.pdf) [ArrayStack.pdf]({{site.baseurl}}/inclass/ArrayStack.pdf) |
| M 14 Sep | ListStack and Generics | [StacksAndGenerics.pdf]({{site.baseurl}}/inclass/StacksAndGenerics.pdf) |
| W 16 Sep | ListQueue | [ListQueue.pdf]({{site.baseurl}}/inclass/ListQueue.pdf) |
| F 18 Sep | ArrayQueue | [ArrayQueue.pdf]({{site.baseurl}}/inclass/ArrayQueue.pdf) |
| M 21 Sep | Lists | [Lists.pdf]({{site.baseurl}}/inclass/Lists.pdf) |
| F 2 Oct | Heaps | [PriorityQueueInsert.pdf]({{site.baseurl}}/inclass/PriorityQueueInsert.pdf) |
| M 5 Oct |  | [HeapRemove.pdf]({{site.baseurl}}/inclass/HeapRemove.pdf) |
| W 7 Oct | Selection and Bubble Sort | [SortingAlgorithms.pdf]({{site.baseurl}}/inclass/SortingAlgorithms.pdf) |
| F 9 Oct | Merge Sort | [MergeSort.pdf]({{site.baseurl}}/inclass/MergeSort.pdf) |

-->

<hr>
# Coursework

Each student has **four late days** to spend throughout the semester as they wish.
Simply inform the instructor any time *prior* to the due date for an assignment
that you wish to use a late day; you may then turn in the assignment up to 24
hours late. Multiple late days may be used on the same assignment. There are no
partial late days; turning in an assignment 2 hours late or 20 hours late will
both use 1 late day. Note that late days are intended to cover both normal
circumstances (you simply want more time to work on the assignment) and
exceptional circumstances (you get sick, travel for a game or family
obligation, *etc.*). After you have used up your late days, late assignments
will receive at most half credit. All work must be completed the day before final grades are due.
**You must be in communication with me when assignments are late.**

## <a name="labs">Labs</a>: 300 points

| #  | Name |
|:--:|-----|
|0 | [Survey](https://forms.gle/9MBCMbJe1THhxX3n6) |
|1 | [CodingBat]({{site.baseurl}}/labs/codingbat.html) |
|2 | [Prisoner's Dilemma]({{site.baseurl}}/labs/dilemma.html) |
|3 | [Mazes: Enums and 2D Arrays]({{site.baseurl}}/labs/maze-enums.html) |
|4 | [Mazes: Depth First Search]({{site.baseurl}}/labs/maze-dfs.html) |
|5 | [Mazes: Breath First Search]({{site.baseurl}}/labs/maze-bfs.html) |
|6 | [JavaFX and GUIs]({{site.baseurl}}/labs/javafx.html) |
|7 | [Mazes: A* Search]({{site.baseurl}}/labs/maze-astar.html) |
|8 | [Sortimator]({{site.baseurl}}/labs/sortimator.html) |
|9 | [Text Adventure]({{site.baseurl}}/labs/adventure.html) |
|10 | [Binary Search Trees]({{site.baseurl}}/labs/binarysearchtrees.html) |
|11 | [Playing Tic-Tac-Toe]({{site.baseurl}}/labs/tic-tac-toe.html) |
|12 | [Text Prediction]({{site.baseurl}}/labs/text-prediction.html) |

Much of your experience with programming in this course will be through weekly labs. Each lab will be assigned in lab with time allotted to work through the materials, and will be due **by the start of the following lab**. All labs are weighted equally within the lab portion of your final grade.

On these labs, you will work with a partner on the lab assignments. Their name must be listed on any code you hand in as joint work. A partnership should only turn in a **single copy** of the assignment. If students working as partners wish to turn in a lab late, all students must use a late day.

**Lab attendance is required**. Labs take place on Microsoft Teams. I will be
stationed in the Snoddy Computer Lab in the library for our lab times. If you
need to use computing resources on campus for these labs, please contact me
so we can find accomodations.

## <a name="projects">Projects</a>: 400 points

| #  | Name | Points |
|:--:|-----||:------:|
|1 | [Java and Arrays]({{site.baseurl}}/projects/arrays.html)  | 50  |
|2 | [GUI and Animation]({{site.baseurl}}/projects/gui-animation.html) | 100 |
|3 | [Final Project]({{site.baseurl}}/projects/final-project.html) | 250 |

You will have three projects in this course, one about every five weeks. These projects will cover concepts we have discussed in class and in labs, and will be due approximately two weeks after they are assigned.

**You must work individually on the first two projects.** You may discuss concepts and ideas with your classmates, but the code you turn in must be your own. You will be graded not only on correctness, but also technique, documentation and evaluation of your solution. Further details on the grading standards and handin instructions for each project will be given when they are assigned.

## <a name="exams">Exams</a>: 200 points

There will be two exams, both worth 100 points of your final grade.
They will consist of short answer questions along with writing and debugging code.

* Exam 1: covering basic Java commands, classes, objects, enums, 2D arrays, stacks, and queues
* Exam 2: covering heaps, sorting algorithms, algorithmic analysis, lists, trees, and hash tables

There is no final exam; you will complete a final project instead, as described above under Projects.

## <a name="checkins">Checkins and Participation</a>: 100+ points

Three times throughout the semester, you are expected to
make an office hours appointment and check in with me about the course. Each checkin
meeting will count for 15 points.
This will be conversation and feedback about your current progress and understanding.
These should be scheduled during the weeks shown
on the [course calendar](https://app.teamgantt.com/public/projects/calendar/2020-12-27?ids=2460416&prefs=P2lkcz0yNDYwNDE2JnB1YmxpY19rZXlzPTFJWXJncWM1N3ludyZ6b29tPWQxMDAmZm9udF9zaXplPTEyJmVzdGltYXRlZF9ob3Vycz0wJmFzc2lnbmVkX3Jlc291cmNlcz0wJnBlcmNlbnRfY29tcGxldGU9MCZkb2N1bWVudHM9MCZjb21tZW50cz0wJmNvbF93aWR0aD0zNTUmaGlkZV9oZWFkZXJfdGFicz0wJm1lbnVfdmlldz0xJnJlc291cmNlX2ZpbHRlcj0xJm5hbWVfaW5fYmFyPTAmbmFtZV9uZXh0X3RvX2Jhcj0wJnJlc291cmNlX25hbWVzPTEmcmVzb3VyY2VfaG91cnM9MQ%3D%3D&projectIds=2460416&publicKeys=1IYrgqc57ynw).

Also, there will be many opportunities to accumulate small amounts of points
throughout the semester by participating in classroom exercises and
reflecting on the material. These will total at least 40 points, most likely more.

<!--
| #  | Name | Points |
|:--:|-----||:--------:|
| 1 | Making Toast | 6 |
-->

## <a name="scale">Grading Scale</a>

| Score  | Grade  |
|:------:|:------:|
| 900-1000  | A   |
| 800-899   | B   |
| 700-799   | C   |
| 600-699   | D   |
| 0-599     | F   |
