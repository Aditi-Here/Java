package Assignment1;
import java.util.ArrayList;
import java.util.Set;

public class Student 
{

	 private int id;
	 private String name;
	 private double grade;
	 private Set<String> courses;
	
	Student()
	{
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public double getGrade() 
	{
		return grade;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setGrade(double grade)
	{
		this.grade = grade;
	}
	
	public Set<String> getCourses() {
		return courses;
	}
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", courses=" + courses + "]";
	}
	
	
}

