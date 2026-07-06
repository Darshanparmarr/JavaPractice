package projectLibraryManagementSystem;

public class LibraryBook extends Book {
    private  int bookId;
    static String libraryName = "City Library";

    LibraryBook(int id, String title, String author){
        super(title, author);
        this.bookId = id;
    }

    @Override
    void displayBook(){
        System.out.println("Library : " + libraryName);
        System.out.println("Book Id  : " + bookId);
        System.out.println("Title  : " + title);
        System.out.println("Author  : " + author);
    }

}
