package Employyepayroll;

public class HRApplication {

	public static void main(String[] args) {
		
		System.out.println("== HR Payroll system stared ==");
		//local variable
		
		int empId = 1;
		String empName = "krishna";
		double salary  = 40000.0;
		
		char grade = 'A';
		
		//object creation(Heap)

		Employee employee = new Employee(empId, empName, salary,grade);
		
		//display employee details
		
		employee.showEmployeeDetails();
		// get Attendace
		Attendance attendance = employee.getAttendance();
		attendance.showAttendance();
		int presentDays = attendance.getPresentDays();
		
		//payroll calculation
		
		PayRollService payrollService= new PayRollService();
		double finalSalary  = payrollService.calculateSalary(employee.getBasesalary(), presentDays);
		System.out.println("presnt day: "+presentDays);
		System.out.println("final salary : "+finalSalary);	
	}
}
