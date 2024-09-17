package lab2;
import java.util.Scanner;
 class Employeee
{
	String name;
	int employeeid;
	void Employeedet()
	{
		System.out.println("Name:"+name);
		System.out.println("Employee id:"+employeeid);

		
	}
	
}
class FullTimeEmployee extends Employeee
{
	float annual_salary;
	void annualsalary()
	{
		System.out.println("Salary:"+annual_salary);

		
	}
}
class PartTimeEmployee extends Employeee
{
	float hourlyrate;
	void hourlyrate()
	{
		System.out.println("hourly rate:"+hourlyrate);

	}
	
		
	}



public class InheritanceDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FullTimeEmployee obj1= new FullTimeEmployee();
		PartTimeEmployee obj2= new PartTimeEmployee();
		System.out.println("FULL TIME EMPLOYEE DETAILS\n");
		System.out.println("Name of Full time employee:");
		obj1.name=sc.nextLine();
		System.out.println("Employee id of Full time employee:");
		obj1.employeeid=sc.nextInt();
		System.out.println("Annual salary of Full time employee:");
		obj1.annual_salary=sc.nextFloat();
		sc.nextLine();

		System.out.println("PART TIME  EMPLOYEE DETAILS\n");
		System.out.println("Name of Part time employee:");
		obj2.name=sc.nextLine();
		System.out.println("Employee id of Part time employee:");
		obj2.employeeid=sc.nextInt();
		System.out.println("Hourly rate of Part time employee:");
		obj2.hourlyrate=sc.nextFloat();
		System.out.println("FULL TIME EMPLOYEE DETAILS\n");

         obj1.Employeedet();
         obj1.annualsalary();
 		System.out.println("\n");

 		System.out.println("PART TIME EMPLOYEE DETAILS\n");

         obj2.Employeedet();
         obj2.hourlyrate();
         sc.close();
		
		
	}

}
