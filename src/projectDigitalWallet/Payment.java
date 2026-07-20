package projectDigitalWallet;

public interface Payment {
    void addMoney(double amount);
    void sendMoney(UserWallet receiver, double amount);
    void checkBalance();
}
