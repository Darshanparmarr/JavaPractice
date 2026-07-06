package classesJavaOpps.inheritance;

class Parent{
    public int age;

    public Parent(int age){
        this.age = age;
    }

    public void display(){
        System.out.println("Parent");
    }

    public void showAge(){
        System.out.println(this.age);
    }

}

class Child extends Parent{

    public Child(){
        super(23);
    }

    public void display(){
        System.out.println("Child");
        super.display();
    }

    public void displayAge(){
        int age = 2;
        System.out.println(age);
        System.out.println(super.age);
    }

}

public class UseOfSuperKeyword {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayAge();
    }
}
