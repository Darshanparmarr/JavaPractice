package projectMovieTicketBooking;

public class User {
    private int userId;
    private String name;
    private String mobile;

    public User(int userId, String name, String mobile){
        this.userId = userId;
        this.name = name;
        this.mobile = mobile;
    }

    public void displayUser(){
        System.out.println("---------------------------");

        System.out.println("User ID : " + userId);
        System.out.println("Name    : " + name);
        System.out.println("Mobile  : " + mobile);

        System.out.println("---------------------------");
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

}
