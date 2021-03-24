package org.emp;

public class Employee {

	private void empId() {
	System.out.println("ID   : 656");
	
	}
	private void empName() {
		System.out.println("Name   : Karthick");

	}
	
	private void empdob() {
System.out.println("DOB  : 02 Feb 1995");

	}
	private void empPhone() {
System.out.println("Phone : 9595859589");

	}
	private void empMail() {
		System.out.println("Mail : karthich@mail.com");
		
	}
	private void empAddress() {
		System.out.println("Address  : dubai,kurukku Santhu,Vivekanda Street");

	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empdob();
		e.empPhone();
		e.empMail();
		e.empAddress();
	}
	
}
