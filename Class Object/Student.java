class StudentDatabase {

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

public class Student {

    public static void main(String[] args) {

        StudentDatabase sd1 = new StudentDatabase();
        StudentDatabase sd2 = new StudentDatabase();
        StudentDatabase sd3 = new StudentDatabase();

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
