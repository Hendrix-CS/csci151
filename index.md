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

TBA
<!--
| Sunday           | Monday         | Tuesday     | Wednesday     | Thursday
|------------------|----------------|-------------|---------------|--------- 
| 6-8 PM           | 5-7 PM         | 7-9 PM      | 7-9 PM        | 6-8 PM
| Katherine Reid   | Leigh Johnston | Ted Bjurlin | Joseph Washum | Jauss Favorite

-->


<hr>
# Coursework

[*Adapted from Spencer Bagley and David Clark, via [Robert
Talbert](https://rtalbert.org/a-real-world-approach-to-deadlines/)*]

CSCI 370 uses a **real-world policy** on due dates---but this may not
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
miss multiple deadlines, please [come to office hours](markgoadrich.youcanbook.me) 
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
|0 | [Survey](https://forms.gle/brYNvuWqYEEcXq3A7) | n/a |
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
|1 | [CodingBat]({{site.baseurl}}/labs/codingbat.html)                    
|2 | [How to Divide a Cake]({{site.baseurl}}/labs/cake.html)              
|3 | [Mazes: Enums and 2D Arrays]({{site.baseurl}}/labs/maze-enums.html)  
|4 | [Mazes: Depth First Search]({{site.baseurl}}/labs/maze-dfs.html)     
|5 | [Mazes: Breadth First Search]({{site.baseurl}}/labs/maze-bfs.html)   
|6 | [JavaFX GUI]({{site.baseurl}}/labs/javafx.html)                     
|7 | [Mazes: A* Search]({{site.baseurl}}/labs/maze-astar.html)            
|8 | [Sortimator]({{site.baseurl}}/labs/sortimator.html)                  
|9 | [JavaFX Animation]({{site.baseurl}}/labs/animation.html)             
|10 | [Binary Search Trees]({{site.baseurl}}/labs/binarysearchtrees.html) 
|11 | [Playing Tic-Tac-Toe]({{site.baseurl}}/labs/tic-tac-toe.html)       
|12 | [Text Prediction]({{site.baseurl}}/labs/text-prediction.html)       
|P  | Final Project work day                                              

Each lab consists of a series of milestones. At the start of each lab, you will receive a sheet of paper listing the milestones for that lab. As you achieve each milestone, you will demonstrate to the instructor or TA that you have met the milestone, and they will record this achievement on your checklist. When you complete all of the lab milestones, you will submit the milestone checklist.

If you complete the lab during the lab period, hand your checklist to your lab instructor before you leave the lab. If you require additional time beyond the lab period to complete the lab, either the instructor or the lab TA can check off the remaining milestones during office hours. You can then submit the completed checklist to the instructor at the start of the next lab.

You will work with a partner on each lab assignment. Each partner will have their own milestone checklist. If they do not complete the milestones during the lab period, they should find time outside of lab to work together to complete them. If they are unable to do so, only the instructor is authorized to record milestones for students working alone.

{% include important.html content="Lab attendance is required. We will be
stationed in the Snoddy Computer Lab in the library for our lab times." %}

**Credit**:
* Submitting the completed lab check-off sheet by the start of the next lab earns two credits.
* Submitting the completed lab check-off sheet at a later date earns one credit.
* All check-off sheets must be submitted by Thursday, May 8 at 5 pm.

## <a name="projects">Skills Projects</a>

| #  | Name | 
|:--:|-----|
|1 | [Java and Arrays]({{site.baseurl}}/projects/arrays.html)  |
|2 | [GUI]({{site.baseurl}}/projects/gui.html) |
|3 | [Animation]({{site.baseurl}}/projects/animation.html) |

You will have three skills projects in this course, one about every four weeks. These projects will cover concepts we have discussed in class and in labs, and will be due approximately two weeks after they are assigned.

{% include warning.html content="You must work individually on the projects. You may discuss concepts and ideas with your classmates, but the **code or work you turn in must be your own**. Use of any resources (TA, StackOverflow, ChatGPT, etc) must be cited, and an overreliance on those resources can be counterproductive to developing your own ability to make progress in this and other courses." %}

## <a name="finalproject">Final Project</a>

| #  | Name |
|:--:|-----||:------:|
|4 | [Final Project]({{site.baseurl}}/projects/final-project.html) |

Each project will be assessed as **Level 1 Complete** or **Level 2 Complete**, with criteria specified individually
for each project. You will be graded not only on correctness, but also technique, documentation and evaluation of 
your solution. 

Note that the final project must be submitted on-time to earn credit - no final projects
will be accepted late. Projects earn **credits** as follows:

| Project | Level 1 Complete | Level 2 Complete | Unexcused Late | Maximum Credit |
| ------: | ---------:       | ----------:      | ------------: | -------------: |
| 1       | 2                |  5               | -1             |  5             |
| 2       | 2                |  5               | -1             |  5             |
| 3       | 2                |  5               | -1             |  5             |
| 4       | 6                | 12               | None          | 12             |

If a project receives less than Level 2 Complete, a student may submit a revised version of the project after an
office hours meeting with the instructor to discuss how the project should be improved. All project revisions must
be submitted by Thursday, May 8 at 5 pm.

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
  * No more than two unexcused absence
* To earn a C in the course, a student will:
  * Complete the course survey
  * Achieve at least **Basic** in all three categories.
  * Achieve one of:
    * **Advanced** in at least one category.
    * **Intermediate** in at least two categories.
  * No more than three unexcused absence
* To earn a D in the course, a student will:
  * Achieve at least **Basic** in all three categories.
