/*
Chapter 1: Arrays and Strings
PROGRAM 1.4: Write a method to decide if two strings are anagrams or not.
COMPLEXITY: Thanks to the sorting functions which is O(logn) and the comparison which is O(n)-- O(n logn)
*/

import java.util.Arrays;
import java.io.*;
class AS4
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String s1,s2;
		System.out.print("Enter string 1: ");
		s1 = br.readLine();
		s1 = s1.toLowerCase();
		char char1[] = s1.toCharArray();
		System.out.print("Enter string 2: ");
		s2 = br.readLine();
		s1 = s1.toLowerCase();
		char char2[] = s2.toCharArray();
		
		AS4 as4 = new AS4();
		int anagram = 0;
		if(char1.length == char2.length)
		{
			anagram = as4.ifAnagrams(char1, char2);
		}
		
		if(anagram == char1.length)
			{System.out.println("The two string are anagrams");}
		else
			{System.out.println("The two string are not anagrams");}
	}
	
	int ifAnagrams(char char1[], char char2[])
	{
		int count = 0;
		Arrays.sort(char1);
		Arrays.sort(char2);
		for(int i=0; i<char1.length; i++)
		{
			if(char1[i] == char2[i])
				{count++;}
			else 
				{break;}
		}
		return count;
	}
	
}