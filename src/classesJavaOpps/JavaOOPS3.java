package classesJavaOpps;// ===============================================================
// Topics Covered:
// 1. Polymorphism
// 2. Method & Constructor Overloading
// 3. Method Overriding
// 4. Runtime Polymorphism
// 5. Dynamic Method Dispatch
// 6. Static Binding & Dynamic Binding
// 7. Encapsulation
// 8. Getters & Setters
// 9. Object Class
// 10. toString()
// ===============================================================

/*
=========================================================
POLYMORPHISM
=========================================================

Poly  = Many
Morph = Forms

One object can behave in many different ways.

Types of Polymorphism

1. Compile Time Polymorphism
   (Method Overloading)

2. Runtime Polymorphism
   (Method Overriding)

*/

// ===============================================================
// METHOD OVERLOADING
// Same method name but different parameter list.
// Decision is taken by compiler.
// ===============================================================

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// ===============================================================
// CONSTRUCTOR OVERLOADING
// ===============================================================

class Employee {

    int id;
    String name;

    Employee() {
        System.out.println("\nDefault Constructor Called");
    }

    Employee(int id) {
        this.id = id;
        System.out.println("Employee ID : " + id);
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;

        System.out.println("Employee Created");
    }
}

// ===============================================================
// METHOD OVERRIDING
// Child provides its own implementation of Parent method.
// ===============================================================

class Vehicle {

    void start() {
        System.out.println("Vehicle Starts");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car Starts with Push Button");
    }
}

// ===============================================================
// ENCAPSULATION
// Data Hiding using private variables.
// ===============================================================

class Student {

    private int rollNo;
    private String name;

    public void setRollNo(int rollNo) {

        if (rollNo > 0)
            this.rollNo = rollNo;
        else
            System.out.println("Invalid Roll Number");
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Object class method
    @Override
    public String toString() {

        return "Student { Roll No = "
                + rollNo +
                ", Name = "
                + name + " }";
    }
}

/*
=========================================================
ADD THE FOLLOWING CODE INSIDE main() METHOD
(Inside JavaOops3 class from Part 1)
=========================================================

System.out.println("\n=========== METHOD OVERLOADING ===========");

Calculator c = new Calculator();

System.out.println(c.add(10,20));

System.out.println(c.add(10,20,30));

System.out.println(c.add(5.5,6.5));


System.out.println("\n=========== CONSTRUCTOR OVERLOADING ===========");

Employee e1 = new Employee();

Employee e2 = new Employee(101);

Employee e3 = new Employee(102,"Rahul");


System.out.println("\n=========== METHOD OVERRIDING ===========");

Vehicle v = new Vehicle();

v.start();

Car car = new Car();

car.start();


System.out.println("\n=========== RUNTIME POLYMORPHISM ===========");

// Parent reference
// Child object

Vehicle obj = new Car();

obj.start();


System.out.println("\n=========== ENCAPSULATION ===========");

Student s = new Student();

s.setRollNo(1);

s.setName("Amit");

System.out.println(s.getRollNo());

System.out.println(s.getName());

System.out.println(s);

*/

/*
=========================================================
RULES OF METHOD OVERLOADING
=========================================================

1. Same Method Name

2. Different Parameters

3. Return type alone cannot
   overload a method.

Example

display(int)

display(String)

display(int,String)

Valid

=========================================================
RULES OF METHOD OVERRIDING
=========================================================

1. Same Method Name

2. Same Parameters

3. IS-A Relationship

4. Cannot reduce access modifier

5. Final methods cannot be overridden.

6. Static methods are not overridden
   (they are hidden).

=========================================================
COMPILE TIME POLYMORPHISM
=========================================================

Another Name

Static Polymorphism

Achieved By

Method Overloading

Compiler decides which method
should be called.

=========================================================
RUNTIME POLYMORPHISM
=========================================================

Another Name

Dynamic Polymorphism

Achieved By

Method Overriding

JVM decides at runtime.

Example

Vehicle v = new Car();

v.start();

Output

Car Starts with Push Button

=========================================================
DYNAMIC METHOD DISPATCH
=========================================================

Definition

Parent reference can point
to Child object.

Example

Animal a = new Dog();

a.sound();

Method executed depends on
actual object.

=========================================================
STATIC BINDING
=========================================================

Binding done by Compiler.

Examples

1. Method Overloading

2. Static Methods

3. Private Methods

4. Final Methods

Fast because decision is made
during compilation.

=========================================================
DYNAMIC BINDING
=========================================================

Binding done by JVM.

Example

Method Overriding

Vehicle v = new Car();

v.start();

Decision is taken during runtime.

=========================================================
ENCAPSULATION
=========================================================

Wrapping Data and Methods
into a single unit.

Achieved using

private variables

Getter methods

Setter methods

Advantages

1. Data Security

2. Data Hiding

3. Validation

4. Better Maintenance

=========================================================
GETTERS
=========================================================

Used to Read private variables.

Example

getName()

getRollNo()

=========================================================
SETTERS
=========================================================

Used to Modify private variables.

Example

setName()

setRollNo()

Validation can also be done
inside setters.

=========================================================
OBJECT CLASS
=========================================================

Object class is the parent of
every Java class.

Some Important Methods

1. toString()

2. equals()

3. hashCode()

4. getClass()

5. clone()

6. finalize() (Deprecated)

=========================================================
toString()
=========================================================

Whenever an object is printed,

System.out.println(object);

Java automatically calls

object.toString()

Overriding toString() makes
objects display meaningful
information.

=========================================================
INTERVIEW QUESTIONS
=========================================================

Q1. What is Polymorphism?

Q2. Difference between
Overloading and Overriding?

Q3. Can constructors
be overridden?

Answer:
No

Q4. Can constructors
be overloaded?

Answer:
Yes

Q5. What is Dynamic Method Dispatch?

Q6. Difference between
Static Binding and Dynamic Binding?

Q7. What is Encapsulation?

Q8. Why use private variables?

Q9. What is Object class?

Q10. Why override toString()?

=========================================================
DIFFERENCE
=========================================================

OVERLOADING

Same Class

Same Name

Different Parameters

Compile Time

-----------------------------------------

OVERRIDING

Parent & Child

Same Name

Same Parameters

Runtime

=========================================================
PRACTICE QUESTIONS
=========================================================

Easy

1. Create Calculator class
   with overloaded multiply().

2. Create Student class
   using encapsulation.

3. Override display()
   in Teacher class.

Medium

4. Shape -> Circle

5. Bank -> SBI

6. Animal -> Lion

7. Vehicle -> Bike

Hard

8. Employee Management

9. Banking System

10. Hospital Management

11. Library Management

12. College Management

=========================================================
 */