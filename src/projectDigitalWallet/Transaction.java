package projectDigitalWallet;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {

    private String type;
    private double amount;
    private LocalDateTime dateTime;

    // Constructor
    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }

    // Getters
    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return "----------------------------------------\n" +
                "Date & Time : " + dateTime.format(formatter) + "\n" +
                "Type        : " + type + "\n" +
                "Amount      : ₹" + amount + "\n" +
                "----------------------------------------";
    }

}