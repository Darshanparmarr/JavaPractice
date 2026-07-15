package classesExceptionHandling.customException;

import java.util.Scanner;

public class UserDefinedException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckingAccount checkingAccount = new CheckingAccount(8767876);
        try{
            checkingAccount.setBalance(60000);
            System.out.println("The initial balance is " + checkingAccount.getBalance());
            System.out.println("Enter the amount to deposit : ");
            double damount = scanner.nextDouble();
            checkingAccount.deposit(damount);
            System.out.println("The balance is : " + checkingAccount.getBalance() );
            System.out.println("Enter the amount to withdraw : ");
            double wamount = scanner.nextDouble();
            checkingAccount.withdraw(wamount);
        }catch(InsufficientFundsException e){
            System.out.println("Balance is insufficient");
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("The code after catch continued...");
    }
}
