package oops;

public class SmartPhone {
    public String brandName;
    public String modelName;
    public int batteryStatus;

    public SmartPhone(){
        System.out.println("I am a Constructor");
    }

    public void yourBrand(){
        System.out.println("Brand Name - "+ brandName);
        System.out.println("Model Name - "+ modelName);
    }

    public int batteryLevel(){
        return batteryStatus;
    }



}
