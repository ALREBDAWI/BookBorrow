package Controller.BorrowedBook;

import Model.PersonsList;
import Model.BooksList;
import Model.BorrowedBook;
import Model.Person;
import Model.Book;
import java.time.LocalDate;
import java.util.Scanner;

public class CreateBorrowedBook {
    public static BorrowedBook createNewBorrowedBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Book title");
        String bookName = input.nextLine();
        //we get full name of member
        System.out.println("Enter Borrower First Name");
        String borrowerFirstName = input.nextLine();
        System.out.println("Enter Borrower Last Name");
        String borrowerLastName = input.nextLine();

        Book selectedBook = null;
        Person selectedPerson = null;

        //we check if the entered title exists in books list
        for (Book b : BooksList.getBooksList()) {
            if(b.getTitle().equalsIgnoreCase(bookName)){
                selectedBook = b;
                break;
            }
        }

        //check if the entered full name exists in members list
        for (Person p : PersonsList.getPeopleList()){
            if(p.getName().equalsIgnoreCase(borrowerFirstName) && p.getSurname().equalsIgnoreCase(borrowerLastName)){
                selectedPerson = p;
                break;
            }
        }

        if(selectedBook == null || selectedPerson == null){
            System.out.println("Book or Person Not Found");
            return null;
        }
        //condition to assure the availability of the book
        if(selectedBook.getQuantity() > 0 ){
            BorrowedBook borrowedBook = new BorrowedBook(selectedPerson,selectedBook,LocalDate.now());
            selectedBook.setQuantity(selectedBook.getQuantity()-1);
            System.out.println(borrowedBook);
            return borrowedBook;
        }else {
            System.out.println("Book is out of stock! ");
            return null;
        }
    }
}
