package by.epam.matrix.task;

import java.util.Scanner;

public class MatrixCretingPow {

	/////////////////CreateMatrix/////////////////////////////
	public static double[][] createMatrix(double []array){
		double[][] matrix = new double [array.length][array.length];
		for(int i = 0; i < array.length ; i++) {
			for(int j = 0; j < array.length ; j++) {
				matrix[i][j] = Math.pow(array[j], (i+1));
			}
		}
		return matrix;
	}

	
//////////////////////////////////////////////////////////////	
/////////////////MAIN/////////////////////////////////////////
	public static void main(String[] args) {
		System.out.print("Input size of the array : ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.close();
        
        double [] array = new double [size];
		for(int i = 0; i< size; i++) {
			array[i] = (Math.random() * 10);
		}
		
		double [][] matrix = createMatrix(array);
		PrintMatrix.print(matrix);
        
	}
}
