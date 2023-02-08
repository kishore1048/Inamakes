package org.emp;

public class Employee {
	
	public Employee() {
		System.out.println("Employee Adress: Chennai ");
	}
	public Employee(int Id) {
		System.out.println("Employee Id: 123456 ");
	}
	public Employee(int Age,String Name, long Number) {
		System.out.println("Employee Age: 25 ");
		System.out.println("Employee Name : Kishore" );
		System.out.println("Employee Number : 8678960199"  );
	}
	public static void main(String[] args) {
		Employee n = new Employee();
		Employee n1 = new Employee(123456);
		Employee n2 = new Employee(25,"Kishore",8678960199l);
	}
		
	
	
	
}

