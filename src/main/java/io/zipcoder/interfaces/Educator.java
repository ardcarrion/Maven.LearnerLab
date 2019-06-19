package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    WILHEM((new Instructor(100L, "Wilhem")), 0.0),
    FROILAN((new Instructor(200L, "Froilan")), 0.0),
    DOLIO ((new Instructor(300L, "Dolio")), 0.0),
    KRIS((new Instructor(400L, "Kris")), 0.0),
    MELANIE((new Instructor(500L, "Melanie")), 0.0);

    private final Instructor instructor;
    private double timeWorked;

    Educator(Instructor instructor, double timeWorked) {
        this.instructor = instructor;
        this.timeWorked = timeWorked;
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        timeWorked += numberOfHours;
        instructor.lecture(learners, numberOfHours);
    }
    public double getTimeWorked() {
        return timeWorked;
    }

}
