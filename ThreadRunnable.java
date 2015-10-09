/*
PROGRAM: To implement thread using the Runnable Interface

*/

class RunnableInterfaceDemo implements Runnable
{
	private Thread t;
	private String threadName;

	RunnableInterfaceDemo(String name)
	{
		threadName = name;
		System.out.println("Creating " +threadName);
	}
	
	public void run()
	{
		try
		{
			for(int i=4; i>0; i--)
			{
				System.out.println("Thread: " +threadName+ "," +i);
				//Let the thread sleep 
				Thread.sleep(50);
			}
			
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread " +threadName+ "interrupted.");
		}
		System.out.println("Exiting " +threadName);
	}
	
	void start()
	{
		System.out.println("Starting " +threadName);
		if(t==null)
		{
			t = new Thread(this,threadName);
			t.start();
		}
	}
} 

class ThreadRunnable
{
	public static void main(String args[])
	{
		RunnableInterfaceDemo R1 = new RunnableInterfaceDemo("Thread-1");
		R1.start();
		
		RunnableInterfaceDemo R2 = new RunnableInterfaceDemo("Thread-2");
		R2.start(); 
	}
}