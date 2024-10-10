package lab2;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int year;
		int numberOfDays=0;
		System.out.println("Enter the year:(YYYY):");
		 year=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter the month:");
		 String month=sc.nextLine();
		 switch(month.toLowerCase()) {
		 case "january":
		 case "march":
		 case "may":
		 case "july":
		 case "auagust":
		 case "october":
         case "december":
        	  numberOfDays=30;
        	 break;
        	 
		 case "april":
		 case "june":
		 case "september":
		 case "novemeber":
			  numberOfDays=31;
        	 break;
        	 
		 case "february":
			 if(year%4==0 && !(year%100==0)|| year%400==0){
				 numberOfDays=29;
				 
			 }
			 else {
				 numberOfDays=28;
			 }
			 break;
			 default:
				 System.out.println("Invaid month");
				 break;
		 }
		 System.out.println("The number of days in"+" "+month +"" +"is"+" "+numberOfDays);

		 
				 

        	
		 sc.close();


		 
		 
		 }
		 
		 
		 
		 

	
}