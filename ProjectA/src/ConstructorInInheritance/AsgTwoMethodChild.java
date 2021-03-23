package ConstructorInInheritance;

public class AsgTwoMethodChild extends AsgTwoMethodthis
{
		public void c()
	{
			super.a=136;
		this.c3(11,12,13);
		System.out.println("Child default method");
	}
	public void c1(int a)
	{
		this.c2(11,12);
		System.out.println("Child one parameterized method");
	}
	public void c2(int a,int b)
	{
		this.c();
		System.out.println("Child two parameterized method");
	}
	public void c3(int a,int b,int c)
	{
		super.m3(11,12, 13);
		System.out.println("Child three parameterized method");
	}
	public void c4(int a,int b,int c,int d)
	{
		this.c1(12);
		System.out.println("Child four parameterized method");
	}

	public static void main(String[] args) 
	{
		AsgTwoMethodChild g = new AsgTwoMethodChild();
		g.c4(11,12,13,14);
	}
}
