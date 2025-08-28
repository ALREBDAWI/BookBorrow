package Model;

import java.time.LocalDate;

public class BorrowedBook extends Book {

    private LocalDate borrowedBookDate;
    private LocalDate returnedBookDate;
    private Person borrower;


    //constructor
    public BorrowedBook(Person pBorrower, Book book, LocalDate pBorrowingDate) {
        setBorrowedBookDate(pBorrowingDate);
        setReturnedBookDate(7);
        setBorrower(pBorrower);
        setTitle(book.getTitle());
        setIsbn(book.getIsbn());
    }

    //default constructor
    public BorrowedBook() {
        setTitle("Borrowed Book Title");
        borrowedBookDate = LocalDate.now();
        returnedBookDate = borrowedBookDate.plusDays(7);
        borrower = new Person();
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
    public Person getBorrower() {
        return this.borrower;
    }
    public void setBorrower(Person pBorrowerName) {
        this.borrower = pBorrowerName;
    }


    @Override
    public String toString() {
        return String.format(
                """
            Borrowed Book Details:
              Title           : %s
              ISBN            : %s
              Borrower        : %s %s
              Borrowing Date   : %s
              Returning Date        : %s
            """,
                getTitle(),
                getIsbn(),
                borrower.getName(),
                borrower.getSurname(),
                borrowedBookDate,
                returnedBookDate
        );
    }


}
