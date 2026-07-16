package projectMovieTicketBooking;

public class Show {
    private int showId;
    private Movie movie;
    private Theater theater;
    private String timing;

    public Show(int showId, Movie movie, Theater theater, String timing){
        this.showId = showId;
        this.movie = movie;
        this.theater = theater;
        this.timing = timing;
    }

    public Movie getMovie(){
        return movie;
    }

    public Theater getTheater(){
        return theater;
    }

    public String getTiming(){
        return timing;
    }

    public void displayShow(){
        System.out.println(showId + ". "
                + movie.getMovieName()
                + " | "
                + theater.getTheaterName()
                + " | "
                + timing);
    }

}
