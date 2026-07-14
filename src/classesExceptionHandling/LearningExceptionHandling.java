package classesExceptionHandling;

import java.util.Scanner;

public class LearningExceptionHandling {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter First number");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter Second number");
            int secondNumber = scanner.nextInt();
            int result = firstNumber/secondNumber;
            System.out.println(result);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("End of program");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("End of program");
        }finally {
            doSomeWork();
        }
    }
    public static void doSomeWork(){
        System.out.println("Working....");
    }
}
