package Controller;

import Model.*;
import Model.PeopleList;
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
        System.out.println("Enter Borrower Name");
        String borrowerName = input.nextLine();

        Book selectedBook = null;
        Person selectedPerson = null;

        for (Book b : BooksList.getBooksList()) {
            if(b.getTitle().equals(bookName)){
                selectedBook = b;
                break;
            }
        }

        for (Person p : PeopleList.getPeopleList()){
            if(p.getName().equalsIgnoreCase(borrowerName)){
                selectedPerson = p;
                break;
            }
        }

        if(selectedBook == null || selectedPerson == null){
            System.out.println("Book or Person Not Found");
            return null;
        }

        BorrowedBook borrowedBook = new BorrowedBook(selectedPerson,selectedBook,LocalDate.now());
        BorrowedBooksList.addBorrowedBook(borrowedBook);
        if(selectedBook.getQuantity() > 0 ){
            selectedBook.setQuantity(selectedBook.getQuantity()-1);
            System.out.println(borrowedBook);
            return borrowedBook;

        }else {
            System.out.println("Book is out of stock! ");
            return null;
        }
    }

    public static void main(String[] args) {
        CreateBorrowedBook.createNewBorrowedBook();

    }

}
