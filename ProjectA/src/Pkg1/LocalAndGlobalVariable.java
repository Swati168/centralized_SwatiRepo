package Pkg1;


public class LocalAndGlobalVariable 
{
  int swati; //global variable
  
  public void abc(int d)
  {
	  swati = d; 
  }
  
  public static void main(String[] args) 
  {
	  LocalAndGlobalVariable obj = new LocalAndGlobalVariable();
	  obj.abc(123);
	  System.out.println(obj.swati);
	
}
}
