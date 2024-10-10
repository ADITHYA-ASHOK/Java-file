package lab2;
import java.util.Scanner;

public class ReverseOfNum {

	public static void main(String[] args) {
		int rem,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println(" After reversing\n");
		for(int i=0;n>0;i++) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
			
		}
		System.out.println("reverse:"+rev);

		sc.close();

	}

}
