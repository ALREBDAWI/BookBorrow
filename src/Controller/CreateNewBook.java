package Controller;

import Model.Book;

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
        int bookIsbn = Integer.parseInt(sc.nextLine());
        Book book = new Book(bookTitle, bookAuthor, bookQuantity, bookIsbn);
        System.out.println(book);
        return book;
    }

    public static void main(String[] args) {
        createNewBook();
    }
}
