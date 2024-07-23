package switch_case_Concept;

public class Overload_mainmethod     //overloading main method parameterized and non parameterized.
{

	public static void main()
	{
		System.out.println("No parameter");
	}
	public static void main(String name) 
	{
		System.out.println("String datatype");

	}
	public void main(double salary)
	{
		System.out.println("double datatype");
	}
	public static void main(boolean b)
	{
		System.out.println("boolean datatype");
	}
	public void main(float f) 
	{
		System.out.println("float datatype");
	}
	public static void main(String[] args)
	{
		Overload_mainmethod d1=new Overload_mainmethod();
		main();
		main("Sushri");
		d1.main(58695.32);
		main(true);
		d1.main(56.325698);
		
	}

}
