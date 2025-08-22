package Model;

import java.util.ArrayList;

public class BooksList {
    private static ArrayList<Book> books = new ArrayList<>();

    //getter
    public static ArrayList<Book> getBooksList() {
        return books;
    }
    //add books to list
    public static void setBooksList(Book book) {
        books.add(book);
    }

    //remove book from list
    public static void deleteBook(Book book){
        books.remove(book);
    };
}
