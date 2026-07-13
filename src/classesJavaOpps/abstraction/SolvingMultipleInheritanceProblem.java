package classesJavaOpps.abstraction;

interface Dhoni{
    void display();
}

interface Virat{
    void display();
}

class Random implements Dhoni, Virat{
    public void display(){
        System.out.println("Display Method");
    }
}

public class SolvingMultipleInheritanceProblem {
    public static void main(String[] args) {
        Random r = new Random();
        r.display();
    }
}