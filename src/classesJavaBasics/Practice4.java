import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];

        System.out.println("Enter 3 names");
        for (int i = 0; i <= names.length - 1; i++) {
            names[i] = sc.next();
        }

        System.out.print("Names which you entered : ");
        for (int i = 0; i <= names.length - 1; i++) {
            System.out.print(names[i] + " ");
        }
    }
}