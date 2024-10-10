package lab2;

import java.util.Scanner;

public class SymmetricMatrix {

	public static void main(String[] args) {
		int i,j;
		int issymmetric=1;
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

		
				
			
		
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
			if(matrix[i][j]!=matrix[j][i])
			{
				 issymmetric=0;
				 break;
			}
				 if(issymmetric==0) {
					 break;
					 }
				 
			}
		}
			if(issymmetric==1) {
				System.out.println("the matrix is symmetric");
			}
				
			else {
				System.out.println("the matrix is not symmetric");
			}
		
	
			sc.close();
		
	
}
}

