package lab2;
import java.util.Scanner;
abstract class Shape
{
	
		abstract void numofsides();
	}
class Rectangle extends Shape
{
	int sides;
	Rectangle(int sides)
	{
		this.sides=sides;
	}
		void numofsides()
		{
			System.out.println("I am rectangle and i have"+sides+"sides");
			int sum=(sides-2)*180;
			System.out.println("Sum of angles"+sum);
			
		}
	}
	
	
	
	

class Triangle extends Shape
{
	int sides;
	Triangle(int sides)
	{
		this.sides=sides;
	}
		void numofsides()
		{
			System.out.println("I am triangle and i have"+sides+"sides");
			int sum=(sides-2)*180;
			System.out.println("Sum of angles"+sum);
			
		}
}
class Hexagon extends Shape
{
	int sides;
	Hexagon(int sides)
	{
		this.sides=sides;
	}
		void numofsides()
		{
			System.out.println("I am hexagon and i have"+sides+"sides");
			int sum=(sides-2)*180;
			System.out.println("Sum of angles"+sum);
			
		}
	
}

public class AbstractDemo {

	public static void main(String[] args) { 
		String choice;
		Scanner sc=new Scanner(System.in);

		int sides=0;
		
	
	do
	{
		System.out.println("Enter the number of sides:");
		sides=sc.nextInt();
		
		
	
		if(sides==4)
		{
			Rectangle r=new Rectangle(4);
			r.numofsides();
			
		}
		else if(sides==3)
		{
			Triangle t=new Triangle(3);
			t.numofsides();
		}
		
		else if(sides==6)
		{
			Hexagon h=new Hexagon(6);
			h.numofsides();
		}
		else
		{
			System.out.println("not a valid choice");
		}
		
	sc.nextLine();
		System.out.println("Do you want to continue?");
		 choice=sc.nextLine();
		
		
	
	}while(choice.equalsIgnoreCase("y"));
	System.out.println("exiting");
	sc.close();
}
}

