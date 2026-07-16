package projectMovieTicketBooking;

public class Payment {
    private static final double GST = 0.18;
    public double calculateGST(double amount){
        return amount * GST;
    }
    public double calculateFinalBill(double amount){
        return amount + calculateGST(amount);
    }
}
