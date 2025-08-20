package View;

import Model.Book;
import Model.BorrowedBook;
import Model.Person;

import java.time.LocalDate;
import java.util.ArrayList;

public class Demo {
    public static void demo(){

        //adding members
        Person person1 = new Person("Ahmad", "youssef", "ahmad.youssef@gmail.com", LocalDate.of(2023, 9, 20) );
        Person person2 = new Person("Adam", "Zidane", "lina.hassan@yahoo.com", LocalDate.of(2024, 2, 1));
        Person person3 = new Person("Omar", "Sherif", "omar.ali@hotmail.com", LocalDate.of(2022, 11, 20));

        //adding books
        Book b1 = new Book("Clean Code", "Robert C. Martin", 3, 9780132350884L);
        Book b2 = new Book("Effective Java", "Joshua Bloch", 5, 9780134685991L);
        Book b3 = new Book("Design Patterns", "Erich Gamma", 1, 9780201633610L);

        //adding borrowed books
        BorrowedBook borrowedBook1 = new BorrowedBook(person1, b2.getTitle(), LocalDate.of(2024, 9, 20));
        BorrowedBook borrowedBook2 = new BorrowedBook(person2, b3.getTitle(), LocalDate.now());
        BorrowedBook borrowedBook3 = new BorrowedBook(person3, b3.getTitle(), LocalDate.now());

        ArrayList<BorrowedBook> borrowedList = new ArrayList<>();
        borrowedList.add(borrowedBook1);
        borrowedList.add(borrowedBook2);
        borrowedList.add(borrowedBook3);

        System.out.println(borrowedList);

    }

    public static void main(String[] args) {
        demo();
    }
}
