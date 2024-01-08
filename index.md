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

## Peer Tutoring

TBA

<!--

| Time | Sun | Mon   | Tue  | Wed  | Thur |
|:----:|:---:|:-----:|:----:|:----:|:----:| 
|6-8   |	 | Chris Harvey   |  |      |      |

--->
<!--
# <a name="calendar">Calendar</a>

| Date | Day | Topic                                                       | Assigned               | Due       
| ---  | --- | -----                                                       | ------------           | --------- 
| 8/23 | Wed | Introduction to Java                                        | Hw0: Survey
| 8/25 | Fri | Introduction to Java                                        |                        | Hw0       
|      |
| 8/28 | Mon | Arrays, Memory, Mutation     
| 8/30 | Wed | Designing Classes            
| 9/1  | Fri | Interfaces                                                  | Hw1: Eating Candy      |
|      |
| 9/4  | Mon | Labor Day<br>No Class                    
| 9/6  | Wed | User Input, 2D Arrays                                       |                        | Hw1       
| 9/8  | Fri | Project 1                                                   | Project 1            
|      |
| 9/11 | Mon | Enums                                                       | Hw2: Garden            |
| 9/13 | Wed | Stack Abstraction<br>Array Implementation                   |                      
| 9/15 | Fri | Linked List Implementation                                  | Hw3: ArrayStack Memory | Hw2       
|      |
| 9/18 | Mon | Generics                                  
| 9/20 | Wed | Queue Abstraction<br>Linked List Implementation             |                        | Hw3       
| 9/22 | Fri | Array Implementation                                        | Hw4: ListNode Memory   | Project 1 
|      |
| 9/25 | Mon | ArrayList                                                   |
| 9/27 | Wed | JavaFX GUI                                                  |                        | Hw4          
| 9/29 | Fri | JavaFX GUI                                                  | Hw5: ArrayQueue Memory                       
|      |
| 10/2 | Mon | Priority Queue Abstraction<br>Insertion Sort Implementation | 
| 10/4 | Wed | Heap Abstraction                                            | Project 2              | Hw5
| 10/6 | Fri | Array Implementation of Heaps                               | Hw6: Heaps
|      |
| 10/9 | Mon | Selection Sort<br>Heapsort                                  |                        
| 10/11| Wed | Bubble Sort<br>Merge Sort                                   | Hw7: Sorting           | Hw6
| 10/13| Fri | Fall Break<br>No Class                                      | 
|      |
| 10/16| Mon | Quicksort                                                   | 
| 10/18| Wed | Big O                                                       |                        | Hw7
| 10/20| Fri | Big Omega, Big Theta                                        |                        | Project 2
|      |
| 10/23| Mon | Asymptotic Analysis                                         | Hw8: Big O
| 10/25| Wed | Map and Set Interfaces<br>Binary Search Tree Implementation | Project 3
| 10/27| Fri | Removal from Binary Search Trees                            |                        | Hw8
|      |
| 10/30| Mon | Tree Traversals<br>Tree Balancing<br>Tree Rotations         | Hw9: Trees
| 11/1 | Wed | [Balanced Trees]({{site.baseurl}}/inclass/red_black.html)   |
| 11/3 | Fri | Hash Tables<br>Separate Chaining Implementation             |                        | Hw9
|      |
| 11/6 | Mon | Hash Tables<br>Open Addressing Implementation               | Hw10: Hash Tables      | Project 3
| 11/8 | Wed | Hash Tables<br>Cuckoo Implementation
| 11/10| Fri | Tries                                                       |                        | Hw10
|      |
| 11/13| Mon | Tries
| 11/15| Wed | Designing the Final Project                                 | Project 4            
| 11/17| Fri | Building Large Programs
|      |
| 11/20| Mon | Building Large Programs                                     |                        | Project 4 Design Document
| 11/22| Wed | Thanksgiving Break<br>No Class
| 11/24| Fri | Thanksgiving Break<br>No Class

| 11/27| Mon | Building Large Programs
| 11/29| Wed | Building Large Programs
| 12/1 | Fri | Retrospective
|      |
| 12/7 | Thu 8:30-11:30 am | Project 4 Presentations

-->

<!--
# <a name="inclasscode">In-Class Code</a>

When we write code together in class, it will be posted here!

