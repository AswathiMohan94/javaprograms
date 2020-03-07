package com.bridgelabzs.fellowship.basicprograms;

import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class PrimeFactors {

	public static void main(String[] args) {
		System.out.println("Enter a number :");
		int num=InputUtility.intVal();
		Utility.PrimeFactors(num);
		//System.out.println("prime factors are : "+prime);
	}
}
