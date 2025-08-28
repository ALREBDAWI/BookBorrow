import Model.Book;
import Model.BooksList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BooksListTest {

    private Book book1;
    @BeforeEach
    public void setUp() {
        book1 = new Book("myBook", "me", 10, 1234569875L);
        Model.BooksList.getBooksList().clear();
    }

    @Test
    public void setBooksList_whenBookAdded_bookAppearInList(){
        Model.BooksList.setBooksList(book1);
        assertEquals(1, Model.BooksList.getBooksList().size());
        assertEquals(book1,Model.BooksList.getBooksList().getFirst());
    }

    @Test
    public void deleteBook_whenBookIsDeleted_listIsEmpty(){
        Model.BooksList.setBooksList(book1);
        Model.BooksList.deleteBook(book1);
        assertEquals(0,Model.BooksList.getBooksList().size());
    }

    @Test
    public void deleteNotExitedBook_whenBookIsDeleted_listIsNotEmpty(){
        Book book2 = new Book("myPaper", "memo", 120, 1234569874L);
        Model.BooksList.setBooksList(book1);
        Model.BooksList.deleteBook(book2);
        assertEquals(1,Model.BooksList.getBooksList().size());
    }

    @Test
    public void setBook_WhenBookIsNull_ThrowsException(){
        Book book3 = null;
        assertThrows(IllegalArgumentException.class, ()-> {
            Model.BooksList.setBooksList(book3);
        });
        assertEquals(0, Model.BooksList.getBooksList().size());
    }

    @Test
    public void deleteBook_WhenBookNotExist_listIsTheSame(){
        BooksList.setBooksList(book1);
        Book book6 = new Book("anyBook", "author", 20, 5534569800L);
        Model.BooksList.deleteBook(book6);
        assertEquals(1,Model.BooksList.getBooksList().size());
        assertTrue(BooksList.getBooksList().contains(book1));
    }
}
