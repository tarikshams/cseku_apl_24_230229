package view;

import model.Course;

/**
 * View class for displaying course details.
 * Used by the controller to output the result of a course-related action.
 */
public class CourseView {

    /**
     * Displays a message showing course details.
     * This message includes the course's name and code.
     *
     * @param course The course object containing the course's information.
     */
    public void displayCourseDetails(Course course) {
        // Display the course's name, code, and description
        System.out.println("Course: " + course.getCourseName() + ", Code: " + course.getCourseCode());
    }
}
