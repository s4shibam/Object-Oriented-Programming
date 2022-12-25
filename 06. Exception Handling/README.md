# Exception Handling in Java

Exception Handling in Java is one of the effective means to handle the runtime errors so that the regular flow of the application can be preserved. Java Exception Handling is a mechanism to handle runtime errors such as `ClassNotFoundException`, `IOException`, `SQLException`, `RemoteException`, etc.

### What is an Exception?

Exception is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time, that disrupts the normal flow of the program’s instructions. Exceptions can be caught and handled by the program. When an exception occurs within a method, it creates an object. This object is called the exception object. It contains information about the exception, such as the name and description of the exception and the state of the program when the exception occurred.

### Types of Exceptions 

Exceptions can be categorized in two ways:

    - Built-in Exceptions [Exceptions available in Java libraries]
            - Checked Exception [Compile-time Exceptions]
            - Unchecked Exception [Undetected in Compile-time]

    - User-Defined Exceptions