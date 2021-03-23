package LoopsAndConditions;

import java.util.Scanner;

public class ConditionExample1 
{
	public static void main(String[] args) 
	{
		System.out.println("Please Enter Value of a: ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a<10)
		{
			System.out.println("a is less than 10");
		}
		else
		{
			System.out.println("a is greater than 10");
		}
	}

}
