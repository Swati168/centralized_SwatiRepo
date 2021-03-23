package LoopsAndConditions;

import java.util.Scanner;

public class NestedIfElse 
{
	public static void main(String[] args) 
	{
		System.out.println("Please Enter the value of a: ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a>0)
		{
			if(a%2==0)
			{
				System.out.println("even Number");
			}
			else
			{
				System.out.println("odd Number");
			}
		}
		else
		{
			System.out.println("Please enter +ve number");
		}
	}
	

}
