package Pkg1;

public class Constructor1
{

int a,b,c,d,e;   //5 global variables

	public Constructor1(int a1, int a2, int a3, int a4, int a5)
	{
		a=a1;
		b=a2;
		c=a3;
		d=a4;
		e=a5;
	}
	
	public static void main(String[] args)
	{
		Constructor1 c = new Constructor1(23,14,12,13,15);
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		System.out.println(c.d);
		System.out.println(c.e);
	}
	
}


