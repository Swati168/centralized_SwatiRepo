package LoopsAndConditions;

import java.util.Scanner;

public class ConditionExample2 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter value of a: ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		if(a%2==0) //either 0 or 1
		{
			System.out.println("Number is even number");
		}
		else
		{
			System.out.println("Number is Odd Number");
		}
	}

}
