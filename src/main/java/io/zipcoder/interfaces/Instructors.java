package io.zipcoder.interfaces;

public final class Instructors extends People {


    private final static Instructors INSTANCE = new Instructors();


    private Instructors() {
        super.add(new Instructor(100L, "Wilhem"));
        super.add(new Instructor(200L, "Froilan"));
        super.add(new Instructor(300L, "Dolio"));
        super.add(new Instructor(400L, "Kris"));
        super.add(new Instructor(500L, "Melanie"));
    }

    public static Instructors getINSTANCE() {
        return INSTANCE;
    }
}
