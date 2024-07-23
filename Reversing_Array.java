package method_string_functions;

import java.util.Arrays;

public class Reversing_Array {

	static int k=0;
	
	public static void main(String[] args) 
	{
		
		
		int RollNo[]={15,87,65,55,32};  //4 is index of this Array. 
		int RollNo_Reverse[]=new int[RollNo.length];
		
		for(int i=RollNo.length-1;i>=0;i--)    //length=5 but indexing starts from 0.
		{
			
			RollNo_Reverse[i]=RollNo[k];
			k++;
		}
		
		System.out.println(Arrays.toString(RollNo));
		System.out.println(Arrays.toString(RollNo_Reverse));
	}

}
