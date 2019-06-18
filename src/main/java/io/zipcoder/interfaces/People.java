package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class People<E extends Person> implements Iterable {

    public ArrayList<E> getPersonList() {
        return personList;
    }

    private ArrayList<E> personList;

    public People() {
        personList = new ArrayList<E>();
    }
    public void add(E e) {
        personList.add(e);
    }

    public E findById(long id) {
        for (E e: personList) {
            if (e.getId().equals(id)) return e;
        }
        return null;
    }

    public Boolean contains(E e) {
        return personList.contains(e);
    }

    public void remove(E e) {
        personList.remove(e);

    }
    public void remove(long id) {
        E e = findById(id);
        personList.remove(e);
    }

    public void removeAll() {
        personList.removeAll(personList);
    }

    public Integer count() {
        return personList.size();
    }

    abstract E[] toArray();

    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
