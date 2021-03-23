package ConstructorInInheritance;

public class AsgTwoMethodthis 
{
	int a;
	public void m()
	{
		this.m2(11, 12);
		System.out.println("Parent Default Method");
	}
	public void m1(int a)
	{
		this.m4(11,12,13,14);
		System.out.println("Parent one parameterized Method");
	}
	public void m2(int a,int b)
	{
		System.out.println("Parent two parameterized Method");
	}
	public void m3(int a,int b,int c)
	{
		this.m1(11);
		System.out.println("Parent three parameterized Method");
	}
	public void m4(int a,int b,int c,int d)
	{
		this.m();
		System.out.println("Parent four parameterized Method");
	}

}
