package projectDigitalWallet;

import java.util.ArrayList;

public abstract class Wallet implements Payment{
    private int userId;
    private String name;
    private int pin;
    protected double balance;

    protected ArrayList<Transaction>history = new ArrayList<>();

    public Wallet(int userId, String name, int pin, double balance){
        this.userId = userId;
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public int getUserId() {
        return userId;
    }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getHistory() {
        return history;
    }

    @Override
    public void addMoney(double amount){

        if(amount <= 0){
            System.out.println("Invalid Amount");
            return;
        }
        balance += amount;

        history.add(new Transaction("Money added ",amount));
        System.out.println("Rs "+ amount + " Added Successfully");

    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance : Rs "+balance);
    }
}
