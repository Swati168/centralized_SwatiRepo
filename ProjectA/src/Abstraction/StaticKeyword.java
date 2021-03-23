package Abstraction;

public class StaticKeyword 
{
	static int a =0;     //if variable is non static memory will be allocated on object level
	public void increment()
	{
		a = a+1;
	}
	
	public static void main(String[] args)
	{
		System.out.println("*****First Object******");
		StaticKeyword obj1 = new StaticKeyword();
		obj1.increment();
		System.out.println(obj1.a);
		
	/*	obj1.increment();
		System.out.println(obj1.a);//called increment method twice 
		*/
		System.out.println("******Second Object*****");
		StaticKeyword obj2 = new StaticKeyword();
		obj2.increment();
		System.out.println(obj2.a);
		
		System.out.println("****third Object****");
		StaticKeyword obj3 = new StaticKeyword();
		obj3.increment();
		System.out.println(obj3.a);
		
		System.out.println("*****Calling using first object again******");
		System.out.println(obj1.a);
	}

}
