package core;

/**
 * Represents a graduate student.
 * Inherits from {@link Student} and follows the Liskov Substitution Principle (LSP).
 */
public class GraduateStudent extends Student {

    /**
     * Constructs a new GraduateStudent with the specified student ID, name, and email.
     *
     * @param studentId the unique identifier for the student
     * @param name      the name of the student
     * @param email     the email address of the student
     */
    public GraduateStudent(String studentId, String name, String email) {
        super(studentId, name, email);
    }

    // Additional graduate-specific methods can be added here
}
