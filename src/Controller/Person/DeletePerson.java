package Controller.Person;

import Model.PersonsList;
import Model.Person;

import java.util.Scanner;

public class DeletePerson {
    public static void removePerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firstName of the person you want to delete");
        String firstName = sc.nextLine();
        System.out.println("Enter the lastName of the person you want to delete");
        String lastName = sc.nextLine();
        Person personToDelete = null;
        for (Person p : PersonsList.getPeopleList()){
            if(p.getName().equals(firstName) && p.getSurname().equals(lastName)){
                personToDelete = p;
            }
        }
        if (personToDelete != null){
            PersonsList.deletePerson(personToDelete);
            System.out.println(personToDelete + " has been deleted successfully");
        }else {
            System.out.println("No member of this name");
        }
    }
}
