package LoopsAndConditions;

import java.util.Scanner;

public class FactorialofaNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = s.nextInt();
		int factorial = 1;
		
		for(int i=number;i>=1;i--)
		{
			factorial = factorial*i;
			System.out.println("Factorial is: "+factorial);
		}
		
	}

}
