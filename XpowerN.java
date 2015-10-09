/*
PROGRAM: Printing x raised to the power n.
Complexity: O(n) where n is the power of the variable base.
*/

import java.io.*;
class XpowerN
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter the number: ");
		int x = Integer.parseInt(br.readLine());
		System.out.print("Enter the power of x: ");
		int n = Integer.parseInt(br.readLine());
		
		XpowerN xn = new XpowerN();
		int ans = 1;
		int answer = xn.calculatePower(x,n,ans);
		System.out.println("x raised to the power n: "+answer);
	}
	
	int calculatePower(int x, int n, int ans)
	{
		if(n!=0)
		{
			n--;
			ans = x * calculatePower(x,n,ans);
		}
		return ans;
	}
}