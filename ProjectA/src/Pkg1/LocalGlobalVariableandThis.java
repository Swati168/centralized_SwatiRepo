package Pkg1;

public class LocalGlobalVariableandThis 
{
 int swati; //Global Variable
 
 public void abc(int s)
 {
	 swati = s; //assigning local variable value to global variable
 }
 
 public static void main(String[] args) 
 {
	LocalGlobalVariableandThis t = new LocalGlobalVariableandThis();
	t.abc(123);
	System.out.println(t.swati);
}
}
