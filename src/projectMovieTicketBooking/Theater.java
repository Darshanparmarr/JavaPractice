package projectMovieTicketBooking;

public class Theater {
    private int theaterId;
    private String theaterName;
    private String location;

    public Theater(int theaterId, String theaterName, String location){
        this.theaterId = theaterId;
        this.theaterName = theaterName;
        this.location = location;
    }

    public void displayTheater() {

        System.out.println("--------------------------");

        System.out.println("Theater ID : " + theaterId);
        System.out.println("Name       : " + theaterName);
        System.out.println("Location   : " + location);

        System.out.println("--------------------------");
    }

    public String getTheaterName() {
        return theaterName;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {

        return theaterName + " (" + location + ")";
    }

}
