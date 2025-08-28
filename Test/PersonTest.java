import Model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonTest {
    private Person person;
    @BeforeEach
    void setUp() {
        person = new Person();
    }

    // ---------- Valid cases tests -------------

    @Test
    void setName_whenValid_returnName(){
        person.setName("Adam");
        assertEquals("Adam", person.getName());
    }

    @Test
    void setSurname_whenValid_returnSurname(){
        person.setSurname("Al youssef");
        assertEquals("Al youssef", person.getSurname());
    }
    @Test
    void setEmail_whenValid_returnEmail(){
        person.setEmail("adamyoussef@gmail.com");
        assertEquals("adamyoussef@gmail.com", person.getEmail());
    }

    //----------------- Invalid cases test ------------

    @Test
    void setName_whenInvalid_returnName(){
        assertThrows(IllegalArgumentException.class, ()->{
            person.setName("Adam5");
        });
    }

    @Test
    void setSurname_whenInvalid_returnSurname(){
        assertThrows(IllegalArgumentException.class, ()->{
            person.setSurname("@Youssef");
        });
    }

    @Test
    void setEmail1_whenInvalid_returnEmail(){
        assertThrows(IllegalArgumentException.class, ()->{
            person.setEmail("adam youssef@gmail.com");
        });
    }

    @Test
    void setEmail2_whenInvalid_returnEmail(){
        assertThrows(IllegalArgumentException.class, ()->{
            person.setEmail("@adamyoussef@gmail.com");
        });
    }

    @Test
    void setEmail3_whenInvalid_returnEmail(){
        assertThrows(IllegalArgumentException.class, ()->{
            person.setEmail("adamyoussef.gmail.com");
        });
    }

}
