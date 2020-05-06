package session_07_Interface;
import java.util.Scanner;
public class MultipleInharitance_Demo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Account obj = new Account();
		while(true)
		{
			System.out.print("Input username & password: ");
			if(obj.check(sc.next(),sc.next()))
			{
				obj.displayData();
				break;
			}
			else
				System.out.println("Invalid username or password");
		}
	}
}
abstract class Personal_Data
{
	String name= "Chandrachur Bera";
	int age= 20;
	abstract void displayData();
}
interface Bank
{  
	String accountType();
	double rateOfInterest(); 
	void bankDetails();
}
class Account extends Personal_Data implements Bank
{
	private String username= "chandrachur007"; 
	private String password= "8017752260C";
	private int Acc_number= 987654456;
	boolean check(String a, String b)
	{
		if(a.equals(username)&&b.equals(password))
			return true;
		else
			return false;
	}
	public String accountType()
	{
		return "Savings";
	}
	public double rateOfInterest()
	{
		return 7.96;
	}
	public void bankDetails()
	{
		System.out.println("Bank name: SBI");
		System.out.println("IFSC code: 96564");
		System.out.println("Account type: "+accountType());
		System.out.println("Rate Of Interest: "+rateOfInterest());
	}
	void displayData()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Account number: "+Acc_number);
		bankDetails();
	}
}