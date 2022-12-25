# Interface in Java

An interface in Java is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.

### Features of Interface

    - Java Interface also represents the IS-A relationship.

    - It cannot be instantiated just like the abstract class.

    - Since Java 8, we can have default and static methods in an interface.

    - Since Java 9, we can have private methods in an interface.

### Why use Java Interface?

There are mainly three reasons to use interface. They are given below.

    - It is used to achieve abstraction.

    - By interface, we can support the functionality of multiple inheritance.

    - It can be used to achieve loose coupling.

### Types of Interface

    - Normal Interface (>1 Abstract methods)

    - Functional Interface (Pure 1 Abstract method)
        - Example:
            - Runnable : It contains only  run()  method
            - ActionListener : It contains only  actionPerformed()
            - ItemListener : It contains only  itemStateChanged() method

    - Marker Interface (No method)
        - Example:
            - Cloneable Interface
            - Serializable Interface
            - Remote Interface

*Note: Functional Interface supports Lambda expression.