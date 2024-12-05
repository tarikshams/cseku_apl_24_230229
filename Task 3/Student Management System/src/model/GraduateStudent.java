package model;

/**
 * Class representing a graduate student.
 */
public class GraduateStudent extends Student {

    public GraduateStudent(String name, String studentId) {
        super(name, studentId);
    }

    /**
     * Displays the details of the graduate student.
     */
    @Override
    public void displayStudentDetails() {
        System.out.println("Graduate Student: " + getName() + ", ID: " + getStudentId());
        // Display courses the student is enrolled in
        for (Enrollment enrollment : getEnrollments()) {
            System.out.println("Enrolled in course: " + enrollment.getCourse().getCourseName());
        }
    }
}
