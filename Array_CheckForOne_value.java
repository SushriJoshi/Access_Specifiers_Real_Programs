package method_string_functions;

public class Array_CheckForOne_value {

	static int No_to_Check=15;
	                                          //Check if 15 is present or not and it's indexing.
	public static void main(String[] args) 
	{
		int No[]=new int[4];
		 No[0]=52;
		 No[1]=15;
		 No[2]=59;
		 No[3]=57;
		 
		// int No[]= {52,53,56,54};
		
		for(int i = 0;i<No.length;i++)
		{
			if(No_to_Check==No[i])
			{
				System.out.println("15 is present in the given Array and it's indexing is ="+i);
			}
			
			
		}
		
	}

}
