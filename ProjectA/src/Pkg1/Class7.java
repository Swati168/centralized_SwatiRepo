package Pkg1;

public class Class7 
{
	public Class7()
	{
		System.out.println("Default Constructor");
	}
	public void m1()
	{ 
		Class7 obj1 = new Class7();
		System.out.println("Method One");
	}
	
	public static void main(String[] args)
	{
		Class7 obj = new Class7();
		obj.m1();
	}

}
