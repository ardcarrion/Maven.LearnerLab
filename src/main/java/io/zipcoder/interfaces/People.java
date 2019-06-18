package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable {

    private ArrayList<Person> personList;

    public People() {
        personList = new ArrayList<Person>();
    }
    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person p: personList) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public Boolean contains(Person person) {
        return personList.contains(person);
    }

    public void remove(Person person) {
        personList.remove(person);

    }

    public void removeAll() {
        personList.removeAll(personList);
    }

    public Integer count() {
        return personList.size();
    }

    public Person[] toArray() {
        Person[] people = new Person[personList.size()];
        return personList.toArray(people);
    }

    public Iterator iterator() {
        return personList.iterator();
    }
}
