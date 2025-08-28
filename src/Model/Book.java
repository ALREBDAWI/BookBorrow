package Model;
import View.LibraryMenu;

import java.util.regex.*;
public class Book {

    // variables
    private String title;
    private String author;
    private int quantity;
    private long isbn;

    // constructor
    public Book(String pTitle, String pAuthor, int pQuantity, long pIsbn) {
        setTitle(pTitle);
        setAuthor(pAuthor);
        setQuantity(pQuantity);
        setIsbn(pIsbn);
    }

    public Book() {
        title = "my book";
        author = "me";
        quantity = 2;
        isbn = 1259694281600L;
    }

    //------ getters and setters ------

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String pTitle) {
        String regex = "^[A-Za-z0-9][A-Za-z0-9\\s:;,.!?'\\-]{1,99}$";
        if (pTitle.matches(regex)) {
            this.title = pTitle;
        }else{
            throw new IllegalArgumentException(" Title is invalid");
        }
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String pAuthor) {
        String regex = "^(?:[A-Za-z]\\.?|[A-Za-z][a-z.]+)(?: (?:[A-Za-z]\\.?|[A-Za-z][a-z.]+))*$";
        if(pAuthor.matches(regex)) {
            this.author = pAuthor;
        }else {
            throw  new IllegalArgumentException(" Invalid Author Name Format");
        }
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int pQuantity) {
        if(pQuantity >= 0) {
            this.quantity = pQuantity;
        }else  {
            throw  new IllegalArgumentException(" Quantity cannot be negative");
        }
    }

    public long getIsbn() {
        return this.isbn;
    }

    public void setIsbn(long pIsbn) {
        int isbnLength = String.valueOf(pIsbn).length();
        if(isbnLength == 10 || isbnLength == 13) {
            this.isbn = pIsbn;
        }else {
            throw  new IllegalArgumentException(" ISBN must be 10 or 13 digits long");
        }
    }

    @Override
    public String toString() {
        return  String.format(
                LibraryMenu.BACKGROUND + "\n"+ LibraryMenu.RESET +
                        "   Title      : %s\n "+
                        "  Author     : %s\n "+
                        "  Quantity   : %s\n "+
                        "  ISBN       : %s\n ",
                title, author, quantity, isbn + "\n"
        );
    }

}
