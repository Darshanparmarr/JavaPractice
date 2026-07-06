package projectBillGenerator;

public class ExtraToppings implements Topping {
    
    private String type;
    public ExtraToppings(String type) {
        this.type = type;
    }
    

    @Override
    public int cost() {
        return 150;
    }
    @Override
    public String name() {
        return "Extra Topping ( " + type + " )";
    }
}
    