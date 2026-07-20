package projectDigitalWallet;

import java.util.ArrayList;

public class WalletService {

    private ArrayList<UserWallet> users = new ArrayList<>();

    public WalletService() {

        // Default Users

        users.add(new UserWallet(101, "Darshan", 1234, 5000));
        users.add(new UserWallet(102, "Rahul", 1111, 3000));
        users.add(new UserWallet(103, "Priya", 2222, 7000));
    }

    // Find User by ID
    public UserWallet findUser(int userId) {

        for (UserWallet user : users) {

            if (user.getUserId() == userId) {
                return user;
            }
        }

        throw new UserNotFoundException("User Not Found.");
    }

    // Login
    public UserWallet login(int userId, int pin) {

        UserWallet user = findUser(userId);

        if (user.getPin() != pin) {
            throw new InvalidPinException("Invalid PIN.");
        }

        return user;
    }

    // Display All Users
    public void displayUsers() {

        System.out.println("\n========== USERS ==========");

        for (UserWallet user : users) {

            System.out.println(
                    "ID : " + user.getUserId()
                            + " | Name : " + user.getName()
                            + " | Balance : ₹" + user.getBalance());
        }

        System.out.println("===========================\n");
    }

    // Transaction History
    public void showHistory(UserWallet user) {

        System.out.println("\n===== Transaction History =====");

        if (user.getHistory().isEmpty()) {

            System.out.println("No Transactions Found.");
            return;
        }

        for (Transaction t : user.getHistory()) {

            System.out.println(t);
        }

        System.out.println("===============================\n");
    }

    // Deposit
    public void addMoney(UserWallet user, double amount) {

        user.addMoney(amount);
    }

    // Transfer
    public void sendMoney(UserWallet sender,
                          int receiverId,
                          double amount) {

        UserWallet receiver = findUser(receiverId);

        if (sender.getUserId() == receiverId) {

            System.out.println("Cannot Send Money To Yourself.");
            return;
        }

        sender.sendMoney(receiver, amount);
    }

    public void showUsers() {

        System.out.println("\n------ Available Users ------");

        for (UserWallet user : users) {
            System.out.println(user.getUserId() + " - " + user.getName());
        }

    }

    public void showTransactions(UserWallet user) {

        System.out.println("\n------ Transaction History ------");

        if (user.getHistory().isEmpty()) {
            System.out.println("No Transactions Found.");
            return;
        }

        for (Transaction t : user.getHistory()) {
            System.out.println(t);
        }

    }

}
