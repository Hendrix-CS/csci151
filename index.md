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

| Sun   | Mon   | Tue  | Wed  | Thur |
|:-----:|:-----:|:----:|:----:|:----:| 
|	TBA | TBA   | TBA  |      |      |


# <a name="inclasscode">In-Class Code</a>

When we write code together in class, it will be posted here!

| Date     | Topic        | Code |
|:--------:|--------------|------|
| W 28 Aug | Introduction | TBA  |

<hr>
# Coursework

## <a name="hw">Formative Assessments</a>

Each formative assessment involves doing some preparatory work followed by visiting the instructor's office hours
for a demonstration of understanding. There are three types of formative assessments:
* **Java Programming**: For these assessments, you will begin by creating a Java program as directed below. 
  During your office hours visit, you will demonstrate it to the instructor, followed by modifying the program
  as the instructor directs.
* **Memory Manipulation**: For these assessments, you will study a memory management puzzle. Prior 
  to your office hours visit, you are welcome to experiment with the code in the puzzle. During the visit, you
  will give an answer to the puzzle along with an explanation as to why the answer is correct.
* **Data Structure Demonstration**: For these assessments, you will demonstrate the operation of a data structure
  using the [CS2 Mulch Manipulatives](https://mgoadric.github.io/cs2mulch/). To prepare for your demonstration,
  review Java programs you write in lab in which you built the data structure. Also review the appropriate
  [demonstration](https://mgoadric.github.io/cs2mulch/tree/)
  [videos](https://mgoadric.github.io/cs2mulch/hash/) and practice using 
  [Tabletopia](https://tabletopia.com/games/cs2-mulch-fq1guf/play-now) prior to your office hours visit.

| #  | Name | Assessment Type | Deadline |
|:--:|------| ----------------| -------- |
|0 | [Survey](https://forms.gle/VLRVHjUAisWP5R9J8) | n/a |
|1 | [Eating Candy]({{site.baseurl}}/homework/candy.html) | Java Programming |
|2 | [Planting a Garden]({{site.baseurl}}/homework/garden.html) | Java Programming |
|3 | [ArrayStack Memory]({{site.baseurl}}/homework/asmemory.html) | Memory Manipulation |
|4 | [ListNode Memory]({{site.baseurl}}/homework/lnmemory.html) | Memory Manipulation |
|5 | [ArrayQueue Memory]({{site.baseurl}}/homework/aqmemory.html) | Memory Manipulation |
|6 | [Heaps]({{site.baseurl}}/homework/heaps.html) | Data Structure Demonstration |
|7 | [Sorting]({{site.baseurl}}/homework/sorting.html) | Data Structure Demonstration |
|8 | [Asymptotic Analysis]({{site.baseurl}}/homework/bigo.html) | Data Structure Demonstration |
|9 | [Binary Search Trees]({{site.baseurl}}/homework/trees.html) | Data Structure Demonstration |
|10 | [Hash Tables]({{site.baseurl}}/homework/hashtables.html) | Data Structure Demonstration |

**Credit**:
* A successful demonstration earns two credits.
* A sincere attempt at a demonstration that is lacking in some manner earns one credit.
  * A student is welcome to schedule a follow-up meeting to make an additional attempt 
    to earn full credit.
* Attempting the demonstration by the deadline earns one additional credit.

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

Much of your experience with programming in this course will be through weekly labs. Each lab will be assigned in lab with time allotted to work through the materials, and will be due **by the start of the following lab**. 

On these labs, you will work with a partner on the lab assignments. Their name must be listed on any code you hand in as joint work. A partnership should only turn in a **single copy** of the assignment. 

{% include important.html content="Lab attendance is required. We will be
stationed in the Snoddy Computer Lab in the library for our lab times." %}

**Credit**:
* Submitting the completed lab check-off sheet by the start of the next lab earns two credits.
* Submitting the completed lab check-off sheet at a later date earns one credit.

## <a name="projects">Skills Projects</a>

| #  | Name | 
|:--:|-----|
|1 | [Java and Arrays]({{site.baseurl}}/projects/arrays.html)  |
|2 | [GUI]({{site.baseurl}}/projects/gui.html) |
|3 | [Animation]({{site.baseurl}}/projects/animation.html) |

You will have three skills projects in this course, one about every four weeks. These projects will cover concepts we have discussed in class and in labs, and will be due approximately two weeks after they are assigned.

{% include warning.html content="You must work individually on the projects. You may discuss concepts and ideas with your classmates, but the **code or work you turn in must be your own**. Use of any resources (TA, Stackoverflow, ChatGPT, etc) must be cited, and an overreliance on those resources can be counterproductive to developing your own ability to make progress in this and other courses." %}

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
office hours meeting with the instructor to discuss how the project should be improved.

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
circumstances with the lab instructor.

### Projects
From the four projects, 27 total credits are available:
* **Basic**: Earn 12 project credits
* **Intermediate**: Earn 19 project credits
* **Advanced**: Earn 26 project credits

### Final Course Grade
* To earn an A in the course, a student will:
  * Complete the course survey.
  * Achieve **Advanced** in all three categories
* To earn a B in the course, a student will:
  * Complete the course survey.
  * Achieve at least **Intermediate** in all three categories.
  * Achieve **Advanced** in at least one category.
* To earn a C in the course, a student will:
  * Complete the course survey
  * Achieve at least **Basic** in all three categories.
  * Achieve one of:
    * **Advanced** in at least one category.
    * **Intermediate** in at least two categories.
* To earn a D in the course, a student will:
  * Achieve at least **Basic** in all three categories.