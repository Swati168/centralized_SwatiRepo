package ConstructorInInheritance;

public class ClassB extends ClassA
{
	public ClassB()
	{
		System.out.println("Child Default Constructor");
	}
    public ClassB(int a)
    {
    	System.out.println("Child One Parameterized Constructor");
    }
    public ClassB(int a,int b)
    {
    	System.out.println("Child Two Parameterized Constructor");
    }
    public ClassB(int a,int b,int c)
    {
    	System.out.println("Chils Three Parameterized Constructor");
    }
    
    public static void main(String[] args) 
    {
    //	ClassB b = new ClassB(); //it will call Parent default constructor and child default constructor
    //	ClassB b = new ClassB(98); //it will call Parent default constructor and child one parameterized constructor
    //	ClassB b = new ClassB(11,12); //it will call Parent default constructor and child two parameterized constructor
    	ClassB b = new ClassB(11,12,13);
    	
    	
		
	}
}
