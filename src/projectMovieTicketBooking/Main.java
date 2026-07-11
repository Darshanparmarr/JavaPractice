package projectMovieTicketBooking;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Seat seat = new Seat();

        while (true) {

            System.out.println("\n========== MOVIE BOOKING ==========");

            System.out.println("1. View Seats");
            System.out.println("2. Book Seat");
            System.out.println("3. Exit");

            System.out.print("Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    seat.displaySeats();

                    break;

                case 2:

                    seat.displaySeats();

                    System.out.print("\nEnter Seat Number (Example A1): ");

                    String seatNo = sc.next();

                    if (seat.bookSeat(seatNo)) {

                        System.out.println("\nSeat Booked Successfully!");
                    } else {

                        System.out.println("\nSeat Not Available or Invalid!");
                    }

                    break;

                case 3:

                    System.out.println("\nThank You!");

                    sc.close();

                    return;

                default:

                    System.out.println("Invalid Choice");
            }

        }

    }

}
