package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestInstructors {
    @Test
    public void test() {
        Instructors instructors = Instructors.getINSTANCE();
        assertNotNull(instructors.findById(100L));
        assertNotNull(instructors.findById(200L));
        assertNotNull(instructors.findById(300L));
        assertNotNull(instructors.findById(400L));
        assertNotNull(instructors.findById(500L));
    }

}