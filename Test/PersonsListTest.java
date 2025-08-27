import Model.Book;
import Model.BooksList;
import Model.Person;
import Model.PersonsList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersonsListTest {
    private Person person;
    @BeforeEach
    public void setUp() {
        person = new Person("Adam", "Youssef", "adamypussef@gmail.com", LocalDate.now());
        PersonsList.getPeopleList().clear();
    }

    @Test
    public void addPerson_whenAdded_returnListWithPerson(){
        PersonsList.setPeopleList(person);
        assertEquals(person, PersonsList.getPeopleList().getFirst());
        assertEquals(1, PersonsList.getPeopleList().size());
    }

    @Test
    public void deletePerson_whenDeleted_returnListWithoutPerson(){
        PersonsList.setPeopleList(person);
        PersonsList.deletePerson(person);
        assertEquals(0, PersonsList.getPeopleList().size());
    }

    @Test
    public void deleteNotExitedPerson_whenPersonIsDeleted_listIsNotEmpty(){
        Person person1 = new Person("Sami", "Ward", "samiward@gmail.com", LocalDate.now());
        PersonsList.setPeopleList(person);
        PersonsList.deletePerson(person1);
        assertEquals(1,PersonsList.getPeopleList().size());
    }

    @Test
    public void setPerson_WhenPersonIsNull_returnListNoThrow(){
        Person person2 = null;
        assertThrows(IllegalArgumentException.class, ()-> {
            PersonsList.setPeopleList(person2);
        });
        assertEquals(0, PersonsList.getPeopleList().size());
    }

    @Test
    public void deletePerson_WhenPersonNotExist_listIsTheSame(){
        PersonsList.setPeopleList(person);
        Person person3 = new Person("Salma", "Hayek", "salmahayek@hotmail.com", LocalDate.now());
        PersonsList.deletePerson(person3);
        assertEquals(1,PersonsList.getPeopleList().size());
        assertTrue(PersonsList.getPeopleList().contains(person));
    }

    @Test //adding the same person twice
    public void addPerson_whenTwice_throwsException(){

        assertThrows(IllegalArgumentException.class, ()-> {
            PersonsList.setPeopleList(person);
            PersonsList.setPeopleList(person);
        });

    }
}


