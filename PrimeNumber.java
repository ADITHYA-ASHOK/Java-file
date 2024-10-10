package lab2;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.println("enter the limit:");
		int limit=sc.nextInt();
		
		for( n=2;n<limit;n++) {

			
				boolean isPrime=true;

			for(int j=2;j<=n/2;j++) {

				if(n%j==0) {
					isPrime=false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println("the number"+n+" "+"is prime");
			}
			
				
			}
		sc.close();
		}


	}

	

