package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(null, null);
        assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void TestInheritance() {
        Instructor instructor = new Instructor(null, null);
        assertTrue(instructor instanceof Person);
    }

    @Test
    public void teach() {
        Instructor instructor = new Instructor(null, null);
        Student student = new Student(null, null);
        double hoursStudied = 5.0;
        instructor.teach(student, hoursStudied);
        double actual = student.getTotalStudyTime();
        assertEquals(hoursStudied, actual, 0.01);
    }

    @Test
    public void lecture() {
        Instructor instructor = new Instructor(null, null);
        Student first = new Student(Long.MIN_VALUE, "Foo");
        Student second = new Student(Long.MAX_VALUE, "Bar");
        Student[] students = {first, second};
        instructor.lecture(students,  10.0);
        Double expected = 5.0;
        Double actualFirstHoursStudied = first.getTotalStudyTime();
        Double actualSecondHoursStudied = second.getTotalStudyTime();
        assertEquals(expected, actualFirstHoursStudied);
        assertEquals(expected, actualSecondHoursStudied);

    }
}