package classesJavaBasics;

class Student {

    // Static Variable
    static String college = "XYZ College";

    // Non-Static Variable
    String name = "Darshan";

    // ==========================
    // Static Method
    // ==========================
    static void staticMethod() {

        System.out.println("\n===== Inside Static Method =====");

        // Static Variable -> Allowed
        System.out.println("College : " + college);

        // Static Method -> Allowed
        anotherStaticMethod();

        // Non-Static Variable -> Need Object
        Student s = new Student();
        System.out.println("Name : " + s.name);

        // Non-Static Method -> Need Object
        s.nonStaticMethod();
    }

    static void anotherStaticMethod() {
        System.out.println("Calling Another Static Method");
    }

    // ==========================
    // Non-Static Method
    // ==========================
    void nonStaticMethod() {

        System.out.println("\n===== Inside Non-Static Method =====");

        // Static Variable -> Allowed
        System.out.println("College : " + college);

        // Static Method -> Allowed
        anotherStaticMethod();

        // Non-Static Variable -> Allowed
        System.out.println("Name : " + name);

        // Non-Static Method -> Allowed
        anotherNonStaticMethod();
    }

    void anotherNonStaticMethod() {
        System.out.println("Calling Another Non-Static Method");
    }
}

public class LearnStaticVariable {

    public static void main(String[] args) {

        // Create Object
        Student s1 = new Student();

        System.out.println("===== Access from main() =====");

        // Static Variable
        System.out.println(Student.college);

        // Non-Static Variable
        System.out.println(s1.name);

        // Static Method
        Student.staticMethod();

        // Non-Static Method
        s1.nonStaticMethod();

        // Change Non-Static Variable
        s1.name = "Rahul";

        Student s2 = new Student();
        s2.name = "Amit";

        System.out.println("\n===== Different Objects =====");
        System.out.println("s1 Name : " + s1.name);
        System.out.println("s2 Name : " + s2.name);

        // Static Variable Shared
        Student.college = "ABC College";

        System.out.println("\n===== Static Variable Shared =====");
        System.out.println("s1 College : " + s1.college);
        System.out.println("s2 College : " + s2.college);
    }
}