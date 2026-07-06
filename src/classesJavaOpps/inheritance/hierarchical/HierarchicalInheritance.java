package classesJavaOpps.inheritance.hierarchical;

class Car{
    public Car(){
        System.out.println("Constructor of Car");
    }
    public void vehicleType(){
        System.out.println("Vehicle Type : Car");
    }
}

class Maruti extends Car {
    public Maruti(){
        System.out.println("Constructor of Maruti");
    }
    public void brand(){
        System.out.println("Brand : Maruti");
    }
    public void speed(){
        System.out.println("Speed : 60kmph");
    }
}

class BMW extends Car{
    public BMW(){
        System.out.println("Constructor of BMW");
    }
    public void color(){
        System.out.println("Black");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        System.out.println("Child 1");
        Maruti child1 = new Maruti();
        child1.brand();
        child1.speed();
        child1.vehicleType();


        System.out.println("Child 2");
        BMW child2 = new BMW();
        child2.color();
        child2.vehicleType();

    }

}
