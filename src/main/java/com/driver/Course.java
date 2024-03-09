package com.driver;

public class Course {
	private String courseId;
    private String courseName;
    private int maxCapacity;
    private int enrolledStudents;

    public Course(String courseId, String courseName, int maxCapacity) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = 0;
    }

    public String getCourseId() {
    	// your code goes here
        return courseId;
    }

    public String getCourseName() {
    	// your code goes here
        return courseName;
    }

    public int getMaxCapacity() {
    	// your code goes here
        return maxCapacity;
    }

    public int getEnrolledStudents() {
    	// your code goes here
        return enrolledStudents;
    }

    public void enrollStudent() throws CourseAlreadyFullException {
       // your code goes here
    }

    public void dropStudent() {
       // your code goes here
    }
}
