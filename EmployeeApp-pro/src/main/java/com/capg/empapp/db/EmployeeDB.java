package com.capg.empapp.db;

import com.capg.empapp.dto.Employee;

public class EmployeeDB {
	// Employee cannot be resolved to a type
	public static Employee employees[]  = new Employee[100];
	
	public static int count = 0;
	
	static {
		
		employees[count++] = 	new Employee(101, "ramesh", 8, 7000);
		employees[count++] = 	new Employee(101, "suresh", 2, 7000);
		employees[count++] = 	new Employee(101, "rakesh", 1, 7000);
		employees[count++] = 	new Employee(101, "lokesh", 5, 7000);
		
		}
		
		
	public static boolean addEmployee(Employee e)
	{
		
		employees[count++] = e;
	
		return true;
	}
	
	public static int getCount()
	{
		return count;
	}

}
