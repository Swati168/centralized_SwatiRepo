package Pkg1;

public class thiskeywordLocalGlobalVariable
{
	//int swati=675;
	int swati;
	
	public void abc(int swati)
	{
		//swati=swati; //this.swati it will point to the global variable
		this.swati=swati;
	}
	
	public static void main(String[] args)
	{
		thiskeywordLocalGlobalVariable obj = new thiskeywordLocalGlobalVariable();
		obj.abc(123456);
		System.out.println(obj.swati);
		
		
	}

}
