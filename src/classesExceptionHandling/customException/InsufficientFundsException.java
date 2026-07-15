package classesExceptionHandling.customException;

public class InsufficientFundsException extends Exception {
    double needs;
    public InsufficientFundsException(double needs){
        this.needs = needs;
    }

    @Override
    public String toString(){
        return "InsufficientFundException [needs = "+ needs + "]";
    }
}
