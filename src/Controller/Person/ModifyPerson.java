package Controller.Person;

import Model.PersonsList;
import Model.Person;

import java.util.Scanner;

public class ModifyPerson {
    public static Person modifyPerson(){

        // get details from user and store it in vars
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter FirstName");
        String firstName = sc.nextLine();
        System.out.println(" Enter LastName");
        String lastName = sc.nextLine();

        // var to store selected member
        Person personToModify = null;

        // search in list for the member using name and last name
        for (Person p : PersonsList.getPeopleList()) {
            if(p.getName().equalsIgnoreCase(firstName) && p.getSurname().equalsIgnoreCase(lastName)){
                personToModify = p;
            }
        }

        // if it is found, modify
        if(personToModify != null){

            //get modified details from user
            System.out.println(" Enter new name");
            String newName = sc.nextLine();
            System.out.println(" Enter new surname");
            String newSurname = sc.nextLine();

            // update
            personToModify.setName(newName);
            personToModify.setSurname(newSurname);
            System.out.println(" Member details have been modified successfully: " + personToModify);

        }else {
            throw  new IllegalArgumentException(" Invalid name or surname try again");
        }

            // return the modified object
            return personToModify;
    };
}
