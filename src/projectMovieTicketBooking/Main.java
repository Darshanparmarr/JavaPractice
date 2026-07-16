package projectMovieTicketBooking;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Movie[] movies = {

                new Movie(101,
                        "Avengers Endgame",
                        "English",
                        "3 Hours",
                        250),

                new Movie(102,
                        "Pushpa 2",
                        "Hindi",
                        "2h 45m",
                        220),

                new Movie(103,
                        "KGF Chapter 2",
                        "Hindi",
                        "2h 50m",
                        200)

        };

        Theater[] theaters = {

                new Theater(1,
                        "PVR Cinemas",
                        "Mumbai"),

                new Theater(2,
                        "INOX",
                        "Mumbai"),

                new Theater(3,
                        "Cinepolis",
                        "Mumbai")

        };

        Show[] shows = {

                new Show(1,
                        movies[0],
                        theaters[0],
                        "10:00 AM"),

                new Show(2,
                        movies[0],
                        theaters[1],
                        "2:00 PM"),

                new Show(3,
                        movies[1],
                        theaters[2],
                        "6:00 PM"),

                new Show(4,
                        movies[2],
                        theaters[1],
                        "9:30 PM")

        };

        User user = new User(
                1001,
                "Darshan",
                "9876543210");

        Seat seat = new Seat();
        Ticket ticket = new Ticket();
        Payment payment = new Payment();

        while (true) {

            System.out.println("\n======================================");
            System.out.println("      MOVIE TICKET BOOKING");
            System.out.println("======================================");

            System.out.println("1. View Movies");
            System.out.println("2. View Theaters");
            System.out.println("3. View Shows");
            System.out.println("4. Book Ticket");
            System.out.println("5. View Seats");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\n===== AVAILABLE MOVIES =====");

                    for (Movie movie : movies) {

                        movie.displayMovie();
                    }

                    break;

                case 2:

                    System.out.println("\n===== AVAILABLE THEATERS =====");

                    for (Theater theater : theaters) {

                        theater.displayTheater();
                    }

                    break;

                case 3:

                    System.out.println("\n===== AVAILABLE SHOWS =====");

                    for (Show show : shows) {

                        show.displayShow();
                    }

                    break;

                case 4:

                    // Display Shows

                    System.out.println("\n===== SELECT SHOW =====");

                    for (Show show : shows) {

                        show.displayShow();
                    }

                    System.out.print("\nEnter Show Number : ");

                    int showChoice = sc.nextInt();

                    if (showChoice < 1 || showChoice > shows.length) {

                        System.out.println("Invalid Show!");

                        break;
                    }

                    Show selectedShow = shows[showChoice - 1];

                    Movie selectedMovie =
                            selectedShow.getMovie();

                    Theater selectedTheater =
                            selectedShow.getTheater();

                    // Seat Layout

                    seat.displaySeats();

                    System.out.print("\nHow many seats do you want? : ");

                    int totalSeats = sc.nextInt();

                    String[] bookedSeats =
                            new String[totalSeats];

                    for (int i = 0; i < totalSeats; i++) {

                        System.out.print("Enter Seat "
                                + (i + 1)
                                + " : ");

                        String seatNo = sc.next();

                        if (seat.bookSeat(seatNo)) {

                            bookedSeats[i] = seatNo;

                        } else {

                            System.out.println("Seat already booked or invalid!");

                            i--;
                        }

                    }

                    Booking booking =
                            new Booking(
                                    selectedMovie,
                                    selectedTheater,
                                    user,
                                    bookedSeats,
                                    totalSeats);

                    double gst =
                            payment.calculateGST(
                                    booking.getTotalAmount());

                    double finalBill =
                            payment.calculateFinalBill(
                                    booking.getTotalAmount());

                    ticket.printTicket(
                            booking,
                            selectedShow,
                            gst,
                            finalBill);

                    break;

                case 5:

                    seat.displaySeats();

                    break;

                case 6:

                    System.out.println("\nThank You!");

                    sc.close();

                    return;

                default:

                    System.out.println("Invalid Choice!");
            }

        }

    }

}