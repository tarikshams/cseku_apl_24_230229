package model;

import java.util.ArrayList;

/**
 * Abstract class representing a student.
 * This class is extended by both GraduateStudent and UndergraduateStudent.
 */
public abstract class Student {
    private String name;
    private String studentId;
    private ArrayList<Enrollment> enrollments;  // List of enrollments, representing courses the student is enrolled in

    /**
     * Constructor for the Student class.
     * @param name The name of the student.
     * @param studentId The unique ID of the student.
     */
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrollments = new ArrayList<>();
    }

    /**
     * Adds an enrollment for the student.
     * @param enrollment The enrollment to be added.
     */
    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    /**
     * Gets the name of the student.
     * @return The student's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     * @param name The student's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the unique student ID.
     * @return The student ID.
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * Sets the student ID.
     * @param studentId The student ID.
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * Gets the list of enrollments for the student.
     * @return A list of enrollments.
     */
    public ArrayList<Enrollment> getEnrollments() {
        return enrollments;
    }

    /**
     * Abstract method to display student details.
     */
    public abstract void displayStudentDetails();
}
