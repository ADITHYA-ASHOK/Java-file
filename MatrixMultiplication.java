package lab2;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println ("Enter the number of rows:");
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
		System.out.println("Enter the scalar value to be multiplied by the matrix:");
		n =sc.nextInt();
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				matrix[i][j]=matrix[i][j]*n;
			}
		}
			System.out.println("Resultant matrix after scalar  multiplication is:"+"\n");
			for(i=0;i<rows;i++) {
				for(j=0;j<cols;j++) {
					System.out.print(matrix[i][j]+" ");
				}
				System.out.print("\n");
					
				}
			sc.close();


}
}

