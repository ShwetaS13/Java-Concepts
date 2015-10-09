import java.io.*;
import java.lang.Enum;

class Shweta
{
	enum Size {Small, Medium, Large, ExtraLarge};
	Size size;
	void printSize(Size size)
	{
		this.size=size;
		switch(this.size)
		{
			case Small:
				System.out.println("Eat! You're too tiny.");
				break;
			case Medium:
				System.out.println("Keep it up! You're perfect.");
				break;
			case Large:
				System.out.println("Watch what you're eating!");
				break;
			case ExtraLarge:
				System.out.println("Please stop eating.");
				break;
			default:
				System.out.println("Please enter one of the specified sizes.");
				break;
		}
	}
}

class Understand_Enum
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		Shweta ss = new Shweta();
		System.out.println("Object created.");
		
		System.out.println("Enter your size: (Small, Medium, Large, ExtraLarge)");
		ss.size =Enum.parseEnum(br.readLine());
		
		ss.printSize(ss.size);
		System.out.println("Function called.");
	}
}