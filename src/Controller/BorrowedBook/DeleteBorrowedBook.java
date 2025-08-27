/*package Controller.BorrowedBook;

import Model.Book;
import Model.BorrowedBook;
import Model.BorrowedBooksList;
import Model.PersonsList;

import java.util.Scanner;

public class DeleteBorrowedBook {
    public static void removeBorrowedBook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book title: ");
        String title = sc.nextLine();
        System.out.println("Enter Borrower name: ");
        String borrowerName = sc.nextLine();
        BorrowedBook borrowedBookToDelete = null;
        for(Book b : BorrowedBooksList.getBorrowedBooks()){
            if(b.getTitle().equals(title) && b.getBorrowerName().equals(borrowerName)){
                borrowedBookToDelete = b;
            }
        }
        
    }
}*/
