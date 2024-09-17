package lab2;
import java.util.Scanner;
abstract class Student
{
	abstract void display();
	
}
class DayScholar extends Student
{
	String type;
	String route;
	
	DayScholar(String route)
	{
		this.route=route;
	}
	void display() {
	System.out.println("Bus route:"+route);

}
}
class Hostler extends Student
{
	String type;
	String hostel;
	
		
		Hostler(String hostel)
		{
			this.hostel=hostel;
			
		}
		void display()
		{
		
		System.out.println("Hostel name:"+hostel);

	}
}
public class InherAbstracTDemo {
	public static void main(String[]args)
	{

			Scanner sc=new Scanner(System.in);
			String choice;
			do
			{
				System.out.println("enter the type:");
				String type=sc.nextLine();
		   if(type.equalsIgnoreCase("dayscholar"))
		{
			   String route;
			   
			System.out.println("Enter the bus route");
			route=sc.nextLine();
			DayScholar ob1=new DayScholar(route);
			ob1.display();
		}

		
		
		   else if(type.equalsIgnoreCase("hostler"))
		{
			   String hostel;
			   
			System.out.println("Enter the hostel name");
			hostel=sc.nextLine();
			Hostler ob2=new Hostler (hostel);
			ob2.display();
		}
		   System.out.println("do you want to continue?");
		    choice=sc.nextLine();
			
		}while(choice.equalsIgnoreCase("y"));
		System.out.println("exiting");
		
		sc.close();
	}

}
