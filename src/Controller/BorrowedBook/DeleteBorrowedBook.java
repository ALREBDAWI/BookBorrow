package Controller.BorrowedBook;

import Model.Book;
import Model.BorrowedBooksList;

import java.util.Scanner;

public class DeleteBorrowedBook {
    public static void removeBorrowedBook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book title: ");
        String title = sc.nextLine();
        System.out.println("Enter Borrower name: ");
        String borrowerName = sc.nextLine();
        Book borrowedBookToDelete = null;
        for(Book b : BorrowedBooksList.getBorrowedBooks()){
            if(b.getTitle().equalsIgnoreCase(title)){
                borrowedBookToDelete = b;
            }
        }
        
    }
}
