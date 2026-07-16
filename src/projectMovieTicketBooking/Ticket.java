package projectMovieTicketBooking;

public class Ticket {
    public void printTicket(Booking booking, Show show, double gst, double finalBill){
        System.out.println("\n===========================");
        System.out.println("           Movie Ticket      ");
        System.out.println("=============================");

        System.out.println("Booking Id : BK " + booking.getBookinId());
        System.out.println("Movie "+show.getMovie().getMovieName());
        System.out.println("Theater "+show.getTheater().getTheaterName());
        System.out.println("Location "+show.getTheater().getLocation());
        System.out.println("Timings :"+show.getTiming());
        System.out.println("Seats   : ");

        for (String seat : booking.getBookedSeats()){
            if(seat!=null)
                System.out.println(seat+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Ticket Amount : ₹"
                + booking.getTotalAmount());
        System.out.println("GST (18%)     : ₹"
                + gst);
        System.out.println("Final Amount  : ₹"
                + finalBill);
        System.out.println("======================================");
    }
}
