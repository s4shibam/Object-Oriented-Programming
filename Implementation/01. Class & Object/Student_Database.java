class Student {

    String name, degree, stream;
    int roll;

    void printInfo() {

        System.out.println();
        System.out.println("Student's name: " + this.name);
        System.out.println("Student's degree: " + this.degree);
        System.out.println("Student's stream: " + this.stream);
        System.out.println("Student's roll: " + this.roll);
    }
}

public class Student_Database {

    public static void main(String[] args) {

        Student sd1 = new Student();
        Student sd2 = new Student();
        Student sd3 = new Student();

        sd1.name = "Shibam Saha";
        sd1.degree = "B. Tech";
        sd1.stream = "CSE";
        sd1.roll = 100;

        sd2.name = "Sunabha Panda";
        sd2.degree = "B. Tech";
        sd2.stream = "CS/IT";
        sd2.roll = 0124;

        sd3.name = "Pritam Gain";
        sd3.degree = "B. Sc";
        sd3.stream = "Data Science";
        sd3.roll = 0125;

        sd1.printInfo();
        sd2.printInfo();
        sd3.printInfo();
    }
}

/*
 * Output:
 * Student's name: Shibam Saha
 * Student's degree: B. Tech
 * Student's stream: CSE
 * Student's roll: 100
 * 
 * Student's name: Sunabha Panda
 * Student's degree: B. Tech
 * Student's stream: CS/IT
 * Student's roll: 84
 * 
 * Student's name: Pritam Gain
 * Student's degree: B. Sc
 * Student's stream: Data Science
 * Student's roll: 85
 */