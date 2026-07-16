package projectMovieTicketBooking;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Movie
        Movie[] movies = {

                new Movie(
                        101,
                        "Avengers Endgame",
                        "English",
                        "3 Hours",
                        250),

                new Movie(
                        102,
                        "Pushpa 2",
                        "Hindi",
                        "2h 45m",
                        220),

                new Movie(
                        103,
                        "KGF Chapter 2",
                        "Hindi",
                        "2h 50m",
                        200)

        };

        // Create Theater
        Theater[] theaters = {

                new Theater(
                        1,
                        "PVR",
                        "Mumbai"),

                new Theater(
                        2,
                        "INOX",
                        "Mumbai"),

                new Theater(
                        3,
                        "Cinepolis",
                        "Mumbai")
        };

        Show[] shows = {

                new Show(
                        1,
                        movies[0],
                        theaters[0],
                        "10:00 AM"),

                new Show(
                        2,
                        movies[0],
                        theaters[1],
                        "2:00 PM"),

                new Show(
                        3,
                        movies[1],
                        theaters[2],
                        "6:00 PM"),

                new Show(
                        4,
                        movies[2],
                        theaters[1],
                        "9:30 PM")
        };

        // Create User
        User user = new User(
                1001,
                "Darshan",
                "9876543210"
        );

        // Seat Object
        Seat seat = new Seat();

        // Ticket Object
        Ticket ticket = new Ticket();

        while (true) {

            System.out.println("\n=================================");
            System.out.println("     MOVIE TICKET BOOKING");
            System.out.println("=================================");
            System.out.println("1. View Movie");
            System.out.println("2. View Theater");
            System.out.println("3. View Seats");
            System.out.println("4. Book Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    movie.displayMovie();
                    break;

                case 2:

                    theater.displayTheater();
                    break;

                case 3:

                    seat.displaySeats();
                    break;

                case 4:

                    seat.displaySeats();

                    System.out.print("\nHow many seats do you want to book? : ");
                    int totalSeats = sc.nextInt();

                    String[] bookedSeats = new String[totalSeats];

                    for (int i = 0; i < totalSeats; i++) {

                        System.out.print("Enter Seat " + (i + 1) + " (Example A1): ");

                        String seatNo = sc.next();

                        if (seat.bookSeat(seatNo)) {

                            bookedSeats[i] = seatNo;

                        } else {

                            System.out.println("Seat already booked or invalid!");
                            i--;
                        }
                    }

                    Booking booking = new Booking(
                            movie,
                            theater,
                            user,
                            bookedSeats,
                            totalSeats
                    );

                    ticket.printTicket(booking);

                    break;

                case 5:

                    System.out.println("\nThank You for using Movie Ticket Booking System.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");

            }

        }

    }

}