package projectDigitalWallet;

public class UserWallet extends Wallet {
    public UserWallet(int id, String name, int pin, double balance){
        super(id, name, pin, balance);
    }

    @Override
    public void sendMoney(UserWallet receiver, double amount){
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance ");
        }
        balance -= amount;
        receiver.balance += amount;
        history.add(new Transaction(
                "Sent to " + receiver.getName(),
                -amount));

        receiver.getHistory().add(new Transaction(
                "Received from " + getName(),
                amount));

        System.out.println("₹" + amount +
                " Sent Successfully to " +
                receiver.getName());

    }

}
