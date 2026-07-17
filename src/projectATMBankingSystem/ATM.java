package projectATMBankingSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {

    Scanner sc = new Scanner(System.in);
    BankAccount account = new BankAccount(10000);

    public void start() {

        int choice;

        do {

            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");

            try {

                choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        System.out.print("Enter Deposit Amount : ");
                        double deposit = sc.nextDouble();

                        account.deposit(deposit);

                        break;

                    case 2:

                        System.out.print("Enter Withdraw Amount : ");
                        double withdraw = sc.nextDouble();

                        account.withdraw(withdraw);

                        break;

                    case 3:

                        account.checkBalance();

                        break;

                    case 4:

                        System.out.println("Thank You for Using ATM.");
                        break;

                    default:

                        System.out.println("Invalid Choice!");

                }

            }

            catch (InputMismatchException e) {

                System.out.println("Please enter numbers only.");
                sc.nextLine();

                choice = 0;
            }

            catch (InvalidAmountException e) {

                System.out.println(e.getMessage());

                choice = 0;
            }

            catch (InsufficientBalanceException e) {

                System.out.println(e.getMessage());

                choice = 0;
            }

            finally {

                System.out.println("------------------------------");

            }

        } while (choice != 4);
    }
}
