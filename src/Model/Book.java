package Model;

public class Book {

    //variables
    private String title;
    private String author;
    private int quantity;
    private long isbn;

    //constructor
    public Book(String pTitle, String pAuthor, int pQuantity, long pIsbn) {
        setTitle(pTitle);
        setAuthor(pAuthor);
        setQuantity(pQuantity);
        setIsbn(pIsbn);
    }

    public Book() {
        title = "";
        author = "";
        quantity = 1;
        isbn = 0;
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

    public long getIsbn() {
        return this.isbn;
    }

    public void setIsbn(long pIsbn) {
        this.isbn = pIsbn;
    }

    @Override
    public String toString() {
        return  String.format(
                "Book details:\n"+
                        "   Title           : %s\n "+
                        "  Author          : %s\n "+
                        "  Quantity        : %s\n "+
                        "  ISBN            : %s\n ",
                title, author, quantity, isbn + "\n"
        );
    }

}
