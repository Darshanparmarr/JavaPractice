public class Calculator {

    public static String calculator(String op, int fNumber, int sNumber) {
        if (op.equals("+")) {
            int addition = fNumber + sNumber;
            return Integer.toString(addition);
        } else if (op.equals("-")) {
            int subtraction = fNumber - sNumber;
            return Integer.toString(subtraction);
        } else if (op.equals("*")) {
            int multiplication = fNumber * sNumber;
            return Integer.toString(multiplication);
        } else if (op.equals("/")) {
            int division = fNumber / sNumber;
            return Integer.toString(division);
        } else if (op.equals("%")) {
            int mod = fNumber % sNumber;
            return Integer.toString(mod);
        } else {
            return "Invalid operation";
        }
    }
}