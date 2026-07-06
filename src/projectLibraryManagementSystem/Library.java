package projectLibraryManagementSystem;

public class Library {
    void issueBook(String title){
        System.out.println("Issued Book : " + title);
    }

    void issueBook(String title, int days){
        System.out.println("Issued " + title + " for " + days + " days " );
    }

    void issueBook(String title, int days, String member){
        System.out.println(member + " borrowed " + title + " for " + days + " days " );
    }

}
