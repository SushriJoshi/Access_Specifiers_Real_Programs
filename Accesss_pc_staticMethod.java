package access_pcfrFORmethods_insideClass;

public class Accesss_pc_staticMethod 
{

	static int a=10;
	static int b=20;
	public static void add1()
	{
		int sum=a+b;
		System.out.println("Addition of a and b="+sum);
	}
	
	private static void sub1()
	{
		int sub=a-b;
		System.out.println("Subtraction of a and b="+sub);
	}
	
	protected static void mul1()
	{
		int mul=a+b;
		System.out.println("Multiplication of a and b="+mul);
	}
	
	static void div1()
	{
		int div=a+b;
		System.out.println("Division of a and b="+div);
	}
	
	public static void main(String[] args) 
	{
		add1();
		sub1();
		mul1();
		div1();
	}
}

