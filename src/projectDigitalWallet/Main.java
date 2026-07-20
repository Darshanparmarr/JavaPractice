package projectDigitalWallet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        WalletService service = new WalletService();

        UserWallet currentUser = null;

        while (true) {

            if (currentUser == null) {

                System.out.println("\n==================================");
                System.out.println("      DIGITAL WALLET SYSTEM");
                System.out.println("==================================");
                System.out.println("1. Login");
                System.out.println("2. View Users");
                System.out.println("3. Exit");
                System.out.print("Enter Choice : ");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        try {

                            System.out.print("Enter User ID : ");
                            int id = sc.nextInt();

                            System.out.print("Enter PIN : ");
                            int pin = sc.nextInt();

                            currentUser = service.login(id, pin);

                            System.out.println("Welcome " + currentUser.getName());

                        } catch (InvalidPinException | UserNotFoundException e) {

                            System.out.println(e.getMessage());

                        }

                        break;

                    case 2:

                        service.showUsers();
                        break;

                    case 3:

                        System.out.println("Thank You for Using Digital Wallet.");
                        sc.close();
                        System.exit(0);

                    default:

                        System.out.println("Invalid Choice.");

                }

            } else {

                System.out.println("\n==================================");
                System.out.println("Logged In : " + currentUser.getName());
                System.out.println("==================================");
                System.out.println("1. Add Money");
                System.out.println("2. Send Money");
                System.out.println("3. Check Balance");
                System.out.println("4. Transaction History");
                System.out.println("5. Logout");
                System.out.println("6. Exit");
                System.out.print("Enter Choice : ");

                int choice = sc.nextInt();

                try {

                    switch (choice) {

                        case 1:

                            System.out.print("Enter Amount : ");
                            double amount = sc.nextDouble();

                            currentUser.addMoney(amount);

                            break;

                        case 2:

                            service.showUsers();

                            System.out.print("\nEnter Receiver ID : ");
                            int receiverId = sc.nextInt();

                            UserWallet receiver = service.findUser(receiverId);

                            if (receiver.getUserId() == currentUser.getUserId()) {

                                System.out.println("Cannot send money to yourself.");
                                break;

                            }

                            System.out.print("Enter Amount : ");
                            double sendAmount = sc.nextDouble();

                            currentUser.sendMoney(receiver, sendAmount);

                            break;

                        case 3:

                            currentUser.checkBalance();

                            break;

                        case 4:

                            service.showTransactions(currentUser);

                            break;

                        case 5:

                            currentUser = null;

                            System.out.println("Logged Out Successfully.");

                            break;

                        case 6:

                            System.out.println("Thank You!");
                            sc.close();
                            System.exit(0);

                        default:

                            System.out.println("Invalid Choice.");

                    }

                }catch (InsufficientBalanceException e) {
                    System.out.println(e.getMessage());
                }
                catch (UserNotFoundException e) {
                    System.out.println(e.getMessage());
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }

        }

    }

}