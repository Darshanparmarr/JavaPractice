package projectLibraryManagementSystem;

public class Book {
    protected String title;
    protected String author;

    Book(){
        System.out.println("Book Created");
    }

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    void displayBook(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }
}
