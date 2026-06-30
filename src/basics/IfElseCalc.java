import java.util.Scanner;

public class IfElseCalc {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Calculator");
        System.out.println("----------");

        System.out.println("Enter Two Numbers to perform calculation");

        System.out.println("Enter First Number");
        Scanner firstNumber = new Scanner(System.in);
        double fNumber = firstNumber.nextDouble();

        System.out.println("Enter Second Number");
        Scanner secondNumber = new Scanner(System.in);
        double sNumber = secondNumber.nextDouble();

        System.out.println("Enter operation to perform (+, -, *, /, %) ");
        Scanner operation = new Scanner(System.in);
        String op = operation.nextLine();

        if(op.equals("+")){
            double addition = fNumber + sNumber;
            System.out.println("Addition of "+fNumber + " + " + sNumber + " = " + addition);
        } else if (op.equals("-")) {
            double subtraction = fNumber - sNumber;
            System.out.println("Subtraction of "+fNumber + " - " + sNumber + " = " + subtraction);
        } else if (op.equals("*")) {
            double multiplication = fNumber * sNumber;
            System.out.println("Multiplication of "+fNumber + " * " + sNumber + " = " + multiplication);
        } else if (op.equals("/")) {
            double division = fNumber / sNumber;
            System.out.println("Division of "+fNumber + " / " + sNumber + " = " + division);
        } else if (op.equals("%")) {
            double mod = fNumber % sNumber;
            System.out.println("Mod of "+fNumber + " % " + sNumber + " = " + mod);
        } else{
            System.out.println("Entered operation is Invalid, please try again and Enter valid operation (+, -, *, /, %) ");
        }
    }
}
