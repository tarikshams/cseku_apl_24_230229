package model;

/**
 * Class representing a course.
 */
public class Course {
    private String courseName;
    private String courseCode;

    /**
     * Constructor for the Course class.
     * @param courseName The name of the course.
     * @param courseCode The unique code for the course.
     */
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    /**
     * Gets the name of the course.
     * @return The course name.
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets the name of the course.
     * @param courseName The name of the course to set.
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Gets the unique course code.
     * @return The course code.
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Sets the unique course code.
     * @param courseCode The course code to set.
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
