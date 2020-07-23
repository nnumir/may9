package studentApp;

import java.util.ArrayList;

public class StudentDatabaseApp {

	public static void main(String[] args) {
        ArrayList<Student> database = new ArrayList<Student>();
		System.out.println("Welcome to te student Database!");
		System.out.println("Please enter a new Student record: ");
		
		Student s = new Student();
		database.add(s);
		s.enroll();
		s.payTuition();
		System.out.println(s.getInfo());
		
			
		}
		
		
	}


