import java.util.ArrayList;

public class Library {
    private ArrayList<String> availableBooks;
    private ArrayList<String> issuedBooks;

    public Library() {
        availableBooks = new ArrayList<String>();
        issuedBooks = new ArrayList<String>();
    }

    // Method to add a book to the library
    public void addBook(String bookTitle) {
        availableBooks.add(bookTitle);
        System.out.println(bookTitle + " has been added to the library.");
    }

    // Method to issue a book from the library
    public void issueBook(String bookTitle) {
        if (availableBooks.contains(bookTitle)) {
            availableBooks.remove(bookTitle);
            issuedBooks.add(bookTitle);
            System.out.println(bookTitle + " has been issued.");
        } else {
            System.out.println("Sorry, " + bookTitle + " is not available.");
        }
    }

    // Method to return a book to the library
    public void returnBook(String bookTitle) {
        if (issuedBooks.contains(bookTitle)) {
            issuedBooks.remove(bookTitle);
            availableBooks.add(bookTitle);
            System.out.println(bookTitle + " has been returned.");
        } else {
            System.out.println("Sorry, " + bookTitle + " was not issued from this library.");
        }
    }

    // Method to display available books in the library
    public void showAvailableBooks() {
        if (availableBooks.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Available books:");
            for (String book : availableBooks) {
                System.out.println(book);
            }
        }
    }
}

