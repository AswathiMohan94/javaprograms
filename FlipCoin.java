package com.bridgelabzs.fellowship.basicprograms;

import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Response;
import com.bridgelabz.fellowship.util.Utility;

public class FlipCoin {
	public static void main(String[] args) {
		System.out.println("No of times coin need to be flipped : ");
		int n = InputUtility.intVal();
		Response r = Utility.flip(n);
		System.out.println("Head % : " + r.getHead());
		System.out.println("Tail % : " + r.getTail());
	}
}





