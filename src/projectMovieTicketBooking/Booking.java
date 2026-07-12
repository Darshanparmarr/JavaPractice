package projectMovieTicketBooking;

public class Booking {
    private static int bookingCounter = 1000;
    private int bookinId;
    private Movie movie;
    private Theater theater;
    private User user;

    private String[] bookedSeats;
    private int totalSeats;
    private double totalAmount;

    public  Booking(Movie movie, Theater theater, User user, String[] bookedSeats, int totalSeats){
        this.bookinId = ++bookingCounter;
        this.movie = movie;
        this.theater = theater;
        this.user = user;

        this.bookedSeats = bookedSeats;
        this.totalSeats = totalSeats;

        totalAmount = movie.getTicketPrice() * totalSeats;

    }

    public int getBookinId() {
        return bookinId;
    }

    public Movie getMovie() {
        return movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public User getUser() {
        return user;
    }

    public String[] getBookedSeats() {
        return bookedSeats;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
