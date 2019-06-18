package io.zipcoder.interfaces;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class TestZipCodeWilmington {

    @Test
    public void hostLectureTest1() {
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getINSTANCE();
        Teacher teacher = instructors.findById(100L);
        zcw.hostLecture(teacher, 64.0);
        Student aashna = students.findById(10L);
        assertEquals(aashna.getTotalStudyTime(), 8.0, 0.01);
    }

    @Test
    public void hostLectureTest2() {
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        Students students = Students.getInstance();
        zcw.hostLecture(100L, 64.0);
        Student aashna = students.findById(10L);
        Double expected = 16.0;
        Double actual = aashna.getTotalStudyTime();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void hostLectureTest3() {
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        Students students = Students.getInstance();
        zcw.hostLecture(Educator.DOLIO, 64.0);
        Student aashna = students.findById(10L);
        Double expected = 24.0;
        Double actual = aashna.getTotalStudyTime();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void getStudyMap() {
        ZipCodeWilmington zcw = new ZipCodeWilmington();;
        HashMap map = zcw.getStudyMap();
        assertNotNull(map);
        Double actual = (Double)map.get(10L);
        Double expected = 24.0;
        assertEquals(expected, actual, 0.01);
    }
}