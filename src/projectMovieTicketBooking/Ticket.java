package projectMovieTicketBooking;

public class Ticket {
    public void printTicket(Booking booking){
        System.out.println("\n===========================");
        System.out.println("           Movie Ticket      ");
        System.out.println("=============================");

        System.out.println("Booking Id : BK " + booking.getBookinId());
        System.out.println("Movie "+booking.getMovie().getMovieName());

        System.out.println("Seats   : ");

        for (String seat : booking.getBookedSeats()){
            if(seat!=null)
                System.out.println(seat+" ");
        }
        System.out.println();
        System.out.println("Total Seats : "+booking.getTotalSeats());
        System.out.println("Total Bill : "+booking.getTotalAmount());
        System.out.println("=============================");

    }
}
