package lab2;
import java.util.Scanner;
public class MatMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows of first matrix:");
		int row1 = sc.nextInt();
		System.out.println("Enter no of columns of first matrix :");
		int col1 = sc.nextInt();
		System.out.println("Enter no of rows of second matrix:");
		int row2 = sc.nextInt();
		System.out.println("Enter no of columns of second matrix:");
		int col2 = sc.nextInt();
		int[][] matrix1 = new int[row1][col1];
		int[][] matrix2 = new int[row2][col2];
		System.out.println("Enter the elements of first matrix:");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of second matrix:");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		System.out.println("The first matrix is:");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println("\n");
		}
		System.out.println("The second matrix is :");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println("\n");
		}
		int[][] matrix3 = new int[row1][col2];
		if(row2!=col1) {
			System.out.println("Multiplication impossible");
		}
		else {
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col2;j++) {
					for(int k=0;k<col1;k++) {
						matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
					}
				}
			}
		}
		System.out.println("The product matrix is:");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println("\n");
		}
		sc.close();
	}
}
