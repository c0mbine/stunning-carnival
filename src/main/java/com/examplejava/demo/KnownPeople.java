package com.examplejava.demo;

import java.util.Set;

public class KnownPeople {

    private static Set<Person> peoplArr;

    public static void addPerson(String name) {
        peoplArr.add(new Person(name));
    }

    public Boolean doesPersonExist(Person person) {
        return (peoplArr.contains(person) ? true : false);
    }

    public void removePerson(Person person) {
        if (this.doesPersonExist(person)) {

        }
    }

    @Override
    public String toString() {
        return peoplArr.toString();
    }

    public int size() {
        return peoplArr.size();
    }

}