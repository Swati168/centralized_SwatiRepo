package Abstraction;

public class StaticKeyword1
{
	static int a =0;     //if variable is static memory will be allocated on Class level
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
		
			
		System.out.println("******Second Object*****");
		StaticKeyword obj2 = new StaticKeyword();
		obj2.increment();
		System.out.println(obj2.a);
		
		System.out.println("****third Object****");
		StaticKeyword obj3 = new StaticKeyword();
		obj3.increment();
		System.out.println(obj3.a);
	}

}