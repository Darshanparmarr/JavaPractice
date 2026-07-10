package projectMovieTicketBooking;


public class Main {

    public static void main(String[] args) {

        System.out.println("========== MOVIE BOOKING ==========\n");

        Movie movie1 = new Movie(
                101,
                "Avengers Endgame",
                "English",
                "3 Hours",
                250);

        Movie movie2 = new Movie(
                102,
                "Pushpa 2",
                "Hindi",
                "2 Hours 50 Minutes",
                220);

        Theater theater1 = new Theater(
                1,
                "PVR Cinemas",
                "Mumbai");

        User user1 = new User(
                1001,
                "Darshan",
                "9876543210");

        movie1.displayMovie();

        movie2.displayMovie();

        theater1.displayTheater();

        user1.displayUser();

    }

}