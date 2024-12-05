package view;

import model.Student;

/**
 * View class for displaying student details.
 * Used by the controller to output the result of a student-related action.
 */
public class StudentView {

    /**
     * Displays a message showing student details.
     * This message includes the student's name and ID
     *
     * @param student The student object containing the student's information.
     */
    public void displayStudentDetails(Student student) {
        // Display the student's name and ID
        System.out.println("Student: " + student.getName() + ", ID: " + student.getStudentId());
    }
}
