package access_pcfrFORmethods_insideClass;

public class Access_Pc_Methods 
{

	public void add()
	{
		System.out.println("Addition");
	}
	protected void sub()
	{
		System.out.println("Subtraction");
	}
	private void mul()
	{
		System.out.println("Multiplication");
	}
	void div()
	{
		System.out.println("Division");
	}
	public static void main(String[] args) 
	{
		Access_Pc_Methods a1=new Access_Pc_Methods();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
	}
	
	
}
