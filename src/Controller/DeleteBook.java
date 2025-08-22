package Controller;

import Model.Book;
import Model.BooksList;

import java.util.Scanner;

public class DeleteBook {
        public static void removeBook(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the title of the book you want to delete: ");
            String title = sc.nextLine();
            Book bookToDelete = null;
            for (Book b : BooksList.getBooksList()){
                if (b.getTitle().equalsIgnoreCase(title)){
                    bookToDelete = b;
                    break;
                }
            }

            if (bookToDelete != null){
                BooksList.deleteBook(bookToDelete);
                System.out.println(bookToDelete + " was successfully deleted!");
            }else {
                System.out.println( title + "Not Found");
            }
        }
    }


