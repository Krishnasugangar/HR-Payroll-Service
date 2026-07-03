package Employyepayroll;

public class PayRollService {

	public double calculateSalary(double baseSalary, int presentDays) {
		double perDaySalary = baseSalary/30;
		double finalSalary = perDaySalary * presentDays;
		return finalSalary;
		
	}
}
