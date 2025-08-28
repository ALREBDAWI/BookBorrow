package Controller.Book;
import Model.Book;
import Model.BooksList;

import java.util.Scanner;

public class ModifyBook {
    public static Book modifyBook(){

        // read user input using scanner and store it in variables
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Book title");
        String title = sc.nextLine();
        System.out.println(" Enter Book author");
        String author = sc.nextLine();

        // variable to store selected book
        Book bookToModify = null;

        // search in the list by comparing titles
        for (Book b : BooksList.getBooksList()) {
            if(b.getTitle().equalsIgnoreCase(title) && b.getAuthor().equalsIgnoreCase(author)){
                bookToModify = b;
                break;
            }
        }

            // if the book is found, modify
            if(bookToModify != null){

                //the user enters modified details
                System.out.println(" enter new title");
                String newTitle = sc.nextLine();
                System.out.println(" enter new author");
                String newAuthor = sc.nextLine();
                System.out.println(" do you want to change ISBN ? true / false ");
                Boolean choice = sc.nextBoolean();

                // giving the user choice to change ISBN or not
                if(choice){
                    System.out.println(" enter new ISBN");
                    Long newISBN = sc.nextLong();
                    bookToModify.setIsbn(newISBN); //update ISBN
                }

                // update title and author
                bookToModify.setTitle(newTitle);
                bookToModify.setAuthor(newAuthor);
                System.out.println(" Book title modified successfully: " + bookToModify);

        }else {
            throw new IllegalArgumentException(" Invalid input try again");
        }

        // modified book object return
        return bookToModify;
    }
}
