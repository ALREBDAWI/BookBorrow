package Controller.Book;

import Model.Book;
import Model.BooksList;

import java.util.Scanner;

public class CreateNewBook {
    public static Book createNewBook(){

        //read user input using scanner and store it in variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Title: ");
        String bookTitle = sc.nextLine();
        System.out.println("Enter Book Author: ");
        String bookAuthor = sc.nextLine();
        System.out.println("Enter Book Quantity: ");
        int bookQuantity = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Book ISBN: ");
        long bookIsbn = Long.parseLong(sc.nextLine());

        //create new book with controller using provided details
        Book book = new Book(bookTitle, bookAuthor, bookQuantity, bookIsbn);
        System.out.println(book + " the book has been created successfully!");

        //add the new book to the list
        BooksList.setBooksList(book);

        return book;
    }

}