| Date | Topic | Code |
|:----:|------||-----||
| F 26 Aug | Java Translation | [Warmups.java]({{site.baseurl}}/code/Warmups.java) |
| W 31 Aug | Instantiable Classes | [JackInTheBox.java]({{site.baseurl}}/inclass/Jack/JackInTheBox.java)  [Main.java]({{site.baseurl}}/inclass/Jack/Main.java) |
| F 2 Sep | Interfaces | [Light.java]({{site.baseurl}}/inclass/Lights/Light.java) [ConditionalLight.java]({{site.baseurl}}/inclass/Lights/ConditionalLight.java) [ArrayLight.java]({{site.baseurl}}/inclass/Lights/ArrayLight.java) [Main.java]({{site.baseurl}}/inclass/Lights/Main.java) |
| W 7 Sep | 2D Arrays User Input | [LightsOut.java]({{site.baseurl}}/inclass/LightsOut.java) [Main.java]({{site.baseurl}}/inclass/Main.java) |
| M 12 Sep | Enums | [Coin.java]({{site.baseurl}}/inclass/ChangeMaker/Coin.java) [BetterCoin.java]({{site.baseurl}}/inclass/ChangeMaker/BetterCoin.java) [ChangeMaker.java]({{site.baseurl}}/inclass/ChangeMaker/Main.java) |
-->

<!--
| M 24 Jan |  | [Testing2.java]({{site.baseurl}}/inclass/Testing2.java) |

| F 28 Jan |  | [Fountains Exercise]({{site.baseurl}}/homework/fountain.html) [Fountain.java]({{site.baseurl}}/inclass/Fountain.java) |
| M 31 Jan | Interfaces | [Light.java]({{site.baseurl}}/inclass/Lights/Light.java) [ConditionalLight.java]({{site.baseurl}}/inclass/Lights/ConditionalLight.java) [ArrayLight.java]({{site.baseurl}}/inclass/Lights/ArrayLight.java) [Main.java]({{site.baseurl}}/inclass/Lights/Main.java) |
| W 2 Feb | 2D Arrays User Input | [LightsOut.java]({{site.baseurl}}/inclass/LightsOut.java) [Main.java]({{site.baseurl}}/inclass/Main.java) |
| M 7 Feb | Enums | [Coin.java]({{site.baseurl}}/inclass/ChangeMaker/Coin.java) [BetterCoin.java]({{site.baseurl}}/inclass/ChangeMaker/BetterCoin.java) [ChangeMaker.java]({{site.baseurl}}/inclass/ChangeMaker/Main.java) |
-->

<!--
| F 27 Aug | Instantiable Classes | [JackInTheBox.java]({{site.baseurl}}/inclass/JackInTheBox.java) |
| M 30 Aug | Interfaces | [HolidayLight.java]({{site.baseurl}}/inclass/HolidayLight.java) [ConditionalLight.java]({{site.baseurl}}/inclass/ConditionalLight.java) [ArrayLight.java]({{site.baseurl}}/inclass/ArrayLight.java) |
| W 1 Sep | 2D Arrays User Input | [LightsOut.java]({{site.baseurl}}/inclass/LightsOut.java) [Main.java]({{site.baseurl}}/inclass/Main.java) |
| F 3 Sep | Enums | [Currency.java]({{site.baseurl}}/inclass/Currency.java) [ChangeMaker.java]({{site.baseurl}}/inclass/ChangeMaker.java) |


| M 1 Feb | Mazes | [Maze Project Setup Discussion]({{site.baseurl}}/inclass/MazeStructure.pdf) |
| W 3 Feb | Stacks| [Array Stacks]({{site.baseurl}}/inclass/StackIntro.pdf) |
| M 8 Feb | | [List Stacks]({{site.baseurl}}/inclass/ListStack.pdf) |
| W 10 Feb | Queues| [List Queues]({{site.baseurl}}/inclass/ListQueueMods.pdf) |
| F 12 Feb | | [Array Queues]({{site.baseurl}}/inclass/ArrayQueueFull.pdf) |
| M 15 Feb | Queues and Lists| [Queue Review]({{site.baseurl}}/inclass/QueuePractice.pdf) |
| F 26 Feb | Priority Queues| [Heap Insertion]({{site.baseurl}}/inclass/HeapIntroduction.pdf) |
| M 1 Mar || [Heap Removal]({{site.baseurl}}/inclass/HeapWrapup.pdf) |
| F 5 Mar | Sorting Algorithms| [QuickSort]({{site.baseurl}}/inclass/SortingSummary.pdf) |
| M 8 Mar | | [MergeSort]({{site.baseurl}}/inclass/SortingSummary.pdf) |
| W 10 Mar | Time Complexity| [Counting Steps]({{site.baseurl}}/inclass/StartingToCountSteps.pdf) |
| F 12 Mar | | [Big O, Omega, Theta]({{site.baseurl}}/inclass/BigO.pdf) |
| M 15 Mar | Maps | [Map Interface]({{site.baseurl}}/inclass/MapIntro.pdf) |
| W 17 Mar | Binary Search Trees | [BST Introduction]({{site.baseurl}}/inclass/BST-Intro.pdf) |
| F 19 Mar |  | [BST Remove]({{site.baseurl}}/inclass/BSTRemove.pdf) |
| F 26 Mar | Hash Tables | [Separate Chaining]({{site.baseurl}}/inclass/HashOverview.pdf) |
| M 29 Mar |  | [Linear Probing]({{site.baseurl}}/inclass/HashOmnibus.pdf) |
| M 12 Apr | Tries | [Trie Overview]({{site.baseurl}}/inclass/TrieOverview.pdf) |
| W 14 Apr | | [Trie Remove]({{site.baseurl}}/inclass/TrieRemove.pdf) |



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

