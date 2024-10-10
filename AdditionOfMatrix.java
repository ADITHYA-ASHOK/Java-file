package lab2;
import java.util.Scanner;


public class AdditionOfMatrix{
	

    public static void main(String[] args) {
    	int i,j=0;
	
		Scanner sc=new Scanner(System.in);
		System.out.println ("Enter the number o f rows1:");
		int rows1=sc.nextInt();
		System.out.println("Enter the number of coloumns1:");
		int cols1=sc.nextInt();
		int [][]matrix1=new int [rows1][cols1];
		System.out.println("Enter the elements into the matrix1:");

		for(i=0;i<rows1;i++) {
			for(j=0;j<cols1;j++) {
				matrix1[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Matrix:\n");
		for(i=0;i<rows1;i++) {
			for(j=0;j<cols1;j++) {
				System.out.print( matrix1[i][j]+" ");
			}
			System.out.print("\n");
		}

		
		System.out.println ("Enter the number o f rows2:");
		int rows2=sc.nextInt();
		System.out.println("Enter the number of coloumns2:");
		int cols2=sc.nextInt();
		int [][]matrix2=new int [rows2][cols2];
		System.out.println("Enter the elements into the matrix2:");

		for(i=0;i<rows2;i++) {
			for(j=0;j<cols2;j++) {
				matrix2[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Matrix2:\n");
		for(i=0;i<rows2;i++) {
			for(j=0;j<cols2;j++) {
				System.out.print( matrix2[i][j]+" ");
			}
			System.out.print("\n");
		}
		

		int[][]resmatrix=new int[rows1][cols1];
		for(i=0;i<rows1;i++) {
			for(j=0;j<cols1;j++) {
				resmatrix[i][j]+=matrix1[i][j]+matrix2[i][j];
			}
			}
		System.out.println("after addition:\n");

		for(i=0;i<rows1;i++) {
			for(j=0;j<cols1;j++) {
				System.out.print(resmatrix[i][j] + " ");
            }
            System.out.println();			
}
    }
}