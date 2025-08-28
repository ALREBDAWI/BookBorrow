package Controller.Book;

import Model.Book;
import Model.BooksList;

import java.util.Scanner;

public class CreateNewBook {
    public static Book createNewBook(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Title: ");
        String bookTitle = sc.nextLine();
        System.out.println("Enter Book Author: ");
        String bookAuthor = sc.nextLine();
        System.out.println("Enter Book Quantity: ");
        int bookQuantity = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Book ISBN: ");
        long bookIsbn = Long.parseLong(sc.nextLine());
        Book book = new Book(bookTitle, bookAuthor, bookQuantity, bookIsbn);
        System.out.println(book);
        BooksList.setBooksList(book);
        return book;
    }

}

