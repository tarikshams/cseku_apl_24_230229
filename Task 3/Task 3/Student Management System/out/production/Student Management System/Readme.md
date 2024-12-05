# README - Student Management System

## Overview

The **Student Management System** is a Java-based application designed to manage student information, course enrollments, payments, and notifications. It uses the **Model-View-Controller (MVC)** design pattern to ensure modularity and maintainability. The system allows students to enroll in courses, process payments, and receive notifications about their enrollment and payment statuses.

## Project Structure

The project follows a structured approach to organizing code into models, views, and controllers. Here's the layout:

```
src/
│
├── main/
│   └── Main.java
│
├── model/
│   ├── Course.java
│   ├── IEnrollment.java
│   ├── Enrollment.java
│   ├── IPayment.java
│   ├── Payment.java
│   ├── INotification.java
│   ├── Notification.java
│   ├── EmailNotification.java
│   ├── SMSNotification.java
│   ├── Student.java
│   ├── UndergraduateStudent.java
│   └── GraduateStudent.java
│
├── view/
│   ├── CourseView.java
│   ├── EnrollmentView.java
│   ├── PaymentView.java
│   ├── NotificationView.java
│   └── StudentView.java
│
└── controller/
    ├── CourseController.java
    ├── EnrollmentController.java
    ├── PaymentController.java
    ├── NotificationController.java
    └── StudentController.java
```


### Folders and Files:
- **main/**: Contains the `Main.java` file, which serves as the entry point for the program.
- **model/**: Contains the data classes that represent entities like students, courses, enrollments, payments, and notifications.
- **view/**: Includes the view classes that display the data to the user.
- **controller/**: Houses the controller classes that manage the interaction between the model and the view.

## Component Description

### Model Classes

1. **Course**:
    - Represents a university course with attributes like course name and course code.
    - Used to manage course data for enrollment.

2. **Student**:
    - Represents a student with basic details like name and student ID.
    - Acts as the superclass for specific student types like `UndergraduateStudent` and `GraduateStudent`.

3. **UndergraduateStudent** (Subclass of `Student`):
    - Represents an undergraduate student.
    - Inherits properties and behaviors from the `Student` class, with the potential for additional features specific to undergraduates.

4. **GraduateStudent** (Subclass of `Student`):
    - Represents a graduate student.
    - Inherits properties and behaviors from the `Student` class, with potential for additional features specific to graduates.

5. **Enrollment**:
    - Represents a student's enrollment in a course.
    - Links the `Student` object and the `Course` object.

6. **Payment**:
    - Represents a payment made by a student for their course enrollments.
    - Contains details like the amount paid and the associated student.

7. **Notification**:
    - The parent class for all notifications. Represents a notification to a student.
    - Contains common properties like message content and recipient.

8. **EmailNotification** (Subclass of `Notification`):
    - Represents an email notification.
    - Contains additional properties specific to email notifications, such as email address.

9. **SMSNotification** (Subclass of `Notification`):
    - Represents an SMS notification.
    - Contains additional properties specific to SMS notifications, such as phone number.

### View Classes

1. **CourseView**:
    - Displays information about courses (e.g., course name, course code).
    - Used to present course details to the user.

2. **EnrollmentView**:
    - Displays information about enrollments, including student name and enrolled courses.
    - Used to present enrollment details to the user.

3. **PaymentView**:
    - Displays payment details, such as the amount and associated student.
    - Used to present payment information to the user.

4. **NotificationView**:
    - Displays notifications to the user (either via email or SMS).
    - Used to present the status of notifications to the user.

5. **StudentView**:
    - Displays student information, such as name and ID.
    - Used to present student details to the user.

### Controller Classes

1. **CourseController**:
    - Handles course-related actions (e.g., displaying course information).
    - Interacts with `Course` models and `CourseView`.

2. **EnrollmentController**:
    - Manages enrollment actions (e.g., enrolling a student in a course).
    - Interacts with `Enrollment` models and `EnrollmentView`.

3. **PaymentController**:
    - Manages payment processing (e.g., receiving a payment, updating payment records).
    - Interacts with `Payment` models and `PaymentView`.

4. **NotificationController**:
    - Manages the sending of notifications (e.g., email or SMS).
    - Interacts with `Notification` models and `NotificationView`.

5. **StudentController**:
    - Handles student-related actions (e.g., viewing student details, enrolling a student).
    - Interacts with `Student` models and `StudentView`.

## How It Maintains MVC

The **Student Management System** follows the **Model-View-Controller (MVC)** pattern as follows:

1. **Model**:
    - Contains the data and business logic. Models such as `Student`, `Course`, `Enrollment`, `Payment`, and `Notification` manage the core data of the system.
    - The model is responsible for encapsulating the state of the system and providing methods to interact with that data.

2. **View**:
    - Responsible for displaying the data to the user. View classes such as `CourseView`, `EnrollmentView`, and `PaymentView` provide user interfaces for showing student details, enrollments, and payment statuses.
    - The view is passive and only displays information; it does not contain business logic.

3. **Controller**:
    - Acts as an intermediary between the view and the model. The controller processes user inputs (such as enrolling in a course or making a payment), updates the model accordingly, and instructs the view to update.
    - Controllers like `StudentController`, `PaymentController`, and `EnrollmentController manage the application's workflow.

### Example of Interaction:

- When a student enrolls in a course, the `EnrollmentController` updates the `Enrollment` model and calls the `EnrollmentView` to display the updated enrollment information.
- When a student makes a payment, the `PaymentController` updates the `Payment` model and triggers the `PaymentView` to show the updated payment status. The `NotificationController` might then send a notification to the student.

## Conclusion

The **Student Management System** is a robust application built using the **MVC design pattern**, which helps in organizing the application in a modular and scalable way. The separation of concerns ensures that the system is maintainable, extendable, and easier to modify. By utilizing models, views, and controllers, the system efficiently manages student-related data, course enrollments, payments, and notifications.