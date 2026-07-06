package projectLibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Library Management System =====");
        LibraryBook book1 = new LibraryBook(101, "Java Programming", "James Gosling");
        book1.displayBook();
        System.out.println();
        Member member = new Member();
        member.setMemberId(1);
        member.setMemberName("Rahul");

        System.out.println(member);

        System.out.println();

        Library library = new Library();
        library.issueBook("Java Programming");
        library.issueBook("Python 7", 9);
        library.issueBook("C++", 7, "Rahul");
    }
}
