package lab2;
import java.util.Scanner;
	public class OverloadDemo {
		 public int sum(int a, int b)
		    {
		        return a + b;
		    }
		   public String sum(String a, String b) {
		        return a + b;
		    }
		   public int sum(int a) {
		        return a + 1;
		    }
	   public static void main(String[] args)
	   {
	        Scanner sc = new Scanner(System.in);
	        OverloadDemo ob = new OverloadDemo ();
	        System.out.print("Enter the first integer: ");
	        int num1 = sc.nextInt();
	        System.out.print("Enter the second integer: ");
	        int num2 = sc.nextInt();
	       
	        sc.nextLine(); 
	        System.out.print("Enter the first string: ");
	        String str1 = sc.nextLine();
	        System.out.print("Enter the second string: ");
	        String str2 = sc.nextLine();
	        

	        System.out.print("Enter an integer to increment: ");
	        int num = sc.nextInt();
	        int intResult = ob.sum(num1, num2);
	        System.out.println("Sum of integers: " + intResult);
	        String stringResult = ob.sum(str1, str2);
	        System.out.println("Concatenated strings: " + stringResult);

	        int incrementResult = ob.sum(num);
	        System.out.println("Incremented value: " + incrementResult);


	        sc.close();
	    }
	}

