package ConstructorInInheritance;

public class ExplicitCallChild extends ExplicitCallParent
{
 public ExplicitCallChild()
 {
	 System.out.println("Child Default constructor");
 }
 public ExplicitCallChild(int a)
 {
	 super(11,13,14);
	 System.out.println("Child One Parameterized Constructor");
 }
 public ExplicitCallChild(int a,int b)
 {
	 System.out.println("Child Two Parameterized Constructor");
 }
 public ExplicitCallChild(int a,int b,int c)
 {
	 System.out.println("Child Three Parameterized Constructor");
 }
 
 public static void main(String[] args) 
 {
	 ExplicitCallChild e = new ExplicitCallChild(12);
}
}
