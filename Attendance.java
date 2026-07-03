package Employyepayroll;

public class Attendance {
	
	private  int[] days;
	
	public Attendance() {
		days = new int[5];
		days[0] = 1;
		days[1] = 1;
		days[2] = 0;
		days[3] = 1;
		days[4] = 1;
	}
	public int getPresentDays() {
		int count =0;
		for(int i=0; i<days.length; i++) {
			if(days[i] == 1) {
				count++;
			}
		}
		return count;
	}
	public void showAttendance() {
		System.out.println("Attendance :");
	for(int day:days) {
		System.out.println(day+" ");
	}
	System.out.println(" ");
	}

}
