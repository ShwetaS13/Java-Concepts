/*
PROGRAM: Inheritance and Polymorphism(class Reptiles and class Birth) 
 */
class Animal
{
	boolean isAnimal = false;
	public void makeNoise()
	{
		System.out.println("Animals make noises.");
	}
}

class Dog extends Animal
{
	//isAnimal = true;
	// no need to declare the variable isAnimal. It can be used directly.
	public void dogNoise()
	{	
		if(isAnimal==true)
		{
			System.out.println("The dog barks.");
		}
		else
		{
			System.out.println("Since this dog is not an animal, it does not bark.");
		}
	}
}

class Cat extends Animal
{
	public void catNoise()
	{
		System.out.println("The cat mews.");
	}
}

class Bird extends Animal
{
	//the following function is a case of Polymorphism. The function in the super class has been overridden by the function in the subclass.
	public void makeNoise()
	{
		super.makeNoise();
		System.out.println("A bird chirps.");
	}
	
	public void hasLegs()
	{
		System.out.println("A bird has two legs.");
	}
}

class Reptiles
{
	public void giveShot(Animal a)
	{
		System.out.println("The call demonstrates Polymorphism with class Reptiles.");
		System.out.println("Give the reptile a shot.");
		a.makeNoise();
		System.out.println("End of Polymorphism with class Reptiles.");
	}
	
}

class Birth
{
	public void giveBirth(Animal a)
	{
		System.out.println("The call demonstrates Polymorphism with class Birth.");
		System.out.println("The animal will give birth to a young one.");
		a.makeNoise();
		System.out.println("The animal would be happy.");
		System.out.println("End of Polymorphism with class Birth.");
	}
}

class Sounds
{
	public static void main(String args[])
	{
		//Dog functions
		Dog dd = new Dog();
		dd.dogNoise();
		dd.makeNoise();
		
		//Cat functions
		Cat cc = new Cat();
		cc.catNoise();
		cc.makeNoise();
		
		//Bird functions
		Bird bb = new Bird();
		bb.hasLegs();
		bb.makeNoise();
		
		System.out.println("The End!");
		
		System.out.println("Start Polymorphism with class Reptiles.");
		Reptiles r = new Reptiles();
		r.giveShot(cc);
		r.giveShot(dd);
		r.giveShot(bb);
		System.out.println("End of Polymorphism with class Reptiles.");
		
		System.out.println("Start Polymorphism with class Birth.");
		Birth b = new Birth();
		b.giveBirth(bb);
		b.giveBirth(cc);
		b.giveBirth(dd);
		System.out.println("End of Polymorphism with class Reptiles.");
		
	}
}