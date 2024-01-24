package Assignment1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Assignment1.*;
public class Record {
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setManagerId(100);
		e1.setName("Samarth");
		
		Employee e2 = new Employee(2,"aditi",200);
		Employee e3 = new Employee(3,"Ram",300);
		
		Employee e4 = new Employee(4,"nnf",400);
		Employee e5 = new Employee(5,"edf",500);
		Employee e6 = new Employee(6,"dxv",600);
		
		Employee e7 = new Employee(7,"xyz",700);
		Employee e8 = new Employee(8,"abc",800);
		Employee e9 = new Employee(9,"pqr",900);
		
		Company c1 = new Company(1,"Google");
		Company c2 = new Company(2,"mazon");
		Company c3 = new Company(3,"Medtronics");
		
		List<Employee> l1 = new ArrayList<Employee>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
			
		Manager m1 = new Manager(1, "Gopal", "Google",l1);
		
		List<Employee> l2 = new ArrayList<Employee>();
		l2.add(e4);
		l2.add(e5);
		l2.add(e6);	
		Manager m2 = new Manager(2, "Arvind", "Amazon",l2);
		
		List<Employee> l3 = new ArrayList<Employee>();
		l3.add(e7);
		l3.add(e8);
		l3.add(e9);	
		Manager m3 = new Manager(3, "Max", "Medtronics",l3);
		
		HashMap<Company, Manager> map1 = new HashMap<>();
		map1.put(c1, m1);
		map1.put(c2, m2);
		map1.put(c3, m3);
		for (Map.Entry<Company, Manager> e : map1.entrySet()) 
		{
			  
            System.out.print(e.getKey().getId() + " : "
                               + e.getValue().getName()); 
            System.out.print(" ");
            
            for(Employee emp:e.getValue().getEmployeeList())
            {
            	System.out.print(emp.getName());
            	
            }
            System.out.println(" ");
		}
		
		
//		HashMap<Integer, String> map = new HashMap<>();
//		map.put(m1.getId(), m1.getName());
//		map.put(m2.getId(), m2.getName());
//		map.put(m3.getId(), m3.getName());
//		
//		for (Map.Entry<Integer, String> e : map.entrySet()) 
//		{
//			  
//            System.out.println(e.getKey() + " : "
//                               + e.getValue()); 
//		}
//		
		
	}

}
