class Animal
{
	public void makeNoise()
	{
		System.out.println("Animals make noises.");
	}
}

class Dog extends Animal
{
	public void dogNoise()
	{	
		System.out.println("The dog barks.");
	}
}

class Cat extends Animal
{
	public void catNoise()
	{
		System.out.println("The cat mews.");
	}
}
class Sounds

{
	public static void main(String args[])
	{
		Animal aa = new Animal();
		aa.dogNoise();
		aa.catNoise();
		System.out.println("The End!");
	}
}