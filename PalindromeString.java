package lab2;
import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args)
	{
	   boolean flag=true;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your String:");
      String str=sc.nextLine();
     int length=str.length();
for(int i=0;i<length/2;i++)
{
	if(str.charAt(i)!=str.charAt(length-1-i)) 
	{
		flag=false;
		break; 
	}
		
}
	if(flag) 
	{
		System.out.println(str+" "+"is"+" "+"palindrome ");  
	}
	else {
		System.out.println(str+" "+"is"+" "+" not palindrome");
	
	
	
	sc.close();
}
	}

}
