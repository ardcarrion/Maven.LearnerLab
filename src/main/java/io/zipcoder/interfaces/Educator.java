package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    WILHEM(new Instructor(100L, "Wilhem")),
    FROILAN(new Instructor(200L, "Froilan")),
    DOLIO (new Instructor(300L, "Dolio")),
    KRIS(new Instructor(400L, "Kris")),
    MELANIE(new Instructor(500L, "Melanie"));

    private final Instructor instructor;



    private double timeWorked;

    Educator(Instructor instructor) {
        this.instructor = instructor;
        this.timeWorked = 0;
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
    }
    public double getTimeWorked() {
        return timeWorked;
    }

    public void setTimeWorked(double timeWorked) {
        this.timeWorked = timeWorked;
    }

}
