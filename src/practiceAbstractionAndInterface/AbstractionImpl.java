package practiceAbstractionAndInterface;

//abstract class AbstractCar {
//    String carName;
//    String carColor;
//    int mileage;
//
//    public AbstractCar(String carName, String colorName, int mileage) {
//        this.carName = carName;
//        this.carColor = colorName;
//        this.mileage = mileage;
//    }
//
//    public void showCarDetails(){
//        System.out.println(this.carName);
//        System.out.println(this.carColor);
//        System.out.println(this.mileage);
//    }
//
//    public abstract void modelName();
//
//}
//
//class Ferrari extends AbstractCar{
//
//    public Ferrari(String carName, String carColor, int mileage){
//        super(carName, carColor, mileage);
//    }
//
//    public void modelName() {
//        System.out.println("12Cilindri");
//    }
//
//
//}
//
//public class AbstractionImpl {
//    public static void main(String[] args) {
//        Ferrari ferrari = new Ferrari("Ferrari", "Red", 24);
//        ferrari.showCarDetails();
//        ferrari.modelName();
//    }
//}


interface Carable{
    String carName = "Ferrari";
    String colorName = "Red";
    int mileage = 23;
    void modelName();
    void showCarDetails();
}

class Ferrari implements Carable{

    public void modelName(){
        System.out.println("12 Cilindri");
    }

    public void showCarDetails(){
        System.out.println(Carable.carName);
        System.out.println(Carable.colorName);
        System.out.println(Carable.mileage);
    }

    public static void main(String[] args) {
        new Ferrari().modelName();
        new Ferrari().showCarDetails();
    }

}
