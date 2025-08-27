package Model;

import java.util.ArrayList;

public class BorrowedBooksList {
    private static ArrayList<Book> borrowedBooks =  new ArrayList<>();

    //getter
    public static ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    //add borrowed books
    public static void addBorrowedBook(Book book) {
        borrowedBooks.add(book);
    }

    //delete borrowed book
    public static void removeBorrowedBook(Book book) {
        borrowedBooks.remove(book);
    }
}
