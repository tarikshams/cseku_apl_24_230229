package core;

/**
 * Abstract class representing a student in the system.
 * This class follows the Liskov Substitution Principle (LSP).
 */
public abstract class Student {
    private String studentId;
    private String name;
    private String email;

    /**
     * Constructs a new Student with the specified student ID, name, and email.
     *
     * @param studentId the unique identifier for the student
     * @param name      the name of the student
     * @param email     the email address of the student
     */
    public Student(String studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    /**
     * Gets the student ID.
     *
     * @return the student ID
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * Sets the student ID.
     *
     * @param studentId the new student ID
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * Gets the name of the student.
     *
     * @return the student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     *
     * @param name the new name of the student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the email address of the student.
     *
     * @return the student's email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the student.
     *
     * @param email the new email address of the student
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
