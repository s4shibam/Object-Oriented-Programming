/*
Hybrid Inheritance (Through Interfaces)

It is a mix of two or more of the above types of inheritance. Since java doesn’t support multiple inheritances with classes, hybrid inheritance is also not possible with classes.

In java, we can achieve hybrid inheritance only through Interfaces.

Structure:

                      |-->    Student
                      |          |                      
    Multi Level -->   |-->      Exam             Project   --|
    Inheritance       |          |__________________|     <--|  <-- Multiple        
                      |          |                           |      Inheritance
                      |-->     Result                      --|
*/

// Super Class
class Student {

    String name = "Shibam";
    int roll = 123;
    int practicalMarks = 18;
}

// Student <-- Exam
// Sub Class of Student - Single Level Inheritance
class Exam extends Student {
    int theoryMarks = 65;
    int totalMarks = theoryMarks + practicalMarks;
}

// Interface (Multiple Inheritance supports Interface only)
interface Project {

    // Public Static Final
    int projectMarks = 9;

    // Public Abstract Method
    // Must be defined where Project has been implemented
    void show();
}

// Student <-- Exam <-- Result (Multi Level Inheritance)
// Also, Project <-- Result (Multiple Inheritance)
// Hybrid Inheritance achieved in Result class
class Result extends Exam implements Project {

    int finalMarks = totalMarks + projectMarks;

    // Defining Interface Abstract method
    public void show() {

        // Error - can not change Final field
        // projectMarks++;

        System.out.println("Student Name: " + name); // Student
        System.out.println("Student Roll No: " + roll); // Student
        System.out.println("Student Practical Marks: " + practicalMarks + "/20"); // Student
        System.out.println("Student Theory Marks: " + theoryMarks + "/70"); // Exam
        System.out.println("Student (Theory + Practical) Marks: " + totalMarks + "/80"); // Exam
        System.out.println("Student Project Marks: " + projectMarks + "/10"); // Project
        System.out.println("Student Final Marks: " + finalMarks + "/100"); // Result
    }
}

class Hybrid_Inheritance {

    public static void main(String[] args) {

        Result result = new Result();
        result.show();
    }
}

/*
 * Output:
 * 
 * Student Name: Shibam
 * Student Roll No: 123
 * Student Practical Marks: 18/20
 * Student Theory Marks: 65/70
 * Student (Theory + Practical) Marks: 83/80
 * Student Project Marks: 9/10
 * Student Final Marks: 92/100
 */