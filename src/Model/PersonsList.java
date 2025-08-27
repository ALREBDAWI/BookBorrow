package Model;

import java.util.ArrayList;

public class PersonsList {
    private static ArrayList<Person> peopleList = new ArrayList<>();

    //getter
    public static ArrayList<Person> getPeopleList() {
        return peopleList;
    }
    // add people
    public static void setPeopleList(Person person) {
        if (person != null && !peopleList.contains(person)) {
            peopleList.add(person);
        }else  {
            throw new IllegalArgumentException("Person is null");
        }
    }

    //delete member from list
    public static void deletePerson(Person person) {
        peopleList.remove(person);
    }
}
