package Model;

import java.time.LocalDate;

public class BorrowedBook extends Book {
    private LocalDate borrowedBookDate;
    private LocalDate returnedBookDate;
    private Person borrowerName;



    //constructor
    public BorrowedBook(Person pBorrowerName,  String pTitle, LocalDate pBorrowingDate) {
        setBorrowedBookDate(pBorrowingDate);
        setReturnedBookDate(7);
        setBorrowerName(pBorrowerName);
        setTitle(pTitle);
    }

    public BorrowedBook() {
        setTitle("Borrowed Book Title");
        borrowedBookDate = LocalDate.now();
        returnedBookDate = borrowedBookDate.plusDays(7);
        borrowerName = new Person();
    }

    //getter and setter
    public LocalDate getBorrowedBookDate() {
        return this.borrowedBookDate;
    }
    public void setBorrowedBookDate(LocalDate pBorrowedBookDate) {
        this.borrowedBookDate = pBorrowedBookDate;
    }

    public LocalDate getReturnedBookDate() {
        return this.returnedBookDate;
    }
    public void setReturnedBookDate(int pBorrowingDays) {
        this.returnedBookDate = borrowedBookDate.plusDays(pBorrowingDays);
    }
    public Person getBorrowerName() {
        return this.borrowerName;
    }
    public void setBorrowerName(Person pBorrowerName) {
        this.borrowerName = pBorrowerName;
    }


    @Override
    public String toString() {
        return String.format(
                "Borrowed Book Details: \n" +

                        "   Title             : %s\n "+
                        "  Borrower          : %s\n "+
                        "  Borrowing date    : %s\n "+
                        "  Returning date    : %s ",
                getTitle(), borrowerName.getName(), borrowedBookDate, returnedBookDate
        );
    }

    public static void main(String[] args) {
        BorrowedBook b = new BorrowedBook();
        System.out.println(b);

    }

}
