package classesJavaOpps.polymorphism;

public class AreaMethodOverloaded {

    public double area(double r){
        double ar = 3.14*r*r;
        return ar;
    }

    public void area(int length, double breadth){
        double ar = length * breadth;
        System.out.println("Area of rectangle "+ ar);
    }

    public double area(double side, boolean flag){
        double ar = side * side;
        return ar;
    }

    public static void main(String[] args) {
        AreaMethodOverloaded areaMethodOverloaded = new AreaMethodOverloaded();
        double ar = areaMethodOverloaded.area(43);
        System.out.println("Area of circle : "+ar);
        areaMethodOverloaded.area(45,67.6);
        areaMethodOverloaded.area(34,true);
        System.out.println("Area of Square : " + 34);
    }

}
