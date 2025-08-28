import Model.Book;
import Model.BorrowedBook;
import Model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BorrowedBookTest {
    BorrowedBook borrowedbook;
    LocalDate date = LocalDate.now();

    @Test
    public void testConstructor_whenValidEntry(){
        Book book = new Book();
        Person person = new Person("Amir", "Ali", "amir.ali@gmail.com" ,LocalDate.now());
        BorrowedBook borrowedBook = new BorrowedBook(person, book, date);
        assertEquals("Amir", borrowedBook.getBorrower().getName());
        assertEquals("Ali", borrowedBook.getBorrower().getSurname());
        assertEquals(date, borrowedBook.getBorrowedBookDate());
        assertEquals(date.plusDays(7), borrowedBook.getReturnedBookDate());
    }
    @Test
    public void testDefaultConstructor_whenValidEntry(){
        BorrowedBook borrowedBook = new BorrowedBook();
        assertEquals("Sami", borrowedBook.getBorrower().getName());
        assertEquals("Adam", borrowedBook.getBorrower().getSurname());
        assertEquals(LocalDate.now(), borrowedBook.getBorrowedBookDate());
        assertEquals(date.plusDays(7), borrowedBook.getReturnedBookDate());
    }

}

