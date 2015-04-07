package com.sample.test;

import java.util.Scanner;

public class Mytest {
	
	public static void main(String [] args) {
		
		int result;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number which you want to factirial");
		
		result = in.nextInt();
		
		getfactorial(result);
		
		System.out.println("factorial is :  "+  getfactorial(result));
		
	}
	
	static int getfactorial(int num) 
	{
		int newFact = 1 ;
		 
		for(int i=1; i<=num ; i++)
		{ 
			newFact = newFact * i;
		}
		
		return newFact;
	}

}
