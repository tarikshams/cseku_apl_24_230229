package view;

import model.Enrollment;

/**
 * View class for displaying enrollment details.
 * Used by the controller to output the result of an enrollment action.
 */
public class EnrollmentView {

    /**
     * Displays a message confirming enrollment in a course.
     * This message includes the student's name and the course they have enrolled in.
     *
     * @param enrollment The enrollment object containing student and course information.
     */
    public void displayEnrollmentDetails(Enrollment enrollment) {
        // Display a confirmation message that includes the student's name and the course name
        System.out.println(enrollment.getStudent().getName() + " has been successfully enrolled in "
                + enrollment.getCourse().getCourseName() + " (" + enrollment.getCourse().getCourseCode() + ")");
    }
}
