package projectUPIApp;

public class Transaction {
    private User sender;     
    private User receiver;     
    private double amount;
    private String status;     

    public Transaction(double amount, User receiver, User sender, String status) {
        this.amount = amount;
        this.receiver = receiver;
        this.sender = sender;
        this.status = status;
    }

    public void printTransaction() {
        System.out.println("Transaction : " + sender.getName() + "->" + receiver.getName() + "Rs. " + amount + " " + status);
    }
}
