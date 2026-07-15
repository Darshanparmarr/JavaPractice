package classesJavaBasics;

class Student {

    static String college = "XYZ College";

    String name = "Darshan";

    static void staticMethod() {

        System.out.println("\n===== Inside Static Method =====");
        System.out.println("College : " + college);
        anotherStaticMethod();
        Student s = new Student();
        System.out.println("Name : " + s.name);
        s.nonStaticMethod();
    }

    static void anotherStaticMethod() {
        System.out.println("Calling Another Static Method");
    }

    void nonStaticMethod() {
        System.out.println("\n===== Inside Non-Static Method =====");
        System.out.println("College : " + college);
        anotherStaticMethod();
        System.out.println("Name : " + name);
        anotherNonStaticMethod();
    }

    void anotherNonStaticMethod() {
        System.out.println("Calling Another Non-Static Method");
    }
}

public class LearnStaticVariable {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("===== Access from main() =====");
        System.out.println(Student.college);
        System.out.println(s1.name);

        Student.staticMethod();
        s1.nonStaticMethod();
        s1.name = "Rahul";

        Student s2 = new Student();
        s2.name = "Amit";

        System.out.println("\n===== Different Objects =====");
        System.out.println("s1 Name : " + s1.name);
        System.out.println("s2 Name : " + s2.name);

        Student.college = "ABC College";
        System.out.println("\n===== Static Variable Shared =====");
        System.out.println("s1 College : " + s1.college);
        System.out.println("s2 College : " + s2.college);
    }
}