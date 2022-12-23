# Abstraction in Java

Data Abstraction is the property by virtue of which only the essential details are displayed to the user. The trivial or the non-essential units are not displayed to the user. Ex: A car is viewed as a car rather than its individual components.

Data Abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details. The properties and behaviors of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects.

There are two ways to achieve abstraction in java

    - Abstract class (0 to 100%)
    - Interface (100%)

Abstract classes and Abstract methods :

    - An abstract class is a class that is declared with an abstract keyword.

    - An abstract method is a method that is declared without implementation.

    - An abstract class may or may not have all abstract methods. Some of them can be concrete methods

    - A method-defined abstract must always be redefined in the subclass, thus making overriding compulsory or making the subclass itself abstract.

    - Any class that contains one or more abstract methods must also be declared with an abstract keyword.

    - There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.

    - An abstract class can have parameterized constructors and the default constructor is always present in an abstract class.
