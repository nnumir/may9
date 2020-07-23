package studentApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	/*
     * Scenario: Student Administration of your university needs an application to manage student enrollments and balance.
            Your application should have following features:
                - Ask the user how many new students will be added to the database
                - The user should be prompted to enter the name and year for each student
                - The student should have a 5-digit unique ID, with the first number being their grade level
                - A student can be enrolled in the following courses:
                        History 101
                        Mathematics 101
                        English 101
                        Chemistry 101
                        Computer Science 101
                - Each course costs $600 to enroll
                - The user should be able to view the student balance and do the tuition transactions
                - The user should be able to view the status of the student, i.e name, gradeYear, ID, courses enrolled, and balance
     
     */
	//intance variable then 
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private ArrayList<String> courses;
	private double tuitionBalance=0;
	private static final double priceOfEachCourse=600;
	private static int id=1000;
	 
	//Constructors 
	public Student() {
		System.out.println("Creating a new student record ...");
	    Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the student's first name : ");
		this.firstName = sc.nextLine();
		System.out.println("Please enter the student's last name : ");
		this.lastName = sc.nextLine();
		
		System.out.println("1 - FreshMan, 2 - Sophomore, 3 - Junior, 4 - Senior ");
		System.out.println("Please enter the student's grade year : ");
		
		this.gradeYear = sc.nextInt();
		this.studentId= String.valueOf(this.gradeYear) + this.id;
		id++;
		
		
	}
	public void enroll() {
		System.out.println("Enrolling the student...");
		Scanner sc=new Scanner(System.in);
		courses = new ArrayList<String>();
		System.out.println("Please enter the course to enroll(Q for quit): ");
		String course = sc.nextLine();
		while (! course.equalsIgnoreCase("q")) {
			courses.add(course);
			tuitionBalance+=priceOfEachCourse;
			System.out.println("Please enter the course to enroll(Q for quit): ");
			course=sc.nextLine();

		}
		showCourses();
		System.out.println("Tuition Balance is : " + this.tuitionBalance);
	}
	public void showCourses() {
		System.out.println("Courses Enrolled : ");
		for (String string : courses) {
			System.out.print(string + " ");
		}
	}
	public void payTuition() {
		System.out.println("Paying tuition...");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the payment amount: ");
		double amount=sc.nextDouble();
		tuitionBalance-=amount;
		System.out.println("Payment received: "+ amount);
		System.out.println("the new balance: "+ tuitionBalance);
		
	}
	public String getInfo () {
		return "FIRST NAME : " + this.firstName + "\n" +
		       "LAST NAME : " + this.lastName + "\n" +
		       "STUDENT ID : " + this.studentId + "\n" +
		       "BALANCE : " + this.tuitionBalance + "\n" +
		       "GRADE YEAR: " + this.gradeYear + "\n" +
		       "COURSES : " + this.courses + "\n" ;
	
	
	}
}
