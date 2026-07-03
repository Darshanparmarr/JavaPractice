package classesJavaOpps;

// ===============================================================
// Topics Covered:
// 1. Introduction to OOP
// 2. Inheritance
// 3. Types of Inheritance
// 4. this keyword
// 5. super keyword
// 6. Why Multiple & Hybrid Inheritance are not supported
// ===============================================================

/*
=========================
1. WHAT IS OOP?
=========================

OOP (Object Oriented Programming) is a programming paradigm
that organizes programs using Classes and Objects.

Advantages:
1. Code Reusability
2. Security
3. Easy Maintenance
4. Easy Debugging
5. Real World Modeling

Four Pillars of OOP:
1. Inheritance
2. Polymorphism
3. Encapsulation
4. Abstraction (Next Topic)

Real World Example

Animal
   ↑
 Dog

Vehicle
   ↑
 Car
*/

// ===============================================================
// Parent Class
// ===============================================================
class Animal {

    String name = "Animal";

    Animal() {
        System.out.println("Animal Constructor Executed");
    }

    void sound() {
        System.out.println("Animals make different sounds.");
    }
}

// ===============================================================
// Single Inheritance
// Dog inherits Animal
// ===============================================================
class Dog extends Animal {

    String breed = "Labrador";

    Dog() {
        // super() calls parent constructor.
        // It is automatically inserted by Java.
        super();

        System.out.println("Dog Constructor Executed");
    }

    void display() {

        System.out.println("\n----- this & super Example -----");

        // this refers to current object
        System.out.println("this.breed = " + this.breed);

        // super refers to parent class members
        System.out.println("super.name = " + super.name);
    }

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

// ===============================================================
// Multilevel Inheritance
// Puppy -> Dog -> Animal
// ===============================================================
class Puppy extends Dog {

    Puppy() {
        System.out.println("Puppy Constructor Executed");
    }

    void play() {
        System.out.println("Puppy is Playing.");
    }
}

// ===============================================================
// Hierarchical Inheritance
// Animal -> Cat
// ===============================================================
class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat Meows");
    }
}

// ===============================================================
// Main Class
// ===============================================================
public class JavaOOPS2 {

    public static void main(String[] args) {

        System.out.println("=========== SINGLE INHERITANCE ===========");

        Dog dog = new Dog();
        dog.display();
        dog.sound();

        System.out.println("\n=========== MULTILEVEL INHERITANCE ===========");

        Puppy puppy = new Puppy();
        puppy.play();
        puppy.sound();

        System.out.println("\n=========== HIERARCHICAL INHERITANCE ===========");

        Cat cat = new Cat();
        cat.sound();

        System.out.println("\n=========== PARENT OBJECT ===========");

        Animal animal = new Animal();
        animal.sound();

        /*
        Expected Output

        Animal Constructor Executed
        Dog Constructor Executed

        this.breed = Labrador
        super.name = Animal
        Dog Barks

        Animal Constructor Executed
        Dog Constructor Executed
        Puppy Constructor Executed
        Puppy is Playing.
        Dog Barks

        Animal Constructor Executed
        Cat Meows

        Animal Constructor Executed
        Animals make different sounds.
        */
    }
}

/*
=========================================================
INHERITANCE NOTES
=========================================================

Definition:
------------
Inheritance is the process by which one class acquires
the properties and methods of another class.

Syntax:
-------
class Child extends Parent
{
}

Advantages:
-----------
1. Code Reusability
2. Reduces Duplicate Code
3. Supports Runtime Polymorphism
4. Easy to Maintain

=========================================================
TYPES OF INHERITANCE
=========================================================

1. Single

Parent
   ↑
 Child

Example:
Animal -> Dog

--------------------------------------

2. Multilevel

GrandParent
      ↑
   Parent
      ↑
    Child

Example:
Animal -> Dog -> Puppy

--------------------------------------

3. Hierarchical

          Parent
         /      \
     Child1   Child2

Example:
Animal
 |---- Dog
 |
 |---- Cat

=========================================================
WHY MULTIPLE INHERITANCE IS NOT SUPPORTED?
=========================================================

Suppose,

Father class has:
display()

Mother class also has:
display()

Now Child inherits both classes.

Which display() should Child call?

This confusion is called the
DIAMOND PROBLEM.

Therefore Java does NOT support
Multiple Inheritance using Classes.

Instead Java uses Interfaces.

=========================================================
WHY HYBRID INHERITANCE IS NOT SUPPORTED?
=========================================================

Hybrid Inheritance contains Multiple
Inheritance as one of its parts.

Since Multiple Inheritance is not
supported using classes,

Hybrid Inheritance is also not
supported using classes.

Interfaces can be used to achieve it.

=========================================================
this KEYWORD
=========================================================

this refers to the current object.

Uses:

1. Access current object's variables.

2. Call current class methods.

3. Call another constructor
   using this().

Example:

this.name
this.display()
this()

=========================================================
super KEYWORD
=========================================================

super refers to the immediate
parent class.

Uses:

1. Access Parent Variables

super.name;

2. Access Parent Methods

super.display();

3. Call Parent Constructor

super();

=========================================================
INTERVIEW QUESTIONS
=========================================================

Q1. What is Inheritance?

Q2. Which keyword is used for inheritance?

Answer:
extends

Q3. Name the types of inheritance
supported by Java.

Answer:
Single
Multilevel
Hierarchical

Q4. Why is Multiple Inheritance
not supported?

Answer:
Because of Diamond Problem.

Q5. Difference between this and super?

this  -> Current Object

super -> Parent Object

=========================================================
PRACTICE QUESTIONS
=========================================================

1. Create Person -> Student inheritance.

2. Create Vehicle -> Car inheritance.

3. Create Employee -> Manager -> HR.

4. Create Animal -> Lion and Animal -> Tiger.

5. Demonstrate use of this keyword.

6. Demonstrate use of super keyword.

7. Explain Diamond Problem with diagram.

=========================================================
 */