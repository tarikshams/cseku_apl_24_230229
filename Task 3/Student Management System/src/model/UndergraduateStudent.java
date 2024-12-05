package model;

/**
 * Class representing an undergraduate student.
 */
public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String name, String studentId) {
        super(name, studentId);
    }

    /**
     * Displays the details of the undergraduate student.
     */
    @Override
    public void displayStudentDetails() {
        System.out.println("Undergraduate Student: " + getName() + ", ID: " + getStudentId());
        // Display courses the student is enrolled in
        for (Enrollment enrollment : getEnrollments()) {
            System.out.println("Enrolled in course: " + enrollment.getCourse().getCourseName());
        }
    }
}
