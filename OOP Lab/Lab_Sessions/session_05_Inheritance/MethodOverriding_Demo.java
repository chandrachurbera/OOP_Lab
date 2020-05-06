package session_05_Inheritance;
class Parent
{
	static void display()
	{
		System.out.println("Inside Parent class.");
	}
}
class Child extends Parent
{
	static void display()
	{
		System.out.println("Inside Child class.");
	}	
}
public class MethodOverriding_Demo 
{
	public static void main(String[] args) 
	{
		Parent.display();
		Child.display();
	}
}

