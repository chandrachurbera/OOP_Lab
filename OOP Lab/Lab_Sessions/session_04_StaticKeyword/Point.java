package session_04_StaticKeyword;
import java.util.Scanner;
import java.lang.Math;

public class Point 
{
	static double x1,y1,x2,y2,dis;
	static void distance()
	{
		dis=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		System.out.print("Distance between ");
		System.out.print("("+x1+","+y1+") and ("+x2+","+y2);
		System.out.println(") is "+dis+" units.");	
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		x1= s.nextDouble();
		y1= s.nextDouble();
		x2= s.nextDouble();
		y2= s.nextDouble();
		Point.distance();
	}

}
