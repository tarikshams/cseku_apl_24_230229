package main;

import model.*;
import controller.*;
import view.*;

public class Main {

    public static void main(String[] args) {
        // Create course objects
        Course course1 = new Course("Advanced Programming Laboratory", "0714 02 CSE 2100");
        Course course2 = new Course("Data Structures", "0714 02 CSE 2101");

        // Create student objects
        Student student1 = new UndergraduateStudent("Ibnul Abrar Shahriar Seam", "230201");
        Student student2 = new GraduateStudent("Tarique Shams", "230229");

        // Create enrollment objects
        Enrollment enrollment1 = new Enrollment(student1, course1);
        Enrollment enrollment2 = new Enrollment(student2, course2);

        // Add enrollments to students
        student1.addEnrollment(enrollment1);
        student2.addEnrollment(enrollment2);

        // Create payment objects
        Payment payment1 = new Payment(student1, 500.0);
        Payment payment2 = new Payment(student2, 800.0);

        // Create notification objects
        EmailNotification emailNotification1 = new EmailNotification("You have successfully enrolled in Advanced Programming Laboratory", "230201@ku.ac.bd");
        SMSNotification smsNotification2 = new SMSNotification("Your payment of 800.0 has been processed.", "01975230229");

        // Create view objects
        CourseView courseView = new CourseView();
        EnrollmentView enrollmentView = new EnrollmentView();
        PaymentView paymentView = new PaymentView();
        NotificationView notificationView = new NotificationView();
        StudentView studentView = new StudentView();

        // Create controller objects
        CourseController courseController = new CourseController(course1, courseView);
        EnrollmentController enrollmentController = new EnrollmentController(enrollment2, enrollmentView);
        PaymentController paymentController = new PaymentController(payment1, paymentView);
        NotificationController notificationController1 = new NotificationController(emailNotification1, notificationView);
        NotificationController notificationController2 = new NotificationController(smsNotification2, notificationView);
        StudentController studentController1 = new StudentController(student1, studentView);
        StudentController studentController2 = new StudentController(student2, studentView);

        // Display student details
        studentController1.updateView();
        studentController2.updateView();

        // Display course details
        courseController.updateView();

        // Display enrollment details
        enrollmentController.updateView();

        // Process payments
        paymentController.updateView();
        paymentController.setPaymentAmount(600.0);  // Updating the payment amount
        paymentController.processPayment();

        // Display notifications
        notificationController1.updateView();
        notificationController2.updateView();
    }
}
