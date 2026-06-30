import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        System.out.println("Enter First Number ");
        Scanner firstNum = new Scanner(System.in);
        int first = firstNum.nextInt();

        System.out.println("Enter Second Number ");
        Scanner secondNum = new Scanner(System.in);
        int second = secondNum.nextInt();

        System.out.println("First Number Before "+ first);
        System.out.println("Second Number Before "+ second);

        first -= second;
        System.out.println("First Number After Subtraction "+ first);
        System.out.println("Second Number After Subtraction"+second);

        first *= second;
        System.out.println("First Number After Multiply "+ first);
        System.out.println("Second Number After Multiply"+second);

        first /= second;
        System.out.println("First Number After Division "+ first);
        System.out.println("Second Number After Division"+second);

        first %= second;
        System.out.println("First Number After mod"+ first);
        System.out.println("Second Number After mod"+second);

    }
}
