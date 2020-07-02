package by.epam.matrix.task;

import java.util.Random;
import java.util.Scanner;

public class MatrixMult {

	public static int[][] mult(int [][]A,int [][]B){
		if(A[0].length != B.length)
			return null;
		int [][]mult = new int[A.length][B[0].length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B[0].length; j++){
				mult[i][j] = 0;
				for (int g = 0; g < A[0].length; g++)
					mult[i][j] += (A[i][g] * B[g][j]);
			}
		}
		return mult;
	}
	
	
	
//////////////////////////////////////////////////////////////
///////////////////////MAIN///////////////////////////////////
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Input size of the Matrix A (m x n): ");
        int n_A;
        int m_A;
        System.out.print("m : ");
        m_A = in.nextInt();
        System.out.print("n : ");
        n_A = in.nextInt();
        
        System.out.println("Input size of the Matrix B (m x n): ");
        int m_B;
        int n_B;
        System.out.print("m : ");
        m_B = in.nextInt();
        System.out.print("n : ");
        n_B = in.nextInt();
        in.close();
        
        
        Random rn =new Random();
        
		int[][] A= new int[m_A][n_A];
		for(int i = 0; i < m_A; i++) {
			for(int j = 0; j < n_A; j++)
				A[i][j] = rn.nextInt(11);
		}
		int[][] B= new int[m_B][n_B];
		for(int i = 0; i < m_B; i++) {
			for(int j = 0; j < n_B; j++)
				B[i][j] = rn.nextInt(11);
		}
		
		System.out.println("Matrix A: ");
		PrintMatrix.print(A);
		System.out.println("Matrix B: ");
		PrintMatrix.print(B);
		
		System.out.println("Matrix A x B: ");
		int[][] mult;
		mult = mult(A, B);
		if(mult == null)
			System.out.println("Incorrect sizes ");
		else 
			PrintMatrix.print(mult);
	}

}
