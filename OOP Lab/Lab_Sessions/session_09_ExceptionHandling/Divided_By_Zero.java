package session_09_ExceptionHandling;
import java.util.Scanner;
public class Divided_By_Zero 
{
	public static void main(String[] args)
		{
			while(true)
			{
				try
				{
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter the DIVIDENT: ");
					int n1= sc.nextInt();
				//	System.out.println("");
					System.out.print("Enter the DIVISOR: ");
					int n2= sc.nextInt();
					System.out.println("QUOTIENT is: "+(n1/n2));
					System.out.println("REMAINDER is: "+(n1%n2));
				}
				catch(ArithmeticException e1)
				{
					System.out.println("Exception thrown: "+e1);
					break;
				}	
			}
		}
}
