package Model;


import java.time.LocalDate;

public class Librarian extends Person {

    //constructor
    public Librarian(String pName, String pSurname, String pEmail, LocalDate pDateOfRegistration) {
        super(pName, pSurname, pEmail, pDateOfRegistration);
    }

    public Librarian() {
        setName("Abraham");
        setSurname("Adwan");
        setEmail("Ahmad@gmail.com");
        setDateOfRegistration(LocalDate.of(2019, 10, 5));
    }


    @Override
    public String toString() {

        return String.format(
                "Librarian Details:\n" +
                        "  Name      : %s %s\n" +
                        "  Email     : %s\n" +
                        "  Registered: %s",
                getName(), getSurname(), getEmail(), getDateOfRegistration()
        );
    }
}
