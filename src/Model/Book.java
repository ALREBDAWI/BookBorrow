package Model;

public class Book {

    //variables
    String title;
    String author;
    int quantity;
    int isbn;

    //constructor
    public Book(String pTitle, String pAuthor, int pQuantity, int pIsbn) {
        setTitle(pTitle);
        setAuthor(pAuthor);
        setQuantity(pQuantity);
        setIsbn(pIsbn);
    }

    //getter and setter

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String pTitle) {
        this.title = pTitle;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String pAuthor) {
        this.author = pAuthor;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int pQuantity) {
        this.quantity = pQuantity;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public void setIsbn(int pIsbn) {
        this.isbn = pIsbn;
    }

    @Override
    public String toString() {
        return  String.format(
                "Book details:\n"+
                        "   Title           : %s\n "+
                        "  Author          : %s\n "+
                        "  Quantity        : %s\n "+
                        "  ISBN            : %s ",
                title, author, quantity, isbn
        );
    }

}
