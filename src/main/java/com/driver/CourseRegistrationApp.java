package com.driver;

import java.util.Scanner;

public class CourseRegistrationApp {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CourseRegistrationSystem registrationSystem = new CourseRegistrationSystem();

        registrationSystem.addCourse(new Course("C001", "Java Programming", 3));
        registrationSystem.addCourse(new Course("C002", "Data Structures", 2));
        registrationSystem.addCourse(new Course("C003", "Database Management", 2));

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Enroll in a course");
            System.out.println("2. Drop a course");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Course ID to enroll: ");
                    String courseId = scanner.nextLine();
                    Course course = registrationSystem.findCourseById(courseId);
                    if (course == null) {
                        System.out.println("Course not found!");
                    } else {
                        try {
                            course.enrollStudent();
                            System.out.println("Enrolled in the course: " + course.getCourseName());
                        } catch (CourseAlreadyFullException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter Course ID to drop: ");
                    courseId = scanner.nextLine();
                    course = registrationSystem.findCourseById(courseId);
                    if (course == null) {
                        System.out.println("Course not found!");
                    } else {
                        course.dropStudent();
                        System.out.println("Dropped from the course: " + course.getCourseName());
                    }
                    break;
                case 3:
                    System.out.println("Exiting Course Registration System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
