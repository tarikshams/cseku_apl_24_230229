package core;

/**
 * Represents the enrollment of a student in a course.
 * This class follows the Single Responsibility Principle (SRP).
 */
public class Enrollment {
    private String enrollmentId;
    private String studentId;
    private String courseId;

    /**
     * Constructs a new Enrollment with the specified enrollment ID, student ID, and course ID.
     *
     * @param enrollmentId the unique identifier for the enrollment
     * @param studentId    the unique identifier for the student
     * @param courseId     the unique identifier for the course
     */
    public Enrollment(String enrollmentId, String studentId, String courseId) {
        this.enrollmentId = enrollmentId;
        this.studentId = studentId;
        this.courseId = courseId;
    }

    /**
     * Gets the enrollment ID.
     *
     * @return the enrollment ID
     */
    public String getEnrollmentId() {
        return enrollmentId;
    }

    /**
     * Sets the enrollment ID.
     *
     * @param enrollmentId the new enrollment ID
     */
    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    /**
     * Gets the student ID associated with this enrollment.
     *
     * @return the student ID
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * Sets the student ID associated with this enrollment.
     *
     * @param studentId the new student ID
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * Gets the course ID associated with this enrollment.
     *
     * @return the course ID
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * Sets the course ID associated with this enrollment.
     *
     * @param courseId the new course ID
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
