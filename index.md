---
# Feel free to add content and custom Front Matter to this file.
# To modify the layout, see https://jekyllrb.com/docs/themes/#overriding-theme-defaults

layout: course-multi
---
<br/>

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

| Monday         | Tuesday       | Wednesday      | Thursday
|----------------|---------------|----------------|--------- 
| TBA            | TBA           | TBA            | TBA


# <a name="calendar">Calendar</a>

| Date | Day | Topic                                                       | Assigned               | Due       
| ---  | --- | -----                                                       | ------------           | --------- 
| 8/27 | Wed | Introduction to Java                                        | Survey
| 8/29 | Fri | Introduction to Java                                        |                        | Survey
|      |
| 9/1  | Mon | Labor Day<br>No Class     
| 9/3  | Wed | Arrays, Memory, Mutation            
| 9/5  | Fri | Designing Classes                                           | FA1: Eating Candy      |
|      |
| 9/8  | Mon | Interfaces                    
| 9/10 | Wed | User Input, 2D Arrays                                       |                        |       
| 9/12 | Fri | Project 1                                                   |Project 1<br>FA2: Garden| FA1 
|      |
| 9/15 | Mon | Enums                                                       |                        |
| 9/17 | Wed | Stack Abstraction<br>Array Implementation                   |                        |
| 9/19 | Fri | Linked List Implementation                                  | FA3: ArrayStack Memory | FA2       
|      |
| 9/22 | Mon | Generics                                  
| 9/24 | Wed | Queue Abstraction<br>Linked List Implementation             |                        |       
| 9/26 | Fri | Array Implementation                                        | FA4: ListNode Memory   | FA3 
|      |
| 9/29 | Mon | ArrayList                                                   |                        | Project 1
| 10/1 | Wed | JavaFX GUI                                                  |                        |           
| 10/3 | Fri | JavaFX GUI                                                  | FA5: ArrayQueue Memory | FA4                      
|      |
| 10/6 | Mon | Priority Queue Abstraction<br>Insertion Sort Implementation | 
| 10/8 | Wed | Heap Abstraction                                            | Project 2              
| 10/10| Fri | Array Implementation of Heaps                               | FA6: Heaps             | FA5
|      |
| 10/13| Mon | Selection Sort<br>Heapsort                                  |                        
| 10/15| Wed | Bubble Sort<br>Merge Sort                                   | FA7: Sorting           | FA6
| 10/17| Fri | Fall Break<br>No Class                                      | 
|      |
| 10/20| Mon | Quicksort                                                   | 
| 10/22| Wed | Big O                                                       |                        
| 10/24| Fri | Big Omega, Big Theta                                        |                        | FA7
|      |
| 10/27| Mon | Asymptotic Analysis                                         | FA8: Big O             | Project 2
| 10/29| Wed | Map and Set Interfaces<br>Binary Search Tree Implementation | Project 3
| 10/31| Fri | Removal from Binary Search Trees                            |                        | FA8
|      |
| 11/3 | Mon | Tree Traversals<br>Tree Balancing<br>Tree Rotations         | FA9: Trees
| 11/5 | Wed | [Balanced Trees]({{site.baseurl}}/inclass/red_black.html)   |
| 11/7 | Fri | Hash Tables<br>Separate Chaining Implementation             |                        | FA9
|      |
| 11/10| Mon | Hash Tables<br>Open Addressing Implementation               | FA10: Hash Tables      | Project 3
| 11/12| Wed | Hash Tables<br>Cuckoo Implementation
| 11/14| Fri | Splay Trees                                                 |                        | FA10
|      |
| 11/17| Mon | Splay Trees
| 11/19| Wed | Designing the Final Project                                 | Project 4            
| 11/21| Fri | Building Large Programs
|      |
| 11/24| Mon | Building Large Programs                                     |                        | Project 4 Design Document
| 11/26| Wed | Thanksgiving Break<br>No Class
| 11/28| Fri | Thanksgiving Break<br>No Class

| 12/1 | Mon | Building Large Programs |
| 12/3 | Wed | Building Large Programs |
| 12/5 | Fri | Retrospective           |
|      |
| 12/11| Thu 8:30-11:30 am | Project 4 Presentations

<hr>
# Coursework

If you have significant extenuating circumstances that cause you to
miss multiple deadlines, please [come to office hours](drferrer.youcanbook.me) 
to discuss broader accommodations.  I'm
happy to be flexible, but it helps to know what you need so I can
figure out the best way to help.

{% include important.html content="You must be in communication with me anytime an assignment is late." %}

## <a name="hw">Formative Assessments</a>

Each formative assessment involves doing some preparatory work followed by visiting the instructor's office hours
for a demonstration of understanding. There are three types of formative assessments:
* **Java Programming**: For these assessments, you will begin by creating a Java program as directed below. 
  During your office hours visit, you will demonstrate it to the instructor, followed by modifying the program
  as the instructor directs.
