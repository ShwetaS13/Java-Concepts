/* 
Chapter 1: Arrays and Strings

PROGRAM 1.1: Implement an algorithm to determine if a string has all 
unique characters. What if you can not use additional data structures?

Complexity: O(n) where n is the size of the input string

*/
import java.io.*;

class AS1
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String inputString;
		System.out.println("Enter the string: ");
		inputString = br.readLine();
		char[] inputCharArray = inputString.toCharArray();
		
		AS1 as1 = new AS1();
		as1.ifUnique(inputCharArray);
	}
	
	void ifUnique(char inputCharArray[])
	{
		boolean b[] = new boolean[256];
		int count=0;
		
		for(int i=0; i<inputCharArray.length; i++)
		{
			int ab = (int)inputCharArray[i]; 
			
			if(b[ab]==false)
				b[ab]=true;
			else
				{
					count = 1;
					System.out.print("String not unique!");
					break;
				}
		}
		
		if (count==0)
		{
			System.out.print("String unique!");
		}
	}
}