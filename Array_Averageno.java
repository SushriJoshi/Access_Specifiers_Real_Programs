package method_string_functions;

public class Array_Averageno 
{

	static int sum=0;
	static double average=0;
	public static void main(String[] args) 
	{
	/*	int No[]=new int[4];
		 No[0]=52;
		 No[1]=55;
		 No[2]=59;
		 No[3]=57;
	*/
		
		int No[]= {52,55,59,57};
		
		for(int i=0;i<No.length;i++)
		{
			sum=sum+No[i];
		}
		
		 average =sum/No.length;
		
		 System.out.println("Average of 4 numbers = "  +average);
		
		 
		
		
		
	}
}
