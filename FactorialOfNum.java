package lab2;
import java.util.Scanner;

public class FactorialOfNum {
	public static void main(String[] args) {
		int i=1,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit:");
		int n=sc.nextInt();
		while(n>0) {
			fact=fact*n;
			n--;
		}
		System.out.println("factorial of the number"+ "="+fact) ;
			
		
		

		sc.close();


}
}