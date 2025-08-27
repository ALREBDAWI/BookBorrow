package Controller.Person;

import Model.PersonsList;
import Model.Person;

import java.util.Scanner;

public class ModifyPerson {
    public static Person modifyPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter FirstName");
        String firstName = sc.nextLine();
        System.out.println("Enter LastName");
        String lastName = sc.nextLine();
        Person personToModify = null;
        for (Person p : PersonsList.getPeopleList()) {
            if(p.getName().equalsIgnoreCase(firstName) && p.getSurname().equalsIgnoreCase(lastName)){
                personToModify = p;
            }
        }

        if(personToModify != null){
            System.out.println("Enter new name");
            String newName = sc.nextLine();
            System.out.println("Enter new surname");
            String newSurname = sc.nextLine();
            personToModify.setName(newName);
            personToModify.setSurname(newSurname);
            System.out.println("Member data modified successfully: " + personToModify);

        }else {
            throw  new IllegalArgumentException("Invalid name or surname");
        }
            return personToModify;
    };
}
