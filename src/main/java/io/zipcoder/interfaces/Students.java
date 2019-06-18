package io.zipcoder.interfaces;

public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students() {
        super.add(new Student(10L, "Aashna" ));
        super.add(new Student(20L, "Sputnika"));
        super.add(new Student(30L, "Ajulu"));
        super.add(new Student(40L, "Joanna"));
        super.add(new Student(50L, "Prasanthi"));
        super.add(new Student(60L, "Angelica"));
        super.add(new Student(70L, "Donna"));
        super.add(new Student(80L, "Reese"));
    }

    public Student[] toArray() {
        Student[] students = new Student[super.getPersonList().size()];
        return super.getPersonList().toArray(students);
    }

    public static Students getInstance() {
        return INSTANCE;
    }

}
