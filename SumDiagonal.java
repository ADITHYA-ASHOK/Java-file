package lab2;

import java.util.Scanner;

public class SumDiagonal {

	public static void main(String[] args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println ("Enter the size of matrix:");
		int size=sc.nextInt();
	
		int [][]matrixA=new int [size][size];
		System.out.println("Enter the elements into the matrix:");

		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				matrixA[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Matrix:\n");
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				System.out.print( matrixA[i][j]+" ");
			}
			System.out.print("\n");
		}
		int d1=0,d2=0;
		
		for(i=0;i<size;i++) {
				d1+=matrixA[i][i];
				d2+=matrixA[i][size-i-1];
				
				
			}
	
		System.out.println("Sum of left diagonal is"+" "+d1);
		System.out.println("Sum of right diagonal is"+" "+d2);
}
}