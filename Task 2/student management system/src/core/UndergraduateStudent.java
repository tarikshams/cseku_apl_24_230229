package core;

/**
 * Represents an undergraduate student.
 * Inherits from {@link Student} and follows the Liskov Substitution Principle (LSP).
 */
public class UndergraduateStudent extends Student {

    /**
     * Constructs a new UndergraduateStudent with the specified student ID, name, and email.
     *
     * @param studentId the unique identifier for the student
     * @param name      the name of the student
     * @param email     the email address of the student
     */
    public UndergraduateStudent(String studentId, String name, String email) {
        super(studentId, name, email);
    }

    // Additional undergraduate-specific methods can be added here
}
