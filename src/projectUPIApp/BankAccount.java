package projectUPIApp;

public class BankAccount {
    private String accNo;
    private double balance;

    public BankAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void credit(double amount) {

        balance += amount;
    }

    public boolean debit(double amount) {
        if (balance < amount) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccNo(double balance) {
        this.balance = balance;
    }
}
