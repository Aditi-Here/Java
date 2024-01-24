package Assignment1;
import Assignment1.*;
import java.util.*;

public class Employee {

	int id;
	String name;
	int managerId;
	
	Employee()
	{
		
	}
	public Employee(int id, String name, int managerId) {
		super();
		this.id = id;
		this.name = name;
		this.managerId = managerId;
	}


	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", managerId=" + managerId + "]";
	}



	
}
