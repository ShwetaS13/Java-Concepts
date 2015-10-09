/* 
Chapter 1: Arrays and Strings

PROGRAM 1.1 version 2: Implement an algorithm to determine if a string has all 
unique characters. What if you can not use additional data structures?

NOTE: without using additional data structures! we use a character variable 'ab' that gets compared with every element in the input.

Complexity: O(n2) where n is the size of the input string

*/
import java.io.*;

class AS11
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String inputString;
		System.out.print("Enter the string: ");
		inputString = br.readLine();
		char[] inputCharArray = inputString.toCharArray();
		
		AS11 as11 = new AS11();
		as11.ifUnique(inputCharArray);
	}
	
	void ifUnique(char inputCharArray[])
	{
		//boolean b[] = new boolean[256];
		int count=0;
		
		for(int i=0; i<inputCharArray.length; i++)
		{
			//int ab = (int)inputCharArray[i]; 
			char ab = inputCharArray[i];
			for (int j=0; j<i; j++)
			{
				if(ab==inputCharArray[j])
				{
					System.out.print("String not unique!");
					count = 1;
					break;
				}
			}
			
			for (int j=i+1; j<inputCharArray.length; j++)
			{
				if(ab==inputCharArray[j])
				{
					System.out.print("String not unique!");
					count = 1;
					break;
				}
			}
			
			if (count==1)
				break;
		}
		
		if (count==0)
		{
			System.out.print("String unique!");
		}
	}
}