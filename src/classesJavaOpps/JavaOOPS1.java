package classesJavaOpps;


public class JavaOOPS1 {

    /*
    =========================================================
    1. WHAT IS A CLASS?
    =========================================================

    Definition:
    A class is a blueprint (template) for creating objects.

    Real Life Example:

        Blueprint -> House
        Class     -> Student
        Objects   -> Rahul, Priya, Aman

    A class only defines what an object should have.

    Example:

    class Student{
        String name;
        int age;
    }

    This class doesn't occupy much memory for variables.
    Memory is allocated when objects are created.
    */

    /*
    =========================================================
    2. INSTANCE VARIABLES
    =========================================================

    These variables belong to every object separately.

    Every object gets its own copy.

    Example:

    Rahul.name = "Rahul";
    Priya.name = "Priya";

    Changing Rahul's name does NOT change Priya's name.
    */

    String name;
    int age;

    /*
    =========================================================
    3. CONSTRUCTOR
    =========================================================

    Definition:
    A constructor is a special method that is automatically
    called when an object is created.

    Rules:
    ✔ Constructor name = Class name
    ✔ No return type
    ✔ Automatically called

    Example:

    JavaOOPS1 obj = new JavaOOPS1();

    Here Java automatically calls the constructor.
    */

    JavaOOPS1() {
        System.out.println("Default Constructor Called");
    }

    /*
    =========================================================
    4. PARAMETERIZED CONSTRUCTOR
    =========================================================

    A constructor can receive values.

    Example:

    JavaOOPS1 obj = new JavaOOPS1("Rahul",20);

    It initializes the object directly.
    */

    JavaOOPS1(String name, int age) {

        /*
        =====================================================
        5. this KEYWORD
        =====================================================

        "this" refers to the CURRENT OBJECT.

        Problem:

        name = name;

        Both variables refer to the parameter.

        So Java cannot distinguish between

        instance variable
        and
        local variable.

        Solution:

        this.name = name;

        Left side  -> instance variable
        Right side -> parameter
        */

        this.name = name;
        this.age = age;

        System.out.println("Parameterized Constructor Called");
    }

    /*
    =========================================================
    6. METHOD
    =========================================================

    A method performs some task.

    Example:
    display();

    Methods help us avoid writing repeated code.
    */

    void display() {

        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    /*
    =========================================================
    7. METHOD OVERLOADING
    =========================================================

    Definition:

    Multiple methods having the SAME NAME
    but DIFFERENT PARAMETERS.

    Java decides which method to call
    based on arguments.

    This is Compile Time Polymorphism.

    Conditions:

    ✔ Same method name
    ✔ Different number of parameters
    OR
    ✔ Different datatype of parameters

    Return type alone cannot overload methods.
    */

    void greet() {
        System.out.println("Hello!");
    }

    void greet(String name) {
        System.out.println("Hello " + name);
    }

    void greet(String name, int age) {
        System.out.println("Hello " + name + " Age : " + age);
    }

    /*
    =========================================================
    8. CONSTRUCTOR OVERLOADING
    =========================================================

    Multiple constructors with different parameters.

    Java decides which constructor to call
    depending on arguments.

    Examples:

    JavaOOPS1();

    JavaOOPS1("Rahul",20);

    Both constructors have same name
    but different parameters.

    This is Constructor Overloading.
    */

    /*
    =========================================================
    9. static KEYWORD
    =========================================================

    static belongs to the CLASS,
    not to individual objects.

    Instance Variable:
    Every object has its own copy.

    Static Variable:
    One copy shared among all objects.

    Example:

    class Student{

        static String college = "ABC";

    }

    Rahul.college = "ABC"

    Priya.college = "ABC"

    Only ONE memory location exists.
    */

    static String college = "ABC College";

    /*
    Static Method

    Can be called using class name.

    JavaOOPS1.showCollege();

    No object required.
    */

    static void showCollege() {

        System.out.println("College : " + college);
    }

    /*
    =========================================================
    IMPORTANT DIFFERENCE

    Instance Members
    ----------------
    Belong to object

    Need object

    Example:
    obj.display();

    Static Members
    --------------
    Belong to class

    No object needed

    Example:
    JavaOOPS1.showCollege();

    =========================================================
    */

    public static void main(String[] args) {

        System.out.println("============== CLASS & OBJECT ==============");

        /*
        Creating Objects

        Syntax:

        ClassName objectName = new ClassName();

        new creates memory.

        Constructor gets called automatically.
        */

        JavaOOPS1 student1 = new JavaOOPS1();

        student1.name = "Rahul";
        student1.age = 20;

        student1.display();

        System.out.println();

        System.out.println("========== PARAMETERIZED CONSTRUCTOR ==========");

        JavaOOPS1 student2 = new JavaOOPS1("Priya", 22);

        student2.display();

        System.out.println();

        System.out.println("============= METHOD OVERLOADING =============");

        student2.greet();

        student2.greet("Rahul");

        student2.greet("Aman", 25);

        System.out.println();

        System.out.println("=============== STATIC =================");

        JavaOOPS1.showCollege();

        /*
        Static variable can also be accessed
        using class name.

        Recommended approach.
        */

        System.out.println(JavaOOPS1.college);

        /*
        =====================================================
        QUICK REVISION
        =====================================================

        CLASS
        -----
        Blueprint

        OBJECT
        ------
        Real implementation of class

        CONSTRUCTOR
        -----------
        Initializes object

        DEFAULT CONSTRUCTOR
        -------------------
        No parameters

        PARAMETERIZED CONSTRUCTOR
        -------------------------
        Takes parameters

        this
        ----
        Refers to current object

        static
        ------
        Belongs to class

        METHOD OVERLOADING
        ------------------
        Same method
        Different parameters

        CONSTRUCTOR OVERLOADING
        -----------------------
        Same constructor
        Different parameters

        =====================================================
        */
    }

    /*
    =========================================================
                    EXERCISES
    =========================================================

    EASY

    1.
    Create a Car class having:
    - brand
    - model
    - price

    Create two objects.

    ----------------------------

    2.
    Create a constructor that initializes:
    name and age.

    ----------------------------

    3.
    Print details using display().

    ----------------------------

    4.
    Create three overloaded methods:

    add(int,int)

    add(int,int,int)

    add(double,double)

    ----------------------------

    5.
    Create three constructors:

    Student()

    Student(String)

    Student(String,int)

    ----------------------------

    6.
    Create a static variable:

    schoolName

    Print it using class name.

    ----------------------------

    7.
    Explain in your own words:

    Difference between

    Class vs Object

    Constructor vs Method

    Static vs Instance Variable

    this vs object reference

    Constructor Overloading vs Method Overloading

    =========================================================

    CHALLENGE EXERCISE

    Create a BankAccount class.

    Variables:
    accountHolder
    accountNumber
    balance

    Constructors:
    Default
    Parameterized

    Methods:
    deposit()
    withdraw()
    display()

    Static Variable:
    bankName

    Create 3 BankAccount objects.

    Print everything.

    =========================================================
    */
}
