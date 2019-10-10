package com.examplejava.demo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class KnownPeople {

    private static Set<Person> peopleSet = new LinkedHashSet<>();

    public static void addPerson(String name) {
        peopleSet.add(new Person(name));
    }

    public static Boolean doesPersonExist(Person person) {
        return (peopleSet.contains(person) ? true : false);
    }

    public static void removePerson(String name) {
        // find person by name
    }

    public static void removePerson(Person person) {
        if (doesPersonExist(person)) {
            peopleSet.remove(person);
        }
    }

    public static int size() {
        return peopleSet.size();
    }

    /**
     * @return the peopleSet
     */
    public static Set<Person> getPeopleSet() {
        return peopleSet;
    }

    /**
     * Complicated so that I practice different List types in java
     * 
     * @return
     */
    public static List<String> printPeople() {
        List<String> outputList = new ArrayList<String>();

        for (Person per : peopleSet) {
            System.out.println(per.toString());
            outputList.add(per.toString());
        }
        // return String.join(",", outputList);
        return outputList;
    }

    @Override
    public String toString() {
        return peopleSet.toString();
    }

    

}