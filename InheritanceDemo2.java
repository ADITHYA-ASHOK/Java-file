package lab2;
import java.util.Scanner;
class Vehicle
{
	String model;
	int year;
	
}
class car extends Vehicle
{
	int number_of_doors;
	
}
class ElectricCar extends car
{
	int battery_cap;
	void print_ElectricCar()
	{
		System.out.println("Model:"+model);
		System.out.println("Year:"+year);
		
		System.out.println("Number of doors+"+number_of_doors);

		System.out.println("Battery capacity:"+battery_cap+"AH");
	}
}
public class InheritanceDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ElectricCar obj=new ElectricCar();
		System.out.println("Enter the model of the car:");
		obj. model=sc.nextLine();
		System.out.println("Enter the year of the car:");
		obj.year=sc.nextInt();
		System.out.println("Enter the number doors of the car:");
		obj.number_of_doors =sc.nextInt();
		System.out.println("Enter the Battercapacity of the car:");
		obj.battery_cap =sc.nextInt();
		
		
		obj.print_ElectricCar();
		
		sc.close();
		
	}

}
