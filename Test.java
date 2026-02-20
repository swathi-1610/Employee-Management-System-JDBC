package com.project;
import java.util.Scanner;
public class Test {
 public static void main(String[] args) {
	EmployeeDAO dao = new EmployeeDAO();
	Scanner obj = new Scanner(System.in);
	int choice;
	
	while(true) {
		System.out.println("*****************************************");
		System.out.println("*****************************************");
		System.out.println("********Employee Management System*******");
		System.out.println("********1.Add Employee            *******");
		System.out.println("********2.Remove Employee         *******");
		System.out.println("********3.Update Name             *******");
		System.out.println("********4.Update Department       *******");
		System.out.println("********5.Update Salary           *******");
		System.out.println("********6.Search Employee         *******");
		System.out.println("********7.Exit                    *******");
		System.out.println("*****************************************");
		System.out.println("*****************************************");
		
		choice = obj.nextInt();
		
		switch(choice) {
		   case 1:
			   System.out.println("Enter Id:");
			   int id=obj.nextInt();
				
			   System.out.println("Enter Name:");
			   String name=obj.next();
				
			   System.out.println("Enter Department:");
			   String department=obj.next();
				
			   System.out.println("Enter Salary:");
			   double salary=obj.nextDouble();
			   
			   Employee employee = new Employee(id, name, department, salary);
			   
    		   dao.addEmployee(employee);
			   
			   break;
		   case 2:
			   System.out.println("Enter Id:");
			   id=obj.nextInt();	
			   
               dao.removeEmployee(id);
			   
			   break;
		   case 3:
			   System.out.println("Enter Id:");
			   id=obj.nextInt();
				
			   System.out.println("Enter Name:");
			   name=obj.next();
			   
			   dao.upadateName(name, id);
			   
			   break;
			   
		   case 4:
			   System.out.println("Enter Id:");
			   id=obj.nextInt();
				
			   System.out.println("Enter Department:");
			   department=obj.next();
			   
			   dao.upadateDepartment(department, id);
			   
			   break;
			 
		   case 5:
			   System.out.println("Enter Id:");
			   id=obj.nextInt();
				
			   System.out.println("Enter Salary:");
			   salary = obj.nextDouble();
			   
			   dao.upadateSalary(salary, id);
			   
			   break;	   
			 	 
		   case 6 :
			   
			   System.out.println("Enter Id:");
			   id=obj.nextInt();
			   
			   dao.searchEmployee(id);
               
			   break;
				
		   case 7:
			   return;
		}
	}
}
}
