package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student student = new Student(null, null);
        assertTrue(student instanceof Learner);
    }
    @Test
    public void testInheritance() {
        Student student = new Student(null, null);
        assertTrue(student instanceof Person);
    }
    @Test
    public void testLearn() {
        Student student = new Student(Long.MIN_VALUE, "Foo");
        double numberOfHours = 5.0;
        student.learn(numberOfHours);
        double totalStudyTime = student.getTotalStudyTime();
        assertEquals(numberOfHours, totalStudyTime, 0.001);
    }
}