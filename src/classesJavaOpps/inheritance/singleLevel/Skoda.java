package classesJavaOpps.inheritance.singleLevel;

public class Skoda extends Vehicle {
    public static void main(String[] args) {
        Skoda car = new Skoda();
        System.out.println("Current speed of car : " + car.currentSpeed());
        System.out.println("Seater : " + car.getSeater());
    }
    public int getSeater(){
        this.seater = 5;
        return(this.seater);
    }
}
