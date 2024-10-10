package lab2;
import java.util.Scanner;
public class RemoveString {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.nextLine();
str=str.toLowerCase();
System.out.println("Enter the character to be removed:");
char character=sc.nextLine().charAt(0);
String string=str.replace(Character.toString(character),"" );
System.out.println("New string:"+" "+string);
sc.close();
	}

}
