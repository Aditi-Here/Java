package Assignment1;

import java.util.List;

public class Manager {
	int id;
	String name;
	String CompanyName;
	List<Employee> employeeList;
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
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public Manager(int id, String name, String companyName, List<Employee> employeeList) {
		super();
		this.id = id;
		this.name = name;
		CompanyName = companyName;
		this.employeeList = employeeList;
	}
	
	
}
