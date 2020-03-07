package com.bridgelabzs.fellowship.basicprograms;

import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class Sstring {
	public static void main(String[] args) {
		// String Builder
		String str = "";
		System.out.println("enter the string : ");
		str = InputUtility.stringVal();

		Utility.printstring(str);
	}

}