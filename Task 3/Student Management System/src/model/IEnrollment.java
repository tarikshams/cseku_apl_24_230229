package model;

/**
 * Interface defining the behavior for enrolling a student in a course.
 * Implementing classes must define how to handle course enrollment.
 */
public interface IEnrollment {

    /**
     * Enrolls a student in a given course.
     *
     * @param course The course to enroll the student in.
     */
    void enrollInCourse(Course course);
}
