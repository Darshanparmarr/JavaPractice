package projectBillGenerator;

public class Main {
    public static void main(String[] args){
        Pizza pizza = new Pizza(300, "Veg Pizza")
            .addToppings(new ExtraCheese())
            .addToppings(new ExtraToppings("Olive"))
            .setTakeAway(false);
        pizza.printBill();
    }
}
