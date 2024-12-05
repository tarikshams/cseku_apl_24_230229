package model;

/**
 * Class representing an enrollment, linking a student to a course.
 */
public class Enrollment {
    private Student student;
    private Course course;

    /**
     * Constructor for the Enrollment class.
     * @param student The student enrolled in the course.
     * @param course The course the student is enrolled in.
     */
    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    /**
     * Gets the student enrolled in the course.
     * @return The student.
     */
    public Student getStudent() {
        return student;
    }

    /**
     * Sets the student enrolled in the course.
     * @param student The student to set.
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * Gets the course the student is enrolled in.
     * @return The course.
     */
    public Course getCourse() {
        return course;
    }

    /**
     * Sets the course the student is enrolled in.
     * @param course The course to set.
     */
    public void setCourse(Course course) {
        this.course = course;
    }
}
