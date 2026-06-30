import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String type;
    private int baseprice;
    private List<Topping> toppingList = new ArrayList<>();
    private boolean isTakeAway;

    public Pizza(int baseprice, String type) {
        this.baseprice = baseprice;
        this.type = type;
    }


    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getBaseprice() {
        return baseprice;
    }
    public void setBaseprice(int baseprice) {
        this.baseprice = baseprice;
    }
    public List<Topping> getToppingList() {
        return toppingList;
    }
    public void setToppingList(List<Topping> toppingList) {
        this.toppingList = toppingList;
    }
    public boolean isTakeAway() {
        return isTakeAway;
    }

    public Pizza setTakeAway(boolean isTakeAway) {
        this.isTakeAway = isTakeAway;
        return this;
    }

    public Pizza addToppings(Topping topping) {
        toppingList.add(topping);
        return this;
    }

    public int calculateCost() {
        int total = baseprice;
        for (Topping topping : toppingList) {
            total += topping.cost();
        }
        if (this.isTakeAway) {
            total += 20;
        }
        return total;
    }

    public void printBill() {
        System.out.println("----Bill----");
        System.out.println(type+" Rs.: "+baseprice);
        for (Topping topping : toppingList) {
            System.out.println(topping.name() + "Rs.: " + topping.cost());
        }
        if (this.isTakeAway) {
            System.out.println("TakeAway : Rs. 20");
        }
        System.out.println("Total Rs.: " + calculateCost());
        System.out.println("------------ ");
        
    }

}
 