package projectMovieTicketBooking;

public class Movie {
    private int movieId;
    private String movieName;
    private String language;
    private String duration;
    private double ticketPrice;

    public Movie(){
        System.out.println("Movie Object Created.");
    }

    public Movie(int movieId, String movieName, String language, String duration, double ticketPrice){
        this.movieId = movieId;
        this.movieName = movieName;
        this.language = language;
        this.duration = duration;
        this.ticketPrice = ticketPrice;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void displayMovie(){
        System.out.println("----------------------------");
        System.out.println("Movie Id        : "+movieId);
        System.out.println("Movie Name      : "+movieName);
        System.out.println("Movie Language  : "+language);
        System.out.println("Movie duration  : "+duration);
        System.out.println("Movie Ticket    : "+ticketPrice);
        System.out.println("----------------------------");
    }

    @Override
    public String toString() {
        return movieId + " - " + movieName;
    }
}
