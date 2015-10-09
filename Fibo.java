/*
PROGRAM: Printing the Fibonacci series using iteration.
*/
import java.io.*;

class Fibo
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter the first number in the sequence: ");
		int first = Integer.parseInt(br.readLine());
		System.out.print("Enter the second number in the sequence: ");
		int second = Integer.parseInt(br.readLine());
		System.out.print("Enter the numbers you wish to see in the sequence: ");
		int n = Integer.parseInt(br.readLine());
		
		Fibo fb = new Fibo();
		fb.calculateFiboSeries(first,second,n);
	}
	
	void calculateFiboSeries(int first, int second, int n)
	{
		System.out.println("The first number in the series is: "+first);
		System.out.println("he second number in the series is: "+second);
		for(int i=0; i<n-2; i++)
		{
			int serie = first + second;
			System.out.println("Next number in the series is: "+serie);
			first = second;
			second = serie;
		}
	}
}