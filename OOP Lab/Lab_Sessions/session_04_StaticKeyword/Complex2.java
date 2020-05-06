package session_04_StaticKeyword;
import java.util.Scanner;

class Demo
{
	static double r1,i1,r2,i2;
	public Demo(double r1,double i1,double r2,double i2)
	{
		this.r1=r1;
		this.i1=i1;
		this.r2=r2;
		this.i2=i2;
	}
	static void sum(double real1, double imaginary1, double real2, double imaginary2) 
	{
		double sum1=real1+real2;
		double sum2=imaginary1+imaginary2;
		System.out.println("Addition..");
		System.out.println(sum1+" + "+"j"+sum2);
	}
	static void minus(double real1, double imaginary1, double real2, double imaginary2) 
	{
		double sum1=real1-real2;
		double sum2=imaginary1-imaginary2 ;
		System.out.println("Difference..");
		System.out.println(sum1+" + "+"j"+sum2);
	}
	static void product(double real1, double imaginary1, double real2, double imaginary2) 
	{
		double sum1=(real1*real2)-(imaginary1*imaginary2);
		double sum2=(real2*imaginary1)+(real1*imaginary2);
		System.out.println("Product..");
		System.out.println(sum1+" + "+"j"+sum2);
	}
	static void modulus(double real1, double imaginary1, double real2, double imaginary2)
	{
		double sum1=(real1*real2)-(imaginary1*imaginary2);
		double sum2=(real2*imaginary1)+(real1*imaginary2);
		System.out.println("Modulus..");
		System.out.println(Math.sqrt(sum1*sum1+sum2*sum2));
	}
	static void complement(double real1, double imaginary1, double real2, double imaginary2)
	{
		System.out.println("Complement..");
		System.out.println(real1+" "+-(imaginary1)+"j");
		System.out.println(real2+" "+-(imaginary2)+"j");
	}
}


public class Complex2
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		double r1=s.nextDouble();
		double i1=s.nextDouble();
		double r2=s.nextDouble();
		double i2=s.nextDouble();
		Demo obj=new Demo(r1,i1,r2,i2);
		Demo.sum(r1,i1,r2,i2);
		Demo.minus(r1,i1,r2,i2);
		Demo.product(r1,i1,r2,i2);
		Demo.modulus(r1,i1,r2,i2);
		Demo.complement(r1,i1,r2,i2);
	}
}
