package session_09_ExceptionHandling;
import java.util.Scanner;
public class NumberFormatException 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter any INTEGER value: ");			
			try
			{
				String s= sc.next();	
				int value = Integer.parseInt(s);
				System.out.println("Integer is: "+value);
			}
			catch(Exception e3)
			{
				System.out.println("Exception thrown: "+e3);
				break;
			}
		}
	}
}
