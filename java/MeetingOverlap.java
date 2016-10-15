package okta;

import java.util.Date;

public class MeetingOverlap {
	
	public static void validate(int s1, int s2, int e1, int e2){
		if (s1 < 0 || s2 < 0 || e1 < 0 || e2 < 0) {
			throw new RuntimeException("Cant be lesser than 0");
		}
		if (s1 > 24 || s2> 24 || e1 > 24 || e2 > 24) {
			throw new RuntimeException("can't be greater than 24");
		}
	}
	
	// Assuming we are dealing only with hours attribute
	public static void isConflicting(int s1, int e1, int s2, int e2) {
		validate(s1,e1,s2,e2);
		// s1 starts first
		if (s1 < s2) {
			if (e1 > s2)  {
				System.out.println("true");
				return;
			}
		}
		else {
			if (e2 > s1) { 
				System.out.println("true");
				return;
			}
		}
		System.out.println("false");
	}
	
	public static void isConflicting(Date s1, Date e1, Date s2, Date e2) {
		// s1 starts first lets say
		if (s1.getTime() < s2.getTime()) {
			if (e1.getTime() > s2.getTime()) {
				System.out.println("True");
				return;
			}
		}
		else {
			if (e2.getTime() < s1.getTime()) {
				System.out.println("True");
				return;
			}
		}
		System.out.println("False");
	}

	public static void main(String[] args) {
		isConflicting(2,5,3,6);
		isConflicting(6,9,10,16);
		isConflicting(9,10,0,12);
		Date s1 = new Date();
		s1.setHours(5);
		s1.setMinutes(30);
		
		Date e1 = new Date();
		e1.setHours(6);
		e1.setMinutes(30);
		
		Date s2 = new Date();
		s2.setHours(5);
		s2.setMinutes(45);
		
		Date e2 = new Date();
		e2.setHours(7);
		e2.setMinutes(45);
		isConflicting(s1, e1, s2, e2);
	}

}
