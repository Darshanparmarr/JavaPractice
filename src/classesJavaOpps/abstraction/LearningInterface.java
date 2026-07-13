package classesJavaOpps.abstraction;

interface Printable{
    int number = 10;
    void display();
}

interface Secondable extends Printable{
    int number = 20;
    void display();
}

interface Thirdable extends Printable, Secondable{
    int number = 10;
    void display();
}

public class LearningInterface {
    public void display(){
        System.out.println("Display Method");
    }

    public static void main(String[] args) {
        new LearningInterface().display();
    }
}
