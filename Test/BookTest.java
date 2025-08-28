import Model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookTest {
    private Book book;
    @BeforeEach
    void setUp() {
        book = new Book(); // creating a new copy before every test
    }
    //---------- Valid cases tests -----------
    @Test
    void setTitle_whenValid_returnTitle(){
        book.setTitle("ValidTitle");
        assertEquals("ValidTitle", book.getTitle());
    }

    @Test
    void setAuthor_whenValid_returnAuthor(){
        book.setAuthor("Valid Author Name");
        assertEquals("Valid Author Name", book.getAuthor());
    }

    @Test
    void setQuantity_whenValid_returnQuantity(){
        book.setQuantity(2);
        assertEquals(2, book.getQuantity());
    }

    @Test
    void setIsbn_whenValid13Digits_returnIsbn(){
        book.setIsbn(1234567891230L); //13 digits
        assertEquals(1234567891230L, book.getIsbn());
    }

    @Test
    void setIsbn_whenValid10Digits_returnIsbn(){
        book.setIsbn(4567891230L); //10 digits
        assertEquals(4567891230L, book.getIsbn());
    }

    //----------- Invalid cases tests ------------

    @Test
    void setTitle_whenInvalid_throwsException(){
        assertThrows(IllegalArgumentException.class,()->{
            book.setTitle("@");
        });
    }

    @Test
    void setAuthor_whenInvalid_throwsException(){
        assertThrows(IllegalArgumentException.class,()->{
            book.setAuthor("123");
        });
    }

    @Test
    void setQuantity_whenInvalid_throwsException(){
        assertThrows(IllegalArgumentException.class,()->{
            book.setQuantity(-1);
        });
    }

    @Test
    void setIsbn_whenInvalid_throwsException(){
        assertThrows(IllegalArgumentException.class, ()->{
            book.setIsbn(12345); //only five digits
        });
    }

    // -------------- test constructors -------------
    @Test
    void setDefaultConstructor_whenValid(){
        assertEquals("my book", book.getTitle());
        assertEquals("me", book.getAuthor());
        assertEquals(1259694281600L, book.getIsbn());
        assertEquals(2, book.getQuantity());
    }
    @Test
    void setConstructor_whenValid(){
        Book book1 = new Book("Harry potter", "J K Rowling", 10, 5551479510130L);
        assertEquals("Harry potter", book1.getTitle());
        assertEquals("J K Rowling", book1.getAuthor());
        assertEquals(10, book1.getQuantity());
        assertEquals(5551479510130L, book1.getIsbn());
    }
    @Test
    void setConstructor_invalid(){
        assertThrows(IllegalArgumentException.class,()->{
            Book book2 = new Book("@Lolita", "70 years old guy", -200, 10025480140L);
        });

    }

}
