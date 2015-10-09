import java.util.*;
public class FrogJump 
{
	static int solution() 
	{

	    int A[]= {1,3,1,4,2,3,7,4};
	    int X=5;
	    int i;
		int N=0;
	    for(int i=0; i<A.length; i++)
	    {
	        if(A[i]==X || A[i]>X) 
	        {
				N = i;
				break;
			}
			else 
			{
				N = -1;
			}
	        
	    }
		System.out.println("Output:" +(N));
	    return N;
	}	
	
	public static void main(String args[])
	{
		int answer = solution();
		System.out.println("Answer:" +answer);
	}
}