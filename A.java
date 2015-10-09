/* Program to learn staic and non-static methods*/

import java.io.*;

class A
{
	public static void main(String args[])
	{
		System.out.println("Hi this is a java program!");
		displayMom();
	}
	
	static void displayMom()
	{
		System.out.println("My mom's name is Satyabhhama Sukumaran.");
		A a = new A();
		a.displayDad();
	}
	
	void displayDad()
	{
		System.out.println("My dad's name is Sukumaran.");
		B b = new B();
		b.displayBrother();
	}
}

class B
{
	static void displayBrother()
	{
		System.out.println("My brother's name is Sujeet Sukumaran.");
		B ab = new B();
		ab.displayHisSister();
	}
	
	void displayHisSister()
	{
		System.out.println("His sister's name is Shweta Sukumaran.");
	}
}