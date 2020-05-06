package session_06_AbstractClass;
import java.util.Scanner;
abstract class twoDShape
{
	double dim1,dim2;
	abstract double area();
}
public class Rectangle extends twoDShape
{
	double area() 
	{
		return dim1*dim2;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Rectangle obj= new Rectangle();
		System.out.print("Enter length and width of Rectangle: ");
		obj.dim1= sc.nextInt();
		obj.dim2= sc.nextInt();
		System.out.println("Area of the rectangle is: "+obj.area());
	}
}
