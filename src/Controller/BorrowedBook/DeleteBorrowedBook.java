package Controller.BorrowedBook;

import Model.*;

import java.util.Scanner;

public class DeleteBorrowedBook {
    public static void removeBorrowedBook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book title: ");
        String title = sc.nextLine();
        System.out.println("Enter Borrower first name: ");
        String borrowerFirstName = sc.nextLine();
        System.out.println("Enter Borrower last name: ");
        String borrowerLastName = sc.nextLine();
        BorrowedBook borrowedBookToDelete = null;
        for (BorrowedBook book : BorrowedBooksList.getBorrowedBooks()){
            if(book.getTitle().equalsIgnoreCase(title) && book.getBorrower().getName().equalsIgnoreCase(borrowerFirstName) && book.getBorrower().getSurname().equalsIgnoreCase(borrowerLastName)){
                borrowedBookToDelete = book;
            }
        }
        if(borrowedBookToDelete!=null){
            BorrowedBooksList.removeBorrowedBook(borrowedBookToDelete);
        }else {
            System.out.println(title + "Book Not Found");
        }
    }
}
