# Week 6 2D Array Exercises
#### Due on 5/2 by 3PM
## Exercise 1: Student Scores (if not reached)
#### Your code to be modified is:
```java
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {  

		//Declare and initialize a 4x3 2D array of doubles called `scores` below

  	System.out.println(Arrays.deepToString(scores));

		//Manually enter the scores for the second exam below


  	System.out.println(Arrays.deepToString(scores));
		
  	//Declare and initialize an empty 4x2 2D array of double values called `newScores` below


  	//Use `for` loops to copy the scores below
    

  	System.out.println(Arrays.deepToString(newScores));

  	//Iterate through the `newScores` 2D array and use `if` statement to add 2 additional points below


    System.out.println(Arrays.deepToString(newScores));
	}
}
```
After learning about 2D arrays, you have decided to become a CS professor and you are now teaching your class about 2D arrays. You are making an application which will keep track of their exam grades and show you statistics about their performance. You will be using 2D arrays to keep track of their exam grades
### Instructions
#### Step 1
Let’s declare and initialize a 4x3 2D array of doubles called scores which will contain the exam data for four students.

The rows in scores represent the student and the columns represent the exam number.

Use initializer lists to store these first exam scores in the 0th column of scores: (80.4, 96.2, 100.0, 78.9).

Store the value –1 for the rest of the exams. Use the provided print statement to print the result in the console.

#### Step 2
Now that we have the scores for the next exams, enter these scores for the second exam (column 1) one by one using 4 lines

* 89.7
* 90.5
* 93.6
* 88.1

Use the provided print statement to print the updated 2D array.

#### Step 3
We just remembered that we need to keep track of only 2 exams.

Declare and initialize an empty 4x2 2D array of double values called `newScores`.

#### Step 4
Use for loops to copy the scores of exam 1 and exam 2 from scores to `newScores` 2D array. (Do not include the -1 values).

#### Step 5
We allowed the students to complete an extra credit activity to contribute towards their scores.

Iterate through the `newScores` 2D array and use an if statement to add 2 additional points to the grade if the exam grade is less than 90.

## Exercise 2: Student Grades
A school wants to keep track of grades for 4 students across 5 subjects. You need to write a program to help calculate totals, averages, and find the highest score.
### Instructions:
#### In the class:
* Create a class `GradeBook` in one Java file.
* Declare a 2D integer array called `grades` with 4 rows (students) and 5 columns (subjects).
* Fill the array with sample data.
* `printGrades()` → prints the grades in a table format with rows as students and columns as subjects.
* `sumGradesPerStudent()` → prints the total grades for each student.
* `averageGradePerSubject()` → prints the average grade for each subject.
* `highestGrade()` → returns the highest grade in the entire grade book.
#### In `main()`:
* Create an object of `GradeBook`.
* Call all the methods to display totals, averages, and the highest score.
* Find the student with the highest total score.
* Find the subject with the lowest average score.
* Print grades below a certain threshold (like failing grades < 60).