* **Problem Solving**: For these assessments, you will study a problem prior to your office hours visit. During 
  the visit, you will demonstrate and explain your solution to the problem. If it is not correct, you and the 
  instructor will discuss the correct solution. Following this conversation, you will be given a closely related
  problem to solve. If you solve it correctly, you will receive full credit.
* **Data Structure Demonstration**: For these assessments, you will demonstrate the operation of a data structure
  using the [CS2 Mulch Manipulatives](https://mgoadric.github.io/cs2mulch/). To prepare for your demonstration,
  review Java programs you write in lab in which you built the data structure. Also review the appropriate
  [demonstration](https://mgoadric.github.io/cs2mulch/tree/)
  [videos](https://mgoadric.github.io/cs2mulch/hash/) and practice using 
  [Tabletopia](https://tabletopia.com/games/cs2-mulch-fq1guf/play-now) prior to your office hours visit.


| #  | Name | Assessment Type | 
|:--:|------| ----------------| 
|0 | [Survey](https://docs.google.com/forms/d/e/1FAIpQLSeQGqE8Y764GekmoTdWrZ7WcYmZRVbO4pel1EeX2GqR7yA4TA/viewform) | n/a |
|1 | [Eating Candy]({{site.baseurl}}/homework/candy.html) | Java Programming |
|2 | [Planting a Garden]({{site.baseurl}}/homework/garden.html) | Java Programming |
|3 | [ArrayStack Memory]({{site.baseurl}}/homework/asmemory.html) | Problem Solving |
|4 | [ListNode Memory]({{site.baseurl}}/homework/lnmemory.html) | Problem Solving |
|5 | [ArrayQueue Memory]({{site.baseurl}}/homework/aqmemory.html) | Problem Solving |
|6 | [Heaps]({{site.baseurl}}/homework/heaps.html) | Data Structure Demonstration |
|7 | [Sorting]({{site.baseurl}}/homework/sorting.html) | Data Structure Demonstration |
|8 | [Asymptotic Analysis]({{site.baseurl}}/homework/bigo.html) | Problem Solving |
|9 | [Binary Search Trees]({{site.baseurl}}/homework/trees.html) | Data Structure Demonstration |
|10 | [Hash Tables]({{site.baseurl}}/homework/hashtables.html) | Data Structure Demonstration |

**Credit**:
* A successful demonstration earns two credits.
* A sincere attempt at a demonstration that is lacking in some manner earns one credit.
  * A student is welcome to schedule a follow-up meeting to make an additional attempt 
    to earn full credit.
* Attempting the demonstration by the deadline earns one additional credit.
* All demonstrations must be completed by Tuesday, December 17 at 5 pm.
  
Each formative assessment will be assigned on a Friday. To receive credit for an on-time
demonstration, the office hours visit will need to occur by the following Friday at 5 pm.

## <a name="labs">Labs</a>

| #  | Name                                                               
|:--:|-----                                                               
|1  | [CodingBat]({{site.baseurl}}/labs/codingbat.html)                    
|2  | [How to Divide a Cake]({{site.baseurl}}/labs/cake.html)              
|3  | [Mazes: Enums and 2D Arrays]({{site.baseurl}}/labs/maze-enums.html)  
|4  | Mazes: Depth First Search   
|5  | [Mazes: Depth and Breadth First Search]({{site.baseurl}}/labs/maze-dfs-bfs.html)   
|6  | [JavaFX GUI]({{site.baseurl}}/labs/javafx.html)                     
|7  | [Mazes: A* Search]({{site.baseurl}}/labs/maze-astar.html)            
|8  | [Sortimator]({{site.baseurl}}/labs/sortimator.html)                  
|9  | [JavaFX Animation]({{site.baseurl}}/labs/animation.html)             
|10 | [Binary Search Trees]({{site.baseurl}}/labs/binarysearchtrees.html) 
|11 | [Playing Tic-Tac-Toe]({{site.baseurl}}/labs/tic-tac-toe.html)       
|12 | [Splay Trees]({{site.baseurl}}/labs/splaytrees.html)       
|P  | Final Project work day                                              

Each lab consists of a series of milestones. At the start of each lab, you will receive a sheet of paper listing the milestones for that lab. As you achieve each milestone, you will demonstrate to the instructor or TA that you have met the milestone, and they will record this achievement on your checklist. When you complete all of the lab milestones, you will submit the milestone checklist.

If you complete the lab during the lab period, hand your checklist to your lab instructor before you leave the lab. If you require additional time beyond the lab period to complete the lab, either the instructor or the lab TA can check off the remaining milestones during office hours. You can then submit the completed checklist to the instructor at the start of the next lab.

You will work with a partner on each lab assignment. Each partner will have their own milestone checklist. If they do not complete the milestones during the lab period, they should find time outside of lab to work together to complete them. If they are unable to do so, only the instructor is authorized to record milestones for students working alone.

{% include important.html content="Lab attendance is required. We will be
stationed in the Snoddy Computer Lab in the library for our lab times." %}

**Credit**:
* Submitting the completed lab check-off sheet by the start of the next lab earns two credits.
* Submitting the completed lab check-off sheet at a later date earns one credit.
* All check-off sheets must be submitted by Tuesday, December 16 at 5 pm.

## <a name="projects">Skills Projects</a>

| #  | Name | 
|:--:|-----|
|1 | [Java and Arrays]({{site.baseurl}}/projects/arrays.html)  |
|2 | [GUI]({{site.baseurl}}/projects/gui.html) |
|3 | [Animation]({{site.baseurl}}/projects/animation.html) |

You will have three skills projects in this course, one about every four weeks. 
These projects will cover concepts we have discussed in class and in labs, and 
will be due approximately two weeks after they are assigned.

{% include warning.html content="You must work individually on the projects. 
You may discuss concepts and ideas with your classmates, but the 
**code or work you turn in must be your own**. Use of any resources 
(TA, StackOverflow, ChatGPT, etc) must be cited, and an overreliance on those 
resources can be counterproductive to developing your own ability to make 
progress in this and other courses." %}

## <a name="finalproject">Final Project</a>

| #  | Name |
|:--:|-----||:------:|
|4 | [Final Project]({{site.baseurl}}/projects/final-project.html) |

Each project will be assessed as **Level 1 Complete** or **Level 2 Complete**, with criteria specified individually
for each project. You will be graded not only on correctness, but also technique, documentation and evaluation of 
your solution. 

Note that the final project must be submitted on-time to earn credit - no final projects
will be accepted late. Projects earn **credits** as follows:

| Project | Level 1 Complete | Level 2 Complete | On-time Bonus | Maximum Credit |
| ------: | ---------:       | ----------:      | ------------: | -------------: |
| 1       | 2                |  4               | 1             |  5             |
| 2       | 2                |  4               | 1             |  5             |
| 3       | 2                |  4               | 1             |  5             |
| 4       | 6                | 12               | None          | 12             |

If a project receives less than Level 2 Complete, a student may submit a revised version of the project after an
office hours meeting with the instructor to discuss how the project should be improved. All project revisions must
be submitted by Tuesday, December 16 at 5 pm.

## <a name="attendance">Attendance</a>

Attending class and being an active participant in the class community
is one of the [most important contributors to your learning at Hendrix](https://www.hendrix.edu/Catalog/2023-2024/Academic_Policies_and_Regulations/Policies_and_Appeals/D_6_e__Class_Attendance/).
Attendance is especially important in this class since you will often engage in group learning activities. Active participation is expected in order to achieve higher grade levels in the course. 

If you know that you will be absent, please email me so that we can find accomodations. If there is an emergency, please get in touch with me as soon as is possible once the emergency is resolved. I trust you to be honest with me about your reasons for the absence (I do not need details), and honest with yourself about if you truly need to be absent. **If you do not communicate with me about your absence, it will be unexcused.**

## <a name="scale">Specifications Grading</a>

Final course grades are earned based on cumulative assignment outcomes. For each
category of assessment, there are three levels of mastery: **Basic**, **Intermediate**, and **Advanced**.

### Formative Assessments
From the 10 formative assessments, 30 total credits are available:
* **Basic**: Earn 16 formative assessment credits
* **Intermediate**: Earn 22 formative assessment credits
* **Advanced**: Earn 28 formative assessment credits

### Labs
From the 12 labs, 24 total credits are available:
* **Basic**: Earn 15 lab credits, maximum of two unexcused absences
* **Intermediate**: Earn 19 lab credits, maximum of one unexcused absence
* **Advanced**: Earn 23 lab credits, no unexcused absences

**Remember**: For an absence to be **excused**, the student must discuss the 
circumstances with the lab instructor prior to missing the lab.

### Projects
From the four projects, 27 total credits are available:
* **Basic**: Earn 12 project credits
* **Intermediate**: Earn 19 project credits
* **Advanced**: Earn 26 project credits

### Final Course Grade
* To earn an A in the course, a student will:
  * Complete the course survey.
  * Achieve **Advanced** in all three categories
  * No more than one unexcused absence
* To earn a B in the course, a student will:
  * Complete the course survey.
  * Achieve at least **Intermediate** in all three categories.
  * Achieve **Advanced** in at least one category.
  * No more than two unexcused absences
* To earn a C in the course, a student will:
  * Complete the course survey
  * Achieve at least **Basic** in all three categories.
  * Achieve one of:
    * **Advanced** in at least one category.
    * **Intermediate** in at least two categories.
  * No more than three unexcused absences
* To earn a D in the course, a student will:
  * Achieve at least **Basic** in all three categories.
