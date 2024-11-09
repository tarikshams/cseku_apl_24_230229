package service.interfaces;

import core.Enrollment;

/**
 * Interface for enrollment services.
 * This interface follows the Interface Segregation Principle (ISP).
 */
public interface IEnrollmentService {

    /**
     * Enrolls a student in a course.
     *
     * @param enrollment the enrollment details
     */
    void enrollStudent(Enrollment enrollment);

    /**
     * Retrieves enrollment details by enrollment ID.
     *
     * @param enrollmentId the ID of the enrollment
     * @return the enrollment details
     */
    Enrollment getEnrollment(String enrollmentId);
}
