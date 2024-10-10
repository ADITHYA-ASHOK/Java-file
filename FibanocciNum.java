package lab2;
import java.util.Scanner;


public class FibanocciNum {
	public static void main(String[] args) {
		Scanner sc=new 	Scanner(System.in);
		System.out.println("ente the limit :");
		int n=sc.nextInt();
		System.out.println("ente the first element :");
		int n1=sc.nextInt();
		System.out.println("ente the  second element :");
		int n2=sc.nextInt();
		int nexterm=0;
		for(int i=2;i<=n;i++ ) {
			System.out.println(nexterm);
			n1=n2;
			n2=nexterm;
			nexterm=n1+n2;
			
		}
		sc.close();

		}


}
