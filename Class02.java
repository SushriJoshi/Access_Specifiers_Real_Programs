package packg02;

public class Class02 
{

	static int a=10;
	static int b=20;
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
	
	public static void ADD()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	protected static void SUB()
	{
		int sub=b-a;
		System.out.println(sub);
	}
	
	private static void MUL()
	{
		int mul=a*b;
		System.out.println(mul);
	}
	static void DIV()
	{
		int div=b/a;
		System.out.println(div);
	}
	
	public static void main(String[] args) 
	{
		ADD();
		SUB();
		MUL();
		DIV();
		
	}
}
