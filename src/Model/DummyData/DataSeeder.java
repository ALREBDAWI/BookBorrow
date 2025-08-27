package Model.DummyData;

import Model.*;
import java.time.LocalDate;
import java.util.List;

public class DataSeeder {
    public static void dummyData() {
        // --- Persons ---
        List<Person> persons = List.of(
                new Person("Ahmad", "Youssef", "ahmad.youssef@gmail.com", LocalDate.of(2023, 9, 20)),
                new Person("Sara", "Hassan", "sara.hassan@gmail.com", LocalDate.of(2022, 5, 15)),
                new Person("Omar", "Ali", "omar.ali@yahoo.com", LocalDate.of(2021, 12, 10)),
                new Person("Laila", "Khaled", "laila.khaled@hotmail.com", LocalDate.of(2020, 8, 5)),
                new Person("Hussein", "Fahmy", "hussein.fahmy@gmail.com", LocalDate.of(2024, 1, 3)),
                new Person("John", "Smith", "john.smith@gmail.com", LocalDate.of(2021, 7, 22)),
                new Person("Emily", "Johnson", "emily.johnson@yahoo.com", LocalDate.of(2023, 11, 11)),
                new Person("Michael", "Brown", "michael.brown@hotmail.com", LocalDate.of(2022, 2, 2)),
                new Person("Sophia", "Davis", "sophia.davis@gmail.com", LocalDate.of(2020, 6, 30)),
                new Person("David", "Miller", "david.miller@gmail.com", LocalDate.of(2024, 3, 14))
        );
        persons.forEach(PersonsList::setPeopleList);

        // --- Books ---
        List<Book> books = List.of(
                new Book("Clean Code", "Robert C. Martin", 3, 9780132350884L),
                new Book("Effective Java", "Joshua Bloch", 5, 9780134685991L),
                new Book("Design Patterns", "Erich Gamma", 2, 9780201633610L),
                new Book("Refactoring", "Martin Fowler", 4, 9780201485677L),
                new Book("Introduction to Algorithms", "Thomas H. Cormen", 6, 9780262033848L),
                new Book("Java Concurrency in Practice", "Brian Goetz", 3, 9780321349606L),
                new Book("Head First Design Patterns", "Eric Freeman", 5, 9780596007126L),
                new Book("The Pragmatic Programmer", "Andrew Hunt", 4, 9780201616224L),
                new Book("Algorithms", "Robert Sedgewick", 2, 9780321573513L),
                new Book("Domain-Driven Design", "Eric Evans", 1, 9780321125217L)
        );
        books.forEach(BooksList::setBooksList);

        // --- Borrowed Books ---
        List<BorrowedBook> borrowedBooks = List.of(
                new BorrowedBook(persons.get(0), books.get(1), LocalDate.of(2024, 9, 9)),
                new BorrowedBook(persons.get(1), books.get(4), LocalDate.of(2024, 8, 1)),
                new BorrowedBook(persons.get(2), books.get(0), LocalDate.of(2024, 7, 20)),
                new BorrowedBook(persons.get(3), books.get(6), LocalDate.of(2024, 6, 15)),
                new BorrowedBook(persons.get(4), books.get(8), LocalDate.of(2024, 5, 10)),
                new BorrowedBook(persons.get(5), books.get(2), LocalDate.of(2024, 4, 5)),
                new BorrowedBook(persons.get(6), books.get(5), LocalDate.of(2024, 3, 25)),
                new BorrowedBook(persons.get(7), books.get(9), LocalDate.of(2024, 2, 18)),
                new BorrowedBook(persons.get(8), books.get(7), LocalDate.of(2024, 1, 12)),
                new BorrowedBook(persons.get(9), books.get(3), LocalDate.of(2023, 12, 30))
        );
        borrowedBooks.forEach(BorrowedBooksList::addBorrowedBook);
    }
}
