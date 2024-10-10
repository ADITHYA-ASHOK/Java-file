package lab2;
import java.util.Scanner;
class Employee1
{
int salary;
	int basicpay;
	int DA;
	int HRA;
	Employee1(int basicpay,int DA,int HRA)
	{
		
		this.basicpay=basicpay;
		this.DA=DA;
		this.HRA=HRA;
	}
	void display() 
	{
		System.out.println("...EMPLOYEE...");
		
	}
	void calcsalary()
	{
		salary=basicpay+(DA/100)*basicpay+(HRA/100)*basicpay;
		System.out.println("The gross salary of Employee is:"+salary);
	}
}
class Engineer extends Employee1
{
	Engineer(int basicpay,int DA,int HRA)
	{
		super(basicpay,DA,HRA);
	}
		void display()
		{
			super.display();
			super.calcsalary();
			System.out.println("...ENGINEER...");
		}
		void calcsalary()
		{
			salary=2*salary;
			
		System.out.println("Gross salary of engineer:"+salary);
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary:");
		int basicpay=sc.nextInt();
		System.out.println("Enter DA:");
		int DA=sc.nextInt();
		System.out.println("Enter HRA:");
		int HRA=sc.nextInt();
		
		Engineer ob =new Engineer( basicpay,HRA,DA);
		
		ob.display();
		ob.calcsalary();
		sc.close();
	}

}


