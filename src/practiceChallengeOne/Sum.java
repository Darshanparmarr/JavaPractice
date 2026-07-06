package practiceChallengeOne;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter Second Number : ");
        int secondNumber = input2.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("Addition of "+ firstNumber + " + " + secondNumber + " = " + sum);
    }
}
