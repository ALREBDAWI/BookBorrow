package Controller.Book;

import Model.Book;
import Model.BooksList;

import java.util.Scanner;

public class ModifyBook {
    public static Book modifyBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book title");
        String title = sc.nextLine();
        System.out.println("Enter Book author");
        String author = sc.nextLine();
        Book bookToModify = null;
        for (Book b : BooksList.getBooksList()) {
            if(b.getTitle().equalsIgnoreCase(title) && b.getAuthor().equalsIgnoreCase(author)){
                bookToModify = b;
            }
        }
        if(bookToModify != null){
            System.out.println("enter new title");
            String newTitle = sc.nextLine();
            System.out.println("enter new author");
            String newAuthor = sc.nextLine();
            System.out.println("do you want to change ISBN ? true / false ");
            Boolean choice = sc.nextBoolean();

            if(choice){
                System.out.println("enter new ISBN");
                Long newISBN = sc.nextLong();
                bookToModify.setIsbn(newISBN);
            }
            bookToModify.setTitle(newTitle);
            bookToModify.setAuthor(newAuthor);
            System.out.println("Book title modified successfully: " + bookToModify);
        }else {
            throw new IllegalArgumentException("Invalid input");
        }
        return bookToModify;
    }
}
