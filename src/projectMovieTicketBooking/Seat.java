package projectMovieTicketBooking;

public class Seat {
    private char [][] seats;

    public Seat() {

        seats = new char[5][5];

        for (int i = 0; i < seats.length; i++) {

            for (int j = 0; j < seats[i].length; j++) {

                seats[i][j] = 'O';
            }
        }
    }
    public void displaySeats(){
        System.out.println("\n============ Screen ============");
        System.out.print("   ");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < seats.length; i++) {

            char row = (char) ('A' + i);

            System.out.print(row + "  ");

            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("\nO = Available");
        System.out.println("X = Booked");

    }
    public boolean bookSeat(String seatNumber){
        if(seatNumber.length()!=2)
            return false;

        char row = Character.toUpperCase(seatNumber.charAt(0));

        int col = seatNumber.charAt(1) - '1';
        int rowIndex = row - 'A';

        if(rowIndex < 0 || rowIndex >= 5 || col < 0 || col >= 5){
            return false;
        }

        if (seats[rowIndex][col] == 'X') {

            return false;
        }

        seats[rowIndex][col] = 'X';

        return true;
    }

    public boolean isAvailable(String seatNumber) {

        char row = Character.toUpperCase(seatNumber.charAt(0));

        int col = seatNumber.charAt(1) - '1';

        int rowIndex = row - 'A';

        return seats[rowIndex][col] == 'O';
    }
}
