public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");

        library.showAvailableBooks();

        library.issueBook("Book 1");
        library.showAvailableBooks();

        library.issueBook("Book 4"); // Book 4 is not available
        library.returnBook("Book 2");
        library.showAvailableBooks();
    }
}

