package session_11_StringHandling;
import java.util.Scanner;
public class Number_of_Charecters 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s= sc.nextLine();
		String[] words=s.split(" ");
//		String[] sentences=s.split(".");
		int character = s.length()-(words.length-1);
		System.out.println("Number of Characters in the paragraph is: "+character);
		System.out.println("Number of Words in the paragraph is: "+words.length);
//		System.out.println("Number of Sentences in '"+s+"' is: "+sentences.length);
	}

}

