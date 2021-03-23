package LoopsAndConditions;

import java.util.Scanner;

public class TablePrint 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Table of: ");
		int number = s.nextInt();
		
		
		for(int i=1;i<=10;i++)
		{
			int a = number*i;
			System.out.println(number+"*"+i+"="+a);
		}
		
	}

}
