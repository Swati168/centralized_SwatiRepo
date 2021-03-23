package Pkg1;

public class constructorCallinginamethodbycreatingobject 
{
	public constructorCallinginamethodbycreatingobject()
	{
		System.out.println("Default Constructor");
	}
	public void m1()
	{
		constructorCallinginamethodbycreatingobject d = new constructorCallinginamethodbycreatingobject();
		System.out.println("Method One");
	}
	
	public static void main(String[] args) 
	{
		constructorCallinginamethodbycreatingobject c = new constructorCallinginamethodbycreatingobject();
		c.m1();
	}

}
