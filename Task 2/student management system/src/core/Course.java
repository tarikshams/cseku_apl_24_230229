package core;

/**
 * Represents a course in the system.
 * This class follows the Single Responsibility Principle (SRP).
 */
public class Course {
    private String courseId;
    private String title;
    private String description;

    /**
     * Constructs a new Course with the specified course ID, title, and description.
     *
     * @param courseId     the unique identifier for the course
     * @param title        the title of the course
     * @param description  the description of the course
     */
    public Course(String courseId, String title, String description) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
    }

    /**
     * Gets the course ID.
     *
     * @return the course ID
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * Sets the course ID.
     *
     * @param courseId  the new course ID
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    /**
     * Gets the title of the course.
     *
     * @return the title of the course
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the course.
     *
     * @param title  the new title of the course
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the description of the course.
     *
     * @return the description of the course
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the course.
     *
     * @param description  the new description of the course
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
