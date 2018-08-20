package org.emp;

public class Employee {
	public void empId() {
	System.out.println("1027889");
}
	public void empName() {
	System.out.println("Vignesh");
}
	public void empDob() {
	System.out.println("10Sep");
}
	public void empPhone() {
	System.out.println("989433");
}
	public void empEmail() {
		System.out.println("vigsan@gmail.com");
	}
	public void empAddress( ) { 
		System.out.println("12 Gandhinagar, chennai");
	}
public static void main(String[] args) {
	Employee infoDetails = new Employee();
	infoDetails.empId();
	infoDetails.empName();
	infoDetails.empDob();
	infoDetails.empPhone();
	infoDetails.empEmail();
	infoDetails.empAddress();
			
}
	
}
