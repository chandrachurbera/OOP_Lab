package session_11_StringHandling;
import java.util.Scanner;
public class Occurrence_of_Char 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1= sc.nextLine();
		System.out.print("Enter the Character: ");
		String s2= sc.next();
		String[] arr= s1.split(s2);
		System.out.println("Number of occurrence of '"+s2+"' is: "+(arr.length-1));
	}
}
