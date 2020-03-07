package com.bridgelabzs.fellowship.basicprograms;

import com.bridgelabz.fellowship.util.Utility;

public class PowerOfTwo {
	public static void main(String[] args) {
		int n;
		n = Integer.parseInt(args[0]);
		long[] array = Utility.powerOfTwo(n);
		Utility.displayArrayElements(array);
	}
}

// here give input through command line arguments