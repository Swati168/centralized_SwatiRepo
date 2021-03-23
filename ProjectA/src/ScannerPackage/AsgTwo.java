package ScannerPackage;
import java.util.Scanner;

public class AsgTwo 
{	public int div(int x1,int x2)
	{int div_result = x1/x2;
		return div_result;}
	public int sum(int div_result,int x3)
	{int sum_result = div_result+x3;
		return sum_result;}
	public int sub(int sum_result,int x4)
	{int sub_result = sum_result-x4;
		return sub_result;}
	public void mul(int sub1_result,int x6)
	{int mul_result = sub1_result * x6;
		System.out.println("Result of ((((x1/x2)+x3)-x4)-x5)*x6) is: "+mul_result);}
	
	public static void main(String[] args)
	{
		AsgTwo t = new AsgTwo();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter value of x1,x2,x3,x4,x5,x6");
		int x1 = s.nextInt();
		int x2 = s.nextInt();
		int x3 = s.nextInt();
		int x4 = s.nextInt();
		int x5 = s.nextInt();
		int x6 = s.nextInt();
		
		int div_result = t.div(x1, x2);
		int sum_result = t.sum(div_result, x3);
		int sub_result = t.sub(sum_result, x4);
		int sub1_result = t.sub(sub_result, x5);
		t.mul(sub1_result, x6);
	
	}
}
