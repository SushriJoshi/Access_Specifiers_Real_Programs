package access_pcfrFORmethods_insideClass;

public class Access_pc_Constructor 
{
	public Access_pc_Constructor(int a)
	{
		System.out.println("Access specifier for Constructot with parameter");
	}
	
	protected Access_pc_Constructor(int a,double b)
	{
		System.out.println("Access specifier for Constructot with two parameters");
	}
	
	Access_pc_Constructor()
	{
		System.out.println("Access specifier for Constructot with parameter");
	}
	
	private Access_pc_Constructor(boolean b1)
	{
		System.out.println("Access specifier for Constructot with parameter");
	}

	public static void main(String[] args) 
	{
	
		new Access_pc_Constructor(100);
		new Access_pc_Constructor(100,523.21);
		new Access_pc_Constructor(true);
		new Access_pc_Constructor();
		
		
		
		
			
		
		
	}
}
