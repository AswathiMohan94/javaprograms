package com.bridgelabzs.fellowship.basicprograms;

import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter the year : ");
		int year = InputUtility.intVal();

		if (Utility.isLeapYear(year)) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is Not leap year");
		}
	}
}
