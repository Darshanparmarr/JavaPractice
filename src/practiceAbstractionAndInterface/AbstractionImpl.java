package practiceAbstractionAndInterface;

abstract class AbstractCar {
    String carName;
    String carColor;
    int mileage;

    public AbstractCar(String carName, String colorName, int mileage) {
        this.carName = carName;
        this.carColor = colorName;
        this.mileage = mileage;
    }

    public void showCarDetails(){
        System.out.println(this.carName);
        System.out.println(this.carColor);
        System.out.println(this.mileage);
    }

    public abstract void modelName();

}

class Ferrari extends AbstractCar{

    public Ferrari(String carName, String carColor, int mileage){
        super(carName, carColor, mileage);
    }

    public void modelName() {
        System.out.println("12Cilindri");
    }


}

public class AbstractionImpl {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari("Ferrari", "Red", 24);
        ferrari.showCarDetails();
        ferrari.modelName();
    }
}
