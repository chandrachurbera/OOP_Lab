package session_04_StaticKeyword;
import java.util.Scanner;
import java.lang.Math;

class Complex 
{
	static double real1,img1,real2,img2;
	public Complex(double real1,double real2,double img1,double img2)
	{
		Complex.real1=real1;
		Complex.real2=real2;
		Complex.img1=img1;
		Complex.img2=img2;
	}
	void sum()
	{
		double img3= img1+img2;
		if(img3<0)
			System.out.println("Sum is "+(real1+real2)+"-j"+-(img3));
		else
			System.out.println("Sum is "+(real1+real2)+"+j"+(img3));
	}
	void diff()
	{
		double img3= img1-img2;
		if(img3<0)
			System.out.println("Difference is "+(real1-real2)+"-j"+-(img3));
		else
			System.out.println("Difference is "+(real1-real2)+"+j"+(img3));
	}
	void product()
	{
		double img3= real2*img1+real1*img2;
		if(img3<0)
			System.out.println("Product is "+(real1*real2+img1*img2)+"-j"+-(img3));
		else
			System.out.println("Product is "+(real1*real2+img1*img2)+"+j"+(img3));
	}
	void mod()
	{
		System.out.print("Modulus is 1st complex no. is ");
		System.out.println(Math.sqrt((real1*real1)+(img1*img1)));
		System.out.print("Modulus is 2nd complex no. is ");
		System.out.println(Math.sqrt((real2*real2)+(img2*img2)));
	}
	void complement()
	{
		if(img1<=0)
			System.out.println("Complement of 1st complex no. is "+real1+"+j"+-(img1));
		else
			System.out.println("Complement of 1st complex no. is "+real1+"-j"+img1);
		if(img2<=0)
			System.out.println("Complement of 1st complex no. is "+real2+"+j"+-(img2));
		else
			System.out.println("Complement of 1st complex no. is "+real2+"-j"+img2);
	}
	void display()
	{
		if(img1>=0)
			System.out.println("1st complex no. is "+real1+"+j"+img1);
		else
			System.out.println("1st complex no. is "+real1+"-j"+-(img1));
		if(img2>=0)
			System.out.println("2nd complex no. is "+real2+"+j"+img2);
		else
			System.out.println("2nd complex no. is "+real2+"-j"+-(img2));
	}
}
public class ComplexOperation
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		double real1= s.nextDouble();
		double img1= s.nextDouble();
		double real2= s.nextDouble();
		double img2= s.nextDouble();
		Complex obj= new Complex(real1,real2,img1,img2);
		obj.display();obj.sum();obj.diff();obj.product();obj.mod();obj.complement();
	}
}


