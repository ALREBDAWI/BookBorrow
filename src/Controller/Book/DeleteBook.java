package Controller.Book;

import Model.Book;
import Model.BooksList;

import java.util.Scanner;

public class DeleteBook {
        public static void removeBook(){

            // read user input using scanner and store it in variables
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the title of the book you want to delete: ");
            String title = sc.nextLine();

            // variable to store selected book
            Book bookToDelete = null;

            // search for the book in the list by comparing titles
            for (Book b : BooksList.getBooksList()){
                if (b.getTitle().equalsIgnoreCase(title)){
                    bookToDelete = b;
                    break;
                }
            }

            //if the book is found, delete it from list
            if (bookToDelete != null){
                BooksList.deleteBook(bookToDelete);
                System.out.println(bookToDelete + " was successfully deleted!");
            }else {
                System.out.println( title + " Not Found");
            }
        }
    }


