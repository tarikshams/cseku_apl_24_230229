package controller;

import model.Course;
import view.CourseView;

/**
 * Controller for handling course-related actions.
 * It manages the interaction between the Course model and the Course view.
 */
public class CourseController {

    private Course model;  // The model representing the course
    private CourseView view;  // The view displaying the course details

    /**
     * Constructor to initialize the controller with a Course model and Course view.
     *
     * @param model The course model to interact with.
     * @param view The view to display the course details.
     */
    public CourseController(Course model, CourseView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Updates the view to display course details.
     */
    public void updateView() {
        view.displayCourseDetails(model);
    }

    /**
     * Sets the course's name.
     *
     * @param name The course name.
     */
    public void setCourseName(String name) {
        model.setCourseName(name);
    }

    /**
     * Sets the course's code.
     *
     * @param courseCode The course code.
     */
    public void setCourseCode(String courseCode) {
        model.setCourseCode(courseCode);
    }
    /**
     *  Gets the course's code.
     *
     * @return The course code.
     */
    public String getCourseCode(){
        return model.getCourseCode();
    }
    /**
     *
     *  Gets the course's name.
     *
     *   @return The course name.
     */
    public String getNameCode(){
        return model.getCourseName();
    }

}
