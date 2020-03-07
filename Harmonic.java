package com.bridgelabzs.fellowship.basicprograms;

import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class Harmonic {
	public static void main(String[] args) {
		System.out.println("Enter the limit : ");
		int limit = InputUtility.intVal();
		double[] array = Utility.Harmonic(limit);
		Utility.displayArrayElements(array);
		System.out.println("\n\nN'th no: " + array[limit - 1]);
	}
}
