package classesJavaOpps.inheritance.multiLevel;

class Car{
    public Car(){
        System.out.println("Constructor of Car");
    }
    public void vehicleType(){
        System.out.println("Vehicle Type : Car");
    }
}

class Maruti extends Car{
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

class Maruti800 extends Maruti{
    public Maruti800(){
        System.out.println("Constructor of Maruti800");
    }
    public void speed(){
        System.out.println("Speed : 80kmph");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Maruti800 obj = new Maruti800();
        obj.vehicleType();
        obj.brand();
        obj.speed();
    }
}
