package controller;

import model.Course;
import model.Enrollment;
import model.Student;
import view.EnrollmentView;

/**
 * Controller for handling enrollment actions.
 * It manages the interaction between the Enrollment model and the Enrollment view.
 */
public class EnrollmentController {

    private Enrollment model;  // The model representing the enrollment
    private EnrollmentView view;  // The view displaying the enrollment details

    /**
     * Constructor to initialize the controller with an Enrollment model and Enrollment view.
     *
     * @param model The enrollment model to interact with.
     * @param view The view to display the enrollment details.
     */
    public EnrollmentController(Enrollment model, EnrollmentView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Updates the view to display the enrollment details.
     */
    public void updateView() {
        view.displayEnrollmentDetails(model);
    }

    /**
     * Enrolls a student in a course.
     *
     * @param student The student being enrolled.
     * @param course The course in which the student is enrolling.
     */
    public void enrollStudent(Student student, Course course) {
        model.setStudent(student);
        model.setCourse(course);
    }
    /**
     * Retrieves the student currently assigned to the enrollment.
     *
     * @return The student associated with the enrollment model.
     */
    public Student getStudent() {
      return model.getStudent();
    }

    /**
     * Retrieves the course currently assigned to the enrollment.
     *
     * @return The course associated with the enrollment model.
     */
    public Course getCourse(){
        return model.getCourse();
    }
    /**
     * Assigns a new student to the enrollment.
     *
     * @param student The student to assign.
     */
    public void setStudent(Student student)
    {
        model.setStudent(student);
    }
    /**
     * Assigns a new course to the enrollment.
     *
     * @param course The course to assign.
     */
    public void setCourse(Course course )
    {
        model.setCourse(course);
    }
}
