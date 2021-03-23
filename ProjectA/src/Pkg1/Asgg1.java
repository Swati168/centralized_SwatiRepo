package Pkg1;

public class Asgg1
{
 public Asgg1()
 {
	 this(11,12,13,14);
	 System.out.println("Default Constructor");
 }
 public Asgg1(int a)
 {
	this();
	 System.out.println("One Parameterized Constructor");
 }
 public Asgg1(int a,int b)
 {
	 this(43,67,24);
	 System.out.println("Two Parameterized Constructor ");
 }
 public Asgg1(int a,int b,int c)
 {
	this(31);
	 System.out.println("Three Parameterized Constructor");
 }
 public Asgg1(int a,int b,int c,int d)
 {
		 System.out.println("Four Parameterized Constructor");
 }
 public static void main(String[] args) 
 {
	Asgg1 a = new Asgg1(12,14);
}
}
