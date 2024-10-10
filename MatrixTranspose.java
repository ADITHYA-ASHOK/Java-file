package lab2;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		int i, j=0;
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements into the matrix:");

        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("After transposing");
        int[][]transpose=new int[i][j];
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
            	transpose[j][i]=matrix[i][j];
            }
        }
        for (i = 0; i < cols; i++) {
            for (j = 0; j < rows; j++) {
        
System.out.print(+transpose[i][j]+" ");
	}
            
            System.out.print("\n");

        }
	}
}
