package Abstraction;

public class Maruti extends Car
{
	public void second()
	{
		System.out.println("Body given by child class");
	}
   
	public static void main(String[] args) 
	{
		Maruti m = new Maruti();
		m.first();
		m.second();
		
	}
}
