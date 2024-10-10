package lab2;
import java.util.Scanner;


public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int len=str.length();
		
		String revString=sc.nextLine();

		for(int i=len-1;i>=0;i--) {
			revString+=str.charAt(i);
			
		}
System.out.println("Reverse String is"+" "+revString);
sc.close();
	}
	
}
