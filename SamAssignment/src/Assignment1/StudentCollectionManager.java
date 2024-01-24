package Assignment1;

import java.util.ArrayList;
import java.util.*;
import Assignment1.Student;

public class StudentCollectionManager {

	ArrayList<Student> studentList = new ArrayList<>();

	void addStudent(Student student) {
		studentList.add(student);
	}

	void removeStudentById(int id) {
		
		for (Student s : studentList) 
		{
			if(s.getId()==id)
				studentList.remove(s);
		}
	}

	void displayStudentCollection() {
		
		for (Student s : studentList) {
			System.out.println(s);
		}
	}

	void displayHighestGrade() {
		System.out.print("The highest Grade student is : ");
		
		double max = studentList.get(0).getGrade();	
		for(Student s : studentList)
		{
			
			if(max <= s.getGrade() )
			{ 
				max = s.getGrade();
			}
			
		}
		
		for(Student s: studentList)
		{
			if(s.getGrade()==max)
			{
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.setName("Aditi");	
		std1.setId(1);
		std1.setGrade(1.0);
		Set<String> courses_set1 = new HashSet<String>();
		courses_set1.add("Maths");
		courses_set1.add("Science");
		std1.setCourses(courses_set1);

		Student std2 = new Student();
		std2.setName("Sam");
		std2.setId(2);
		std2.setGrade(2.0);
		Set<String> courses_set2 = new HashSet<String>();
		courses_set2.add("CS");
		courses_set2.add("Electronics");
		std2.setCourses(courses_set2);

		Student std3 = new Student();
		std3.setName("Aaku");
		std3.setId(3);
		std3.setGrade(3.0);
		Set<String> courses_set3 = new HashSet<String>();
		courses_set3.add("History");
		courses_set3.add("Politics");

		std3.setCourses(courses_set3);

		StudentCollectionManager scm = new StudentCollectionManager();
		scm.addStudent(std1);
		scm.addStudent(std2);
		scm.addStudent(std3);

		System.out.println("Display student list");

		scm.displayStudentCollection();

		scm.removeStudentById(2);

		System.out.println("Display student list");
		scm.displayStudentCollection();
		scm.displayHighestGrade();
		
		Map<Integer, Set<String>> map = new HashMap<>();
		map.put(std1.getId(), std1.getCourses());
		map.put(std2.getId(), std2.getCourses());
		map.put(std3.getId(), std3.getCourses());
		
		for (Map.Entry<Integer, Set<String>> e : map.entrySet()) 
		{
			  
            System.out.println(e.getKey() + " : "
                               + e.getValue()); 
		}
		
		
	}
}