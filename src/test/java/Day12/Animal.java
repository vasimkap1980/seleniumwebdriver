package Day12;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Animal 
{
	String color="white";
	
	void eat()
	{
		System.out.println("eating....");
	}
	
	
	
}
class Dog extends Animal
{
	String color="black";

	void dispalyColor()
	{
		//System.out.println(super.color);
		super.eat();
	}
	
}


	

