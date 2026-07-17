package projectATMBankingSystem;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException{
        if(amount<0){
            throw new InvalidAmountException("Deposit AMount must be greater than ZERO (0)");
        }
        balance += amount;
        System.out.println("Rs "+ amount + " deposited successfully");
    }

    public void withdraw(double amount) throws InsufficientBalanceException, InvalidAmountException{
        if(amount < 0){
            throw new InvalidAmountException("Withdrawal amount must be greater than ZERO (0)");
        }

        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance ! ");
        }

        balance -= amount;
        System.out.println("Rs "+ amount+ " withdraw successfully.");
    }

    public void checkBalance(){
        System.out.println("Current Balance : Rs "+balance);
    }

}
