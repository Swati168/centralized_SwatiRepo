package ScannerPackage;

import java.util.Scanner;

public class Asgone 
{
	//int x1,x2,x3,x4,x5,x6;
	
	public int sum(int a,int b)
	{
		//int c;
		int c=a+b;
		return c;
	}
	public int sub(int a,int b)
	{
		int d;
		d=a-b;
		return d;
	}
	public int div(int a,int b)
	{
		int e = a/b;
		return e;
	}
	public void mul(int a,int b)
	{
		int f=a*b;
		System.out.println("Result of ((((x1+x2)+x3)-x4)/x5)*x6) is: "+f);
	}
	public static void main(String[] args) 
	{
		Asgone a = new Asgone();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x1,x2,x3,x4,x5,x6");
		int x1 = s.nextInt();
		int x2 = s.nextInt();
		int x3 = s.nextInt();
		int x4 = s.nextInt();
		int x5 = s.nextInt();
		int x6 = s.nextInt();
		 
		 
		int sum_result = a.sum(x1, x2);
		int sum1_result = a.sum(sum_result, x3);
		int sub_result = a.sub(sum1_result, x4);
		int div_result = a.div(sub_result, x5);
	   a.mul(div_result, x6);
		
		
		
	}

}
