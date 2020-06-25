package by.epam.mtv.task4;

import java.util.Scanner;

public class Matrix4 {

	/////////////////CreateMatrix/////////////////////////////
	public static double[][] CreateMatrix(double []array){
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
		
		double [][] matrix = CreateMatrix(array);
		PrintMatrix.Print(matrix);
        
	}
}
