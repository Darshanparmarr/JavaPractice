package projectContactBook;

import java.util.Scanner;

public class ContactBook {

    static final int SIZE = 5;
    static String[]  names = new String[SIZE];
    static String[]  numbers = new String[SIZE];

    static int count = 0;

    static Scanner sc = new Scanner(System.in);

    static void addContact(){
        if(count == SIZE){
            System.out.println("Contact Book Full !!");
            return;
        }
        System.out.print("Enter Name : ");
        names[count] = sc.nextLine();
        System.out.print("Enter Number : ");
        numbers[count] = sc.nextLine();

        count++;

        System.out.println("Contact added Successfully !");

    }

    static void displayContacts(){
        if(count == 0){
            System.out.println("No Contacts Found.");
            return;
        }
        System.out.printf("\n%-15s %-15s\n", "NAME", "NUMBER");
        System.out.println("=================================");

        for (int i = 0; i<count; i++){
            System.out.printf("%-15s %-15s\n", names[i], numbers[i]);
        }

    }

    static void searchContact(){
        System.out.print("Enter Name : ");
        String search = sc.nextLine();

        for(int i = 0; i < count; i++){
            if(names[i].equalsIgnoreCase(search)){
                System.out.println("Contact Found");
                System.out.println("Name : "+ names[i]);
                System.out.println("Number : "+ numbers[i]);

                return;
            }
        }
        System.out.println("Contact Not Found");
    }

    public static void main(String[] args) {
        while (true){
            System.out.println("\n ======= CONTACT BOOK =======");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    addContact();
                    break;
                case 2:
                    displayContacts();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }

        }
    }

}
