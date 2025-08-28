package Controller.Person;

import Model.PersonsList;
import Model.Person;

import java.util.Scanner;

public class DeletePerson {
    public static void removePerson() {

        // get details from user and store it in vars
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the firstName of the person you want to delete");
        String firstName = sc.nextLine();
        System.out.println(" Enter the lastName of the person you want to delete");
        String lastName = sc.nextLine();

        // var to store selected member
        Person personToDelete = null;

        // search for member using name and last name
        for (Person p : PersonsList.getPeopleList()){
            if(p.getName().equals(firstName) && p.getSurname().equals(lastName)){
                personToDelete = p;
            }
        }

        // delete it if he is found in the list of members
        if (personToDelete != null){
            PersonsList.deletePerson(personToDelete);
            System.out.println(personToDelete + " has been deleted successfully");
        }else {
            System.out.println(" There is no member of this name, try again");
        }
    }
}
