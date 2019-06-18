package io.zipcoder.interfaces;

public class Person {

    final Long id;
    private String name;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void testMe() {
        System.out.printf("here i am %d", 10);
    }
}
