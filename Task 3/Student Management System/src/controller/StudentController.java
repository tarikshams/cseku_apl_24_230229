package controller;

import model.Student;
import model.Enrollment;
import view.StudentView;

import java.util.List;

/**
 * Controller for managing student-related actions.
 * Acts as a mediator between the Student model and the Student view.
 */
public class StudentController {

    private Student model;  // The model representing the student
    private StudentView view;  // The view displaying student details

    /**
     * Constructor to initialize the controller with a Student model and Student view.
     *
     * @param model The student model to interact with.
     * @param view The view to display the student details.
     */
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Updates the view to display student details.
     */
    public void updateView() {
        view.displayStudentDetails(model);
    }

    /**
     * Gets the name of the student.
     *
     * @return The student's name.
     */
    public String getStudentName() {
        return model.getName();
    }

    /**
     * Sets the name of the student.
     *
     * @param name The name to set for the student.
     */
    public void setStudentName(String name) {
        model.setName(name);
    }

    /**
     * Gets the student ID.
     *
     * @return The student ID.
     */
    public String getStudentId() {
        return model.getStudentId();
    }

    /**
     * Sets the student ID.
     *
     * @param studentId The ID to set for the student.
     */
    public void setStudentId(String studentId) {
        model.setStudentId(studentId);
    }

    /**
     * Adds an enrollment for the student.
     *
     * @param enrollment The enrollment to add.
     */
    public void addEnrollment(Enrollment enrollment) {
        model.addEnrollment(enrollment);
    }

    /**
     * Retrieves the list of enrollments for the student.
     *
     * @return A list of enrollments.
     */
    public List<Enrollment> getEnrollments() {
        return model.getEnrollments();
    }

    /**
     * Displays student details using the model's implementation.
     */
    public void displayStudentDetails() {
        model.displayStudentDetails();
    }
}
