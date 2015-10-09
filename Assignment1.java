import java.io.*;
class Assignment1
{
	static int j=-1;
	static int n;
	
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//take in inputs
		
		System.out.print("Enter the number of elements in the array: ");
		n = Integer.parseInt(br.readLine());

		int a[] = new int[n] ;
		int b[] = new int[n] ;
		
		System.out.println("Enter the elements for the array a[ ]: ");
		for(int l=0; l<n; l++)
		{
			System.out.print("Enter the element: ");
			a[l] = Integer.parseInt(br.readLine());
			System.out.println();
		}
		System.out.println("Enter the elements for the array b[ ]: ");
		for(int m=0; m<n; m++)
		{
			System.out.print("Enter the element: ");
			b[m] = Integer.parseInt(br.readLine());
			System.out.println();
		}

		//  have a condition where we check with a boolean whether both the arrays are not null. 
		//null will be sop("Arrays are null")
		//not null will be direct to the method LastDiff */ 
		int index=0;
		if(n > 0)
			{index = LastDiff(a,b);}
		else 
			{System.out.println("One or both the arrays are null !");}
			
		if(j>=0)
			System.out.println("The last index is: " +index);
	}

	static int LastDiff (int a[], int b[])
	{
	
		int count=0;
		for (int i = 0; i< n; i++)
		{	
			if (a[i] != b[i])
				count=i;
			if (a[i] == b[i])
				j++;
		}
		return count;
	}
}