package Employyepayroll;

import java.nio.channels.Pipe.SourceChannel;

public class Employee {
	static String companyName;
	
	private int employeeid;
	private String name;
	private double basesalary;
	private boolean active;
	private char grade;
	
	//has -a relation ship
	private Attendance attendance;
	
	//static initialization block
	static {
		companyName = "Technova";
	System.out.println("static block : company initialized");
	}

	//instance initialization block
	{
		active = true;
		System.out.println("instance block: employee active by default");
	}
	public Employee(int employeeid, String name,double basesalary, char grade){
		this.employeeid = employeeid;
		this.name=	name;
		this.basesalary=basesalary;
		this.active=active;
		this.grade=grade;
		this.attendance = new Attendance();
		
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public String getName() {
		return name;
	}
	public double getBasesalary() {
		return basesalary;
	}
	public boolean isActive() {
		return active;
	}
	public char getGrade() {
		return grade;
	}
	public Attendance getAttendance() {
		return attendance;
	}
	public void showEmployeeDetails() {
		System.out.println("company :"+companyName);
		System.out.println("name :"+name);
	}
	
}
