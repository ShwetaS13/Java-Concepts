/*
Chapter 1: Arrays and Strings
PROGRAM 1.5: Write a method to replace all spaces in a string with ‘%20’.

NOTE: ASCII value for space is 32.

COMPLEXITY:
*/

import java.io.*;
class AS5
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String s;
		System.out.println("Enter the string: ");
		s = br.readLine();
		System.out.println(s.replace(' ','%2'));
		/* String s1[] = s.toStringArray();
		
		AS5 as5 = new AS5();
		as5.replaceSpaces(s1);
		as5.displayArray(s1); */
	}
	
	/* String[] replaceSpaces(String s1[])
	{
		for(int i=0; i<s1.length; i++)
		{
			if(s1[i] == " ")
			{
				s1[i] = "%20";
			}
		}
		return s1;
	}
	
	void displayArray(String s1[])
	{
		String s2 = s1.toString();
		System.out.println("The new string is: "+s2);
	} */
}