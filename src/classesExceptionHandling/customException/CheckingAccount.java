package classesExceptionHandling.customException;

public class CheckingAccount {
    private double balance;
    private int number;

    public CheckingAccount(int number){
        this.number = number;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance (){
        return balance;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount <= balance){
            balance -= amount;
        }else{
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

}
