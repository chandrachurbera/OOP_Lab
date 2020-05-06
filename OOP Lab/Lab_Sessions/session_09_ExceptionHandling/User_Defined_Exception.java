package session_09_ExceptionHandling;
import java.util.Scanner;
public class User_Defined_Exception 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double sum=0;
		System.out.print("Enter number of Subjects: ");
		int sub= sc.nextInt();
		System.out.println("Enter marks of each Subjects: ");
		for(int i=1;i<=sub;i++)
		{
			double temp= sc.nextDouble();
			double marks=0;
			try 
			{
				marks= validate(temp);
			} 
			catch (Invalid_Data e) 
			{
				i--;
				System.out.println("Exception Thrown: "+e);
			}
			finally
			{
				sum=sum+marks;
			}
				
		}
		System.out.println("Your Avarage Marks is "+(sum/sub));
	
	}
	static double validate(double temp)throws Invalid_Data
	{  
	    if(temp>100) 
	    {
	    	throw new Invalid_Data();
	    }
	    else 
	    {
	     return temp; 
	    }
	}  
}
class Invalid_Data extends Exception
{
	Invalid_Data()
	{
		System.out.println("Marks cannot be more than 100.");
	}
}

