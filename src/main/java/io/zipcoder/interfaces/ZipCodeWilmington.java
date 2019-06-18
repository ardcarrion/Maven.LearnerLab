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
        Student[] learners = getStudentArray();
        teacher.lecture(learners, numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours) {
        Student[] learners = getStudentArray();
        Teacher teacher = (Teacher)instructors.findById(id);
        teacher.lecture(learners, numberOfHours);
    }

    public HashMap getStudyMap() {
        Student[] studentArray = getStudentArray();
        HashMap <Long, Double> map = new HashMap<Long, Double>();
        for (Student student : studentArray) map.put(student.getId(), student.getTotalStudyTime());
        return map;
    }
    private Student[] getStudentArray() {
        Person[] people = students.toArray();
        Student[] learners = new Student[people.length];
        int idx = 0;
        for (Person p : people) {
            learners[idx] = (Student)p;
            idx++;
        }
        return learners;
    }




}
