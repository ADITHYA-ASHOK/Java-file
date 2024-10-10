package lab2;
import java.util.Scanner;
public class MatrixMaximum {

	public static void main(String[] args) {
		int i,j,largest;
		Scanner sc=new Scanner(System.in);
		System.out.println ("Enter the number o f rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the number of coloumns:");
		int cols=sc.nextInt();
		int [][]matrix=new int [rows][cols];
		System.out.println("Enter the elements into the matrix:");

		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				matrix[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Matrix:\n");
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				System.out.print( matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.print("Maximum elements in each row:"+"\n");


		for(i=0;i<rows;i++) {
			largest=matrix[i][0];
			
			for(j=1;j<cols;j++) {


			if(matrix[i][j]>largest) {
				largest=matrix[i][j];

				 
			}
		}
			System.out.print("Row "+" "+i + "=" +largest+"\n");

			}
		

			

}
}

