package classesJavaOpps.abstraction;

abstract class Parent {
    public static int number;
    public int age;
    final int BALANCE = 34;

    public Parent(){
        System.out.println("Parent Constructor");
    }

    public abstract void display();

    public void show(){
        System.out.println("Show Method");
    }

    public static void showData(){

    }

}

class Child extends Parent{
    public void display(){
        System.out.println("Display Method");
    }
}

public class LearningAbstraction{
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.display();
    }
}