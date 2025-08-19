package Controller;


import Model.Book;
import Model.Librarian;
import Model.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {  //testing models

        Person person = new Person("Adam", "Ahmad", "Adam2020@gmail.com", LocalDate.now());
        Librarian librarian = new Librarian();
        Book book1 = new Book("Book 1", "Author 1", 12, 1000);
        System.out.println(book1+"\n");
        System.out.println(librarian+"\n");
        System.out.println(person);
        }
    }
