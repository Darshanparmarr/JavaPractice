package classesExceptionHandling;

public class ChainedException {
    public static void main(String[] args) {
        try{
            try{
                int result = 10/0;
            }catch (ArithmeticException e){
                throw new Exception("Division Failed", e);
            }
        }catch (Exception e){
            System.out.println("Exception : " + e.getMessage());
            System.out.println("Exception : " + e.getCause());
        }
    }
}
