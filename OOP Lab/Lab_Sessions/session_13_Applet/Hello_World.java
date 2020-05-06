package session_13_Applet;
import java.applet.*;
import java.awt.*;
public class Hello_World extends Applet
{
	String msg;
	Font f1,f2,f3;
	public void init()
	{
		resize(550,650);
		setBackground(Color.cyan);
		setForeground(Color.DARK_GRAY);
	}
	public void start()
	{
		f1= new Font("Forte",Font.BOLD,18);
		f2= new Font("Forte",Font.PLAIN,30);
		f3= new Font("Arial",Font.BOLD,15);
	}
	public void paint(Graphics g)
	{
		g.setFont(f2);
		g.drawString("Hello World !",170,30);
		g.setFont(f3);
		g.drawRect(150,60,150,70);
		g.drawOval(330,60,150,70);
		g.fillRect(150,60,150,70);
		g.fillOval(330,60,150,70);
		for(int i=170,j=170;i>=150;i-=10,j+=20)
		{
			g.drawOval(i,i,j,j);
			g.drawOval(i,i,j,j);
		}
		g.drawOval(170,380,100,75);
		g.drawString("Welcome",190,421);
		g.drawOval(169,480,150,150);
		g.drawOval(220,480,150,150);
		g.drawRect(232,518,75,75);
		g.fillRect(232,518,75,75);
		
		g.drawString("1. ",50,30);
		g.drawString("2. ",50,100);
		g.drawString("3. ",50,270);
		g.drawString("4. ",50,421);
		g.drawString("5. ",50,555);
	}
}
