package io.zipcoder.interfaces;

import java.util.HashMap;

public class ZipCodeWilmington {

    private Students students;
    private Instructors instructors;

    public ZipCodeWilmington() {
        this.students = Students.getInstance();
        this.instructors = Instructors.getINSTANCE();
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        Student[] learners = students.toArray();
        teacher.lecture(learners, numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours) {
        Student[] learners = students.toArray();
        Teacher teacher = instructors.findById(id);
        teacher.lecture(learners, numberOfHours);
    }
    public void hostLecture(Educator educator, double numberOfHours) {
        Student[] learners = students.toArray();
        educator.lecture(learners, numberOfHours);
    }

    public HashMap getStudyMap() {
        Student[] studentArray = students.toArray();
        HashMap <Long, Double> map = new HashMap<Long, Double>();
        for (Student student : studentArray) map.put(student.getId(), student.getTotalStudyTime());
        return map;
    }





}
