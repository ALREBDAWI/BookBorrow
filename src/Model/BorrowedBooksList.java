package Model;

import java.util.ArrayList;

public class BorrowedBooksList {
    private static ArrayList<BorrowedBook> borrowedBooks =  new ArrayList<>();

    //getter
    public static ArrayList<BorrowedBook> getBorrowedBooks() {
        return borrowedBooks;
    }

    //get borrowers names
    /*public static ArrayList<Person> getBorrowersNames(){
        ArrayList<Person> names = new ArrayList<>();
        for(BorrowedBook borrowedBook : getBorrowedBooks()){
            names.add(borrowedBook.getBorrower().getName());
        }
    }*/

    //add borrowed books
    public static void addBorrowedBook(BorrowedBook book) {
        borrowedBooks.add(book);
    }

    //delete borrowed book
    public static void removeBorrowedBook(Book book) {
        borrowedBooks.remove(book);
    }
}
