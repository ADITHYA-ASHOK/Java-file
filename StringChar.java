package lab2;
import java.util.Scanner;

public class StringChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int len=str.length();
		System.out.println("Ente the character:");
		char character=sc.nextLine().charAt(0);
		
		if (str.substring(0, 1).equals(str.substring(len - 1))) {
            System.out.println("The first and last characters are the same.");
        } else {
            System.out.println("The first and last characters are different.");
        }
		String str1=str.substring(1,len-1);
		System.out.println(str1);
		sc.close();
		}
	}

