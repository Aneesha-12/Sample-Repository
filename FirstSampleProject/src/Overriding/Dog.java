package Overriding;

public class Dog extends Animal
{
	void eat()
	{
		System.out.println("Dog eat");
	}
	void sound()
	{
		System.out.println("Dog make sound");
	}

	public static void main(String[] args) 
	{
		Dog dog=new Dog();
		dog.eat();
		dog.sound();
		dog.run();
		Animal a=new Animal();
		a.sound();
		
	}

}
