package session_09_ExceptionHandling;
import java.util.Scanner;
public class ArrayIndexOutOfBounds_Exception 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int[] arr = {74,93,23,12,29};
		System.out.println("Elements in the array are: ");
		for(int i=0;i<5;i++)
		System.out.print(arr[i]+" ");
		System.out.println("");
		while(true)
		{
				System.out.print("Element of Which position you want to get: ");
				int temp= sc.nextInt();
			try
			{
				System.out.println("Element at position "+temp+" is "+arr[temp-1]);
			}
			catch(ArrayIndexOutOfBoundsException e2)
			{
				System.out.println("Exception thrown: "+e2);
				break;
			}
		}
	}
}
