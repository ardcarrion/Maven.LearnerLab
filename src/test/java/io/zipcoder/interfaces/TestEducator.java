package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestEducator {
    @Test
    public void testImplementation() {
        assertTrue(Educator.DOLIO instanceof Teacher);
    }

    @Test
    public void teach() {
        Student student = new Student(null, null);
        double hoursStudied = 5.0;
        Educator.DOLIO.teach(student, hoursStudied);
        double actual = student.getTotalStudyTime();
        assertEquals(hoursStudied, actual, 0.01);
    }

    @Test
    public void lecture() {
        Student first = new Student(Long.MIN_VALUE, "Foo");
        Student second = new Student(Long.MAX_VALUE, "Bar");
        Student[] students = {first, second};
        Educator.DOLIO.lecture(students,  10.0);
        Double expected = 5.0;
        Double actualFirstHoursStudied = first.getTotalStudyTime();
        Double actualSecondHoursStudied = second.getTotalStudyTime();
        assertEquals(expected, actualFirstHoursStudied);
        assertEquals(expected, actualSecondHoursStudied);

    }
    @Test
    public void timeWorkedTest() {
        Student first = new Student(Long.MIN_VALUE, "Foo");
        Student second = new Student(Long.MAX_VALUE, "Bar");
        Student[] students = {first, second};
        Educator.DOLIO.lecture(students,  10.0);
        Double expected = 10.0;
        Double actual = Educator.DOLIO.getTimeWorked();
        assertEquals(expected,actual);
    }
}