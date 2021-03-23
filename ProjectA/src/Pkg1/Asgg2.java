package Pkg1;

public class Asgg2
{
	public void m()
	{
		System.out.println("Default Method");
	}
	public void m1(int a)
	{
		System.out.println("One Parameterized Method");
	}
	public void m2(int a,int b)
	{
		System.out.println("Two Parameterized Method");
	}
	public void m3(int a,int b,int c)
	{
		System.out.println("Third Parameterized Method");
		this.m();
		this.m4(21,22,23,24);
		this.m2(31, 32);
		this.m1(67);
	}
	public void m4(int a,int b,int c,int d)
	{
		System.out.println("Four Parameterized Method");
	}
	public static void main(String[] args) 
	{
		Asgg2 a = new Asgg2();
		a.m3(11,12,13);
	}

}
