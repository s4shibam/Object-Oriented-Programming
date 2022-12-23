/*
Getter And Setter

Getter and Setter are methods used to protect your data and make your code more secure. Getter returns the value (accessors), it returns the value of data type int, String, double, float, etc. For the program’s convenience, getter starts with the word "get" followed by the variable name.

While Setter sets or updates the value (mutators). It sets the value for any variable used in a class's programs. and starts with the word "set" followed by the variable name.

Getter and Setter make the programmer convenient in setting and getting the value for a particular data type. In both getter and setter, the first letter of the variable should be capital.
*/

class Human {

    private int age = 1;

    public int getAge() {
        System.out.println("Age value accessed!");
        return age;
    }

    public void setAge(int age) {

        if (age < 1) {
            System.out.println("Invalid age input!");
            return;
        }

        this.age = age;
        System.out.println("Age value updated!");
    }
}

public class Getter_And_Setter {

    public static void main(String[] args) {

        Human human = new Human();

        // int age is private - it will throw compile time error
        // System.out.println(human.age);

        // Sets age
        human.setAge(20);

        // Invalid Input Criteria
        // Will not update the age
        human.setAge(-100);

        // Gets age
        int age = human.getAge();
        System.out.println("Age is: " + age);
    }
}

/*
 * Output:
 * 
 * Age value updated!
 * Invalid age input!
 * Age value accessed!
 * Age is: 20
 */