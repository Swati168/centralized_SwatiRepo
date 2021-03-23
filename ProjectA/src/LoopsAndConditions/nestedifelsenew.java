package LoopsAndConditions;

import java.util.Scanner;

public class nestedifelsenew 
{
 public static void main(String[] args) 
 {
	System.out.println("Please Enter Value of a");
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	if(a>0)
	{
		if(a%2==0)
		{
			System.out.println("even number");
			if(a>=10)
			{
				System.out.println("a is greater than or equal to 10");
			}
			else
			{
				System.out.println("a is less than 10");
			}
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
	
