/*
Chapter 1: Arrays and Strings
PROBLEM 1.7: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.

Conplexity: 
*/

import java.io.*;
class AS7
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter the number of rows (m): ");
		int m = Integer.parseInt(br.readLine());
		System.out.print("Enter the number of columns (n): ");
		int n = Integer.parseInt(br.readLine());
		System.out.print("Enter the matrix: ");
		int matrix[][] = new int[m][n];
		int dupmatrix[] = new int[m*n];
		
		//input matrix elements
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print("Enter the element: ");
				matrix[i][j] = Integer.parseInt(br.readLine());
				if(matrix[i][j]==0)
				{
					//set respective elements in the array to 0
					dupmatrix[n*i+j] = 0;
					for(int a=i; a<n; a++)
					{
						dupmatrix[n*i+j] = 0;
					}
					for(int b=j; b<m; b++)
					{
						dupmatrix[n*i+j] = 0;
					}
				}
				else
				{
					//copy the value to the array
					if(dupmatrix[n*i+j]!=0)
						{dupmatrix[n*i+j] = matrix[i][j];}
				}
			}
		}
		
		for(int s=0; s<m*n; s++)
		{
			System.out.println(" "+dupmatrix[s]);
		}
	}
}