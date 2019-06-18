package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudents {


    @Test
    public void test() {
        Students students  = Students.getInstance();
        assertNotNull(students.findById(10L));
        assertNotNull(students.findById(20L));
        assertNotNull(students.findById(30L));
        assertNotNull(students.findById(40L));
        assertNotNull(students.findById(50L));
        assertNotNull(students.findById(60L));
        assertNotNull(students.findById(70L));
        assertNotNull(students.findById(80L));
    }
}