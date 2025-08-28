package Controller.Person;

import Model.PersonsList;
import Model.Person;

import java.time.LocalDate;
import java.util.Scanner;

public class CreateNewPerson {
    public static Person createNewMember(){

        // get details from user and store it in vars
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter First Name: ");
        String name = sc.nextLine();
        System.out.println(" Enter Last Name: ");
        String surname = sc.nextLine();
        System.out.println(" Enter Email Address: ");
        String email = sc.nextLine();
        LocalDate dateOfRegistration = LocalDate.now();

        // create the new member
        Person person =  new Person(name, surname, email, dateOfRegistration);
        PersonsList.setPeopleList(person);
        System.out.println(person + " new member has been created successfully!");

        // return Person object
        return person;
    }

}
