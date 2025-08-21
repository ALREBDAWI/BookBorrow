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
        String regex = "^[A-Za-z][a-z]+$";
        if(pName.matches(regex)){
            this.name = pName;
        }else {
            throw new IllegalArgumentException("Invalid Name Format");
        }
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String pSurname){
        String regex = "^[A-Za-z][a-z]+$";
        if(pSurname.matches(regex)){
            this.surname = pSurname;
        }else {
            throw new IllegalArgumentException("Invalid Surname Format");
        }
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String pEmail){
        String regex = "^[A-Za-z0-9]+([._-]?[A-Za-z0-9]+)*@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        if(pEmail.matches(regex)){
            this.email = pEmail;
        }else  {
            throw new IllegalArgumentException("Invalid Email Format");
        }
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
                        "  Registered: %s\n",
                name, surname, email, dateOfRegistration+ "\n"
        );
    }

}
