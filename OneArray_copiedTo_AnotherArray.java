package method_string_functions;

import java.util.Arrays;

public class OneArray_copiedTo_AnotherArray 
{

	public static void main(String[] args) 
	{
		int A1[]= {23,25,26,28};
		
		int A1copied[]=new int[A1.length];
		
		for(int i=0;i<A1.length;i++)
		{
			A1copied[i]=A1[i];
		}
		
		System.out.println(Arrays.toString(A1copied));
		System.out.println(Arrays.toString(A1));
	}
}
