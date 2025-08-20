package Model;

import java.time.LocalDate;

public class Person {

    private String name;
    private String surname;
    private String email;
    private LocalDate dateOfRegistration;

    //constructor

    public Person(String pName, String pSurname, String pEmail, LocalDate pDateOfRegistration) {
        setName(pName);
        setSurname(pSurname);
        setEmail(pEmail);
        setDateOfRegistration(LocalDate.now());
    }

    public Person(){
        setName(" ");
        setSurname(" ");
        setEmail(" ");
        setDateOfRegistration(LocalDate.now());
    }

    //getter and setter
    public String getName() {
        return this.name;
    }

    public void setName(String pName){
        this.name = pName;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String pSurname){
        this.surname = pSurname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String pEmail){
        this.email = pEmail;
    }

    public LocalDate getDateOfRegistration() {
        return this.dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate pDateOfRegistration){
        this.dateOfRegistration = pDateOfRegistration;
    }

    @Override
    public String toString() {

        return String.format(
                "Person Details:\n" +
                        "  Name      : %s %s\n" +
                        "  Email     : %s\n" +
                        "  Registered: %s",
                name, surname, email, dateOfRegistration
        );
    }

}
