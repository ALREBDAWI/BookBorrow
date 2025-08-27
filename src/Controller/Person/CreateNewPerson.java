package Controller.Person;

import Model.PersonsList;
import Model.Person;

import java.time.LocalDate;
import java.util.Scanner;

public class CreateNewPerson {
    public static Person createNewMember(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String surname = sc.nextLine();
        System.out.println("Enter Email Address: ");
        String email = sc.nextLine();
        LocalDate dateOfRegistration = LocalDate.now();
        Person person =  new Person(name, surname, email, dateOfRegistration);
        PersonsList.setPeopleList(person);
        System.out.println(person);
        return person;
    }

}
