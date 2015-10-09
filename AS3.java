/*
Chapter 1: Arrays and Strings
PROGRAM 1.3: Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer. 
NOTE: One or two additional variables are fine. An extra copy of the array is not.
FOLLOW UP
Write the test cases for this method.

Complexity: O(n3) 
	could be reduced to O(n2 logn) using divide and conquer
*/

import java.io.*;
class AS3
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String s;
		System.out.print("Enter the string: ");
		s = br.readLine();
		
		char a[] = s.toCharArray();
		//System.out.println("length of array within main function:" +a.length);

		boolean isDuplicateFound = false;
		
		AS3 as3 = new AS3();
		as3.removeDuplicates(a, isDuplicateFound);
		
		if(isDuplicateFound = true)
		{
			System.out.println("Duplicates were found in the string entered.");
			AS3 as = new AS3();
			as.displayArray(a);
		}
		else
		{
			System.out.println("No duplicates were found in the string entered");
		}
	}
	
	char[] removeDuplicates(char a[],  boolean isDuplicateFound)
	{
		for(int i=0; i<a.length; i++)	//initial loop for going through the entire character array
		{
			char ab = a[i];
			
			for (int j=i+1; j<a.length; j++)	//loop for comparing each character to look for duplicates
			{
				if(ab==a[j])
					{
						leftShiftArray(a,j);
						//System.out.println("length of array with remove duplicates function: "+a.length);
						isDuplicateFound = true;
					}
			}
		}
		return a;
	}
	
	char[] leftShiftArray(char a[], int j)
	{
		int k = j;
		//while(a[k+1]!='\u0000') //omitted condition k<a.length-1
		while(a[k+1]!='\u0000')
		{
			a[k]=a[k+1];
			//System.out.println("value of k with left shift array function:" +k);
			//System.out.println("value of k+1 with left shift array function:" +k);
			k++;
		}
		a[k]='\u0000';
		return a;
	}
	
	void displayArray(char a[])
	{
		for(int l=0; l<a.length; l++)
		{
			System.out.print(""+ a[l]);
			System.out.print("\t");
		}
	}
}