[*Adapted from Spencer Bagley and David Clark, via [Robert
Talbert](https://rtalbert.org/a-real-world-approach-to-deadlines/)*]

CSCI 151 uses a **real-world policy** on due dates---but this may not
mean what you think!  In the *real* real world, due dates exist but
they are often not ironclad.  Assignments have due dates to help you 
make progress in the course and solidify your knowledge before moving on 
to something new. Your life and schedule may not perfectly coincide 
with the due dates I have chosen. If you need more time to
get the job done well, you email whoever set the deadline to ask if
you can have more time.  Studies have shown that deadline extension
requests---in moderation and when truly needed---often lead to
*better* employee evaluations (not to mention better work). [*See [Go
Ahead and Ask for More Time on that
Deadline](https://hbr.org/2021/12/go-ahead-and-ask-for-more-time-on-that-deadline)
by Ashley Williams*.]

**If you need an extension on a due date, email me and explain what
you need**, and it will probably be fine.  It helps if you propose a
concrete new deadline (*e.g.* "I can get it done by 5pm on
Wednesday").  If you ask for lots of extensions, we'll work together
to find a way to help you keep up.  Note, however, that late
submissions may not receive feedback as quickly as on-time
submissions.

If you have significant extenuating circumstances that cause you to
miss multiple deadlines, please [come to office
hours](markgoadrich.youcanbook.me) to discuss broader accommodations.  I'm
happy to be flexible, but it helps to know what you need so I can
figure out the best way to help.

{% include important.html content="You must be in communication with me anytime an assignment is late." %}

If you would like to improve an assignment after it has been graded and improve your grade, you may revise and resubmit the assignment until you do. This must be **within two weeks of receiving feedback**. If you need more than two weeks, *you must schedule a meeting with me to discuss your reasons for the delay*.

{% include important.html content="All work and revisions must be completed the day of the final exam period for this course at 5pm." %}

## <a name="labs">Labs</a>

| #  | Name                                                               | Date | Due  |
|:--:|-----                                                               | ---- | ---- |
|1 | [CodingBat]({{site.baseurl}}/labs/codingbat.html)                    | 8/29 | 9/5  |
|2 | [How to Divide a Cake]({{site.baseurl}}/labs/cake.html)              | 9/5  | 9/12 |
|3 | [Mazes: Enums and 2D Arrays]({{site.baseurl}}/labs/maze-enums.html)  | 9/12 | 9/19 |
|4 | [Mazes: Depth First Search]({{site.baseurl}}/labs/maze-dfs.html)     | 9/19 | 9/26 |
|5 | [Mazes: Breadth First Search]({{site.baseurl}}/labs/maze-bfs.html)   | 9/26 | 10/3 |
|6 | [JavaFX GUI]({{site.baseurl}}/labs/javafx.html)                      | 10/3 | 10/10|
|7 | [Mazes: A* Search]({{site.baseurl}}/labs/maze-astar.html)            | 10/10| 10/17|
|8 | [Sortimator]({{site.baseurl}}/labs/sortimator.html)                  | 10/17| 10/24|
|9 | [JavaFX Animation]({{site.baseurl}}/labs/animation.html)             | 10/24| 10/31|
|10 | [Binary Search Trees]({{site.baseurl}}/labs/binarysearchtrees.html) | 10/31| 11/7 |
|11 | [Playing Tic-Tac-Toe]({{site.baseurl}}/labs/tic-tac-toe.html)       | 11/7 | 11/14|
|12 | [Text Prediction]({{site.baseurl}}/labs/text-prediction.html)       | 11/14| 11/21|
|P  | Final Project work day                                              | 11/28| 12/7 |

Much of your experience with programming in this course will be through weekly labs. Each lab will be assigned in lab with time allotted to work through the materials, and will be due **by the start of the following lab**. 

On these labs, you will work with a partner on the lab assignments. Their name must be listed on any code you hand in as joint work. A partnership should only turn in a **single copy** of the assignment. If students working as partners wish to turn in a lab late, all students must use a late day.

{% include important.html content="Lab attendance is required. We will be
stationed in the Snoddy Computer Lab in the library for our lab times." %}

## <a name="hw">Homework</a>

| #  | Name |
|:--:|-----|
|0 | [Survey](https://forms.gle/VLRVHjUAisWP5R9J8) |
|1 | [Eating Candy]({{site.baseurl}}/homework/candy.html) |
|2 | [Planting a Garden]({{site.baseurl}}/homework/garden.html) |
|3 | [ArrayStack Memory]({{site.baseurl}}/homework/asmemory.html) |
|4 | [ListNode Memory]({{site.baseurl}}/homework/lnmemory.html) |
|5 | [ArrayQueue Memory]({{site.baseurl}}/homework/aqmemory.html) |
|6 | [Heaps]({{site.baseurl}}/homework/heaps.html) |
|7 | [Sorting]({{site.baseurl}}/homework/sorting.html) |
|8 | [Asymptotic Analysis]({{site.baseurl}}/homework/bigo.html) |
|9 | [Binary Search Trees]({{site.baseurl}}/homework/trees.html) |
|10 | [Hash Tables]({{site.baseurl}}/homework/hashtables.html) |

There will often be short homework assignments to be completed individually, due in one week. These will be practice to
help you solidify the concepts from class before labs and projects.

{% include warning.html content="You must work individually on the homeworks. You may discuss concepts and ideas with your classmates, but the code or work you turn in must be your own." %}

## <a name="projects">Skills Projects</a>

| #  | Name | 
|:--:|-----|
|1 | [Java and Arrays]({{site.baseurl}}/projects/arrays.html)  |
|2 | [GUI]({{site.baseurl}}/projects/gui.html) |
|3 | [Animation]({{site.baseurl}}/projects/animation.html) |

You will have three skills projects in this course, one about every four weeks. These projects will cover concepts we have discussed in class and in labs, and will be due approximately two weeks after they are assigned.

You will be graded not only on correctness, but also technique, documentation and evaluation of your solution. Further details on the grading standards and handin instructions for each project will be given when they are assigned.

{% include warning.html content="You must work individually on these three projects. You may discuss concepts and ideas with your classmates, but the code you turn in must be your own." %}

## <a name="finalproject">Final Project</a>

| #  | Name |
|:--:|-----||:------:|
|4 | [Final Project]({{site.baseurl}}/projects/final-project.html) |

## <a name="checkins">Checkins</a>

Three times throughout the semester, you are expected to
make an office hours appointment and discuss your progress in the course. This will include conversation and feedback about your current progress and understanding.
Ideally, these checkins should be scheduled during the weeks shown
on the [course calendar](https://prod.teamgantt.com/gantt/schedule/?ids=3800427&public_keys=9EXxMLt23f63&zoom=d100&font_size=12&estimated_hours=0&assigned_resources=0&percent_complete=0&documents=0&comments=0&col_width=355&hide_header_tabs=0&menu_view=1&resource_filter=1&name_in_bar=0&name_next_to_bar=0&resource_names=1&resource_hours=1#user=&company=&custom=&date_filter=&hide_completed=&color_filter=).

## <a name="attendance">Attendance</a>

Attending class and being an active participant in the class community
is one of the [most important contributors to your learning at Hendrix](https://www.hendrix.edu/Catalog/2023-2024/Academic_Policies_and_Regulations/Policies_and_Appeals/D_6_e__Class_Attendance/).
Attendance is especially important in this class since you will often engage in group learning activities. Active participation is expected in order to achieve higher grade levels in the course. 

If you know that you will be absent, please email me so that we can find accomodations. If there is an emergency, please get in touch with me as soon as is possible once the emergency is resolved. I trust you to be honest with me about your reasons for the absence (I do not need details), and honest with yourself about if you truly need to be absent. **If you do not communicate with me about your absence, it will be unexcused.**

## <a name="scale">Specifications Grading</a>

Each assignment is assessed as **Complete**, **Partially Complete** or **Missing**. Criteria for the first two categories will be specified for each assignment. Final course grades are earned based on cumulative assignment outcomes:

### A Level Work

* Complete all 3 Skills projects
* Complete the Final Project
* Complete 11 of 12 Labs + 1 Partially Complete
* Complete 9 of 10 Homeworks
* Abundant Participation in Classroom Activities (no unexcused absences)

### B Level Work

* Complete all 3 Skills Projects
* One of these two options:
  * Option 1:
    * Partially Complete the Final Project
    * Complete 11 of 12 Labs + 1 Partially Complete
    * Complete 9 of 10 Homeworks
  * Option 2:
    * Complete the Final Project
    * Complete 10 of 12 Labs + 1 Partially Complete
    * Complete 8 of 10 Homeworks
* Active Participation in Classroom Activities (at most one unexcused absence)

### C Level Work

* Complete 2 of 3 Skills projects + 1 Partially Complete
* One of these three options:
  * Option 1:
    * Complete 11 of 12 Labs + 1 Partially Complete
    * Complete 9 of 10 Homeworks
  * Option 2: 
    * Partially Complete the Final Project
    * Complete 10 of 12 Labs + 1 Partially Complete
    * Complete 8 of 10 Homeworks
  * Option 3:
    * Complete the Final Project
    * Complete 8 of 12 labs + 1 Partially Complete
    * Complete 6 of 10 Homeworks
* Participation in Classroom Activities (at most three unexcused absences)

### D Level Work

* Complete 6 of 12 Labs + 3 Partially Complete
* Complete 5 of 10 Homeworks
* Complete 1 of 3 Skills projects + 2 Partially Complete

<!--

## <a name="tokens">Tokens</a>
* Each student starts the semester with six **tokens**.
* Send Dr. Ferrer a message on Teams to spend a token.
* Students may **spend tokens** as follows:
  * Spend **one** token to submit a revised version of an assignment in the event the submission receives a **Partial** assessment.
  * Spend **two** tokens to receive an extension to an assignment deadline. 
    * When requesting an extension, specify the new deadline that you think will suffice.
    * Most deadline requests will be approved, but the instructor reserves the right to limit extensions if he deems them unreasonable.
  * Spend **three** tokens to submit an assignment after its deadline.
* Students may **earn additional tokens** as follows:
  * Scheduling and attending an **office hours** meeting with [Dr. Ferrer](https://drferrer.youcanbook.me) earns one additional token.
  * Creating a **practice problem** for some topic covered in the course, along with a correct solution, earns two tokens.
  * Creating some sort of **educational material** for the course earns four tokens.
    * Examples of the sorts of things you might create include (but are not limited to):
      * A video or animation explaining a concept from the course
      * A document with explanation or examples of concepts from the course
    * To earn a token the educational material must, in my judgment, be potentially helpful to other Data Structures students, present or future. If your educational material does not meet this criterion, I will work with you to revise it until it does.
    * With your permission, and appropriate attribution, materials you create will be posted to the course website.
* **Note**: All late submissions/revisions must be received before 5 pm on Tuesday, 
  December 12, the last day of the semester.

-->

<!--Assignments have due dates to help you make progress in the course and solidify your knowledge before moving on to something new. Your life and schedule may not perfectly coincide with the due dates I have chosen. Therefore, each student starts the course with **four late days** to spend throughout the semester as they wish. Simply inform me any time *prior* to the due date for an assignment that you wish to use a late day and the reason you need an extension; you may then turn in the assignment up to 24 hours late. Multiple late days may be used on the same assignment. There are no partial late days; turning in an assignment 2 hours late or 20 hours late will both use 1 late day. -->

<!-- After you have used up your four late days, **you must schedule a meeting with me to earn more late days**, otherwise late assignments will not be accepted. -->

<!--{% include note.html content="Late days are intended to cover both normal circumstances (you simply want more time to work on the assignment) and exceptional circumstances (you get sick, travel for a game or family obligation, *etc.*)." %}-->

<!--{% include important.html content="You must be in communication with me anytime an assignment is late." %}-->

<!--If you would like to improve an assignment after it has been graded and improve your grade, you may revise and resubmit the assignment until you do. There is no deadline for resubmitted assignments.-->

<!--However, the above only applies if you **made a reasonable attempt at the assignment the first time**. You cannot turn in a half-finished assignment before the deadline and then “revise” it by completing the rest. If your assignment is only half-finished, you must request use late days as described above.-->

<!--{% include important.html content="All work and revisions must be completed the day of the final exam period for this course at 5pm." %}-->
