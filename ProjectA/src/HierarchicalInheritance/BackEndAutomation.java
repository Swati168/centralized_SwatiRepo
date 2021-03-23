package HierarchicalInheritance;

public class BackEndAutomation extends Automation
{
	public void BackEnd()
	{
		
		System.out.println("This is BackEnd Automation");
	}
	
	public static void main(String[] args) 
	{
		BackEndAutomation b = new BackEndAutomation();
		b.automationn();
		b.BackEnd();
	}

}
