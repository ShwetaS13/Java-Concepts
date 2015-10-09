/*
Chapter 1: Arrays and Strings

Program 1.2: Write code to reverse a C-Style String. (C-String means that 
abcd is represented as five characters, including the null character.) 

*/

import java.io.*;	
class AS2
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String s;
		System.out.print("Enter the C-style string: ");
		s = br.readLine();
		//int n = s.length()+1;
		//char rev[] = new char[n];
		char rev[] = s.toCharArray();
		//rev[n-1]=' ';
		
		AS2 as2 = new AS2();
		as2.reverseString(rev);
	}
	
	void reverseString(char rev[])
	{
		char temp;
		for(int i=0; i<rev.length/2; i++)
		{
			temp = rev[i];
			rev[i] = rev[rev.length-1-i];
			rev[rev.length-1-i] = temp;
		}
		
		String newString = new String(rev);
		System.out.println("The inverted C-style string is: ' "+newString+"'");
	}
}