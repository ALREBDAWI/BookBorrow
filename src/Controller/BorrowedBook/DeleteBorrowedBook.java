package Controller.BorrowedBook;

import Model.*;

import java.util.Scanner;

public class DeleteBorrowedBook {
    public static void removeBorrowedBook(){

        //get details of the book to be deleted from user and store it in vars
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book title: ");
        String title = sc.nextLine();
        System.out.println("Enter Borrower first name: ");
        String borrowerFirstName = sc.nextLine();
        System.out.println("Enter Borrower last name: ");
        String borrowerLastName = sc.nextLine();

        //var to store the selected book
        BorrowedBook borrowedBookToDelete = null;

        //search for borrowed book in its list using title and borrower name, last name
        for (BorrowedBook borrowedBook : BorrowedBooksList.getBorrowedBooks()){
            if(borrowedBook.getTitle().equalsIgnoreCase(title) && borrowedBook.getBorrower().getName().equalsIgnoreCase(borrowerFirstName) && borrowedBook.getBorrower().getSurname().equalsIgnoreCase(borrowerLastName)){
                borrowedBookToDelete = borrowedBook;
                break;
            }
        }

        //delete it from list if it is found
        if(borrowedBookToDelete!=null){
            BorrowedBooksList.removeBorrowedBook(borrowedBookToDelete);
            System.out.println("Borrowed Book has been deleted successfully");
        }else {
            System.out.println(title + " Book was not found try again");
        }
    }
}
