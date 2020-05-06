package session_07_Interface;
import java.util.Scanner;
public class Interface_Demo_1 extends Box
{
	public void type()
	{
		System.out.println("It's rectangular box");
	}
	public static void main(String[] args) 
	{
		Interface_Demo_1 obj = new Interface_Demo_1();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length and width and hight of the Box: ");
		obj.length= sc.nextInt();
		obj.width= sc.nextInt();
		obj.hight= sc.nextInt();
		obj.type();
		System.out.println("Volume of the box is: "+obj.volume());
	}

}
interface Shape
{
	void name();
	void type();
	double volume();
}
abstract class Box implements Shape
{
	double length,width,hight;
	public void name()
	{
		System.out.println("It's BOX.");
	}
	public double volume()
	{
		return length*width*hight;
	}
}

