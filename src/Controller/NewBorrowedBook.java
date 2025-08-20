package Controller;

import Model.Book;
import Model.BorrowedBook;
import Model.Person;

import java.time.LocalDate;
import java.util.Scanner;

public class NewBorrowedBook {
    public static BorrowedBook createNewBorrowedBook(){
        Scanner sc = new Scanner(System.in);
        Person p = new Person("Ahmad", "Youssef", "ay25@gmail.com", LocalDate.now());
        System.out.println("Enter Borrowed Book title: ");
        String title = sc.nextLine();
        BorrowedBook borrowedBook = new BorrowedBook(p,title,LocalDate.now());
        System.out.println(borrowedBook);
        return borrowedBook;
    }

    public static void main(String[] args) {
        createNewBorrowedBook();
    }
}
