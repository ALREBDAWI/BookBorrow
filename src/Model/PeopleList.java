package Model;

import java.util.ArrayList;

public class PeopleList {
    private static ArrayList<Person> peopleList = new ArrayList<>();

    //getter
    public static ArrayList<Person> getPeopleList() {
        return peopleList;
    }
    // add people
    public static void setPeopleList(Person person) {
        peopleList.add(person);
    }
}
