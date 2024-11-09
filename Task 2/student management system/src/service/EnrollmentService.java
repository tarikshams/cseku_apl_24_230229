package service;

import core.Enrollment;
import service.interfaces.IEnrollmentService;

/**
 * Implementation of the {@link IEnrollmentService} interface.
 * This class follows the Single Responsibility Principle (SRP).
 * It also follows the Dependency Inversion Principle (DIP) by depending on the interface.
 */
public class EnrollmentService implements IEnrollmentService {

    /**
     * Enrolls a student in a course.
     *
     * @param enrollment the enrollment details
     */
    @Override
    public void enrollStudent(Enrollment enrollment) {
        // Logic to enroll student in specified course
        System.out.println("Enrolling student " + enrollment.getStudentId() + " in course " + enrollment.getCourseId());
    }

    /**
     * Retrieves enrollment details by enrollment ID.
     *
     * @param enrollmentId the ID of the enrollment
     * @return the enrollment details, or null if not found
     */
    @Override
    public Enrollment getEnrollment(String enrollmentId) {
        // Logic to get enrollment
        return null; // Placeholder
    }
}
