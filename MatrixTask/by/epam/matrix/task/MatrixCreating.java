package by.epam.matrix.task;

import java.util.Scanner;

public class MatrixCreating {
	
	/////////////////ALGORITHM 1//////////////////////////	
	public static int[][] createMatrix1(int size){
		int[][] array = new int [size][size];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0 ; j < array.length; j++) {
				if (i % 2 == 0 )
					array[i][j] = j + 1;
				else
					array[i][j] = array.length - j;
			}
		}
		
		return array;				
	}
	
	/////////////////ALGORITHM 2//////////////////////////
	public static int[][] createMatrix2(int size){
		int[][] array = new int [size][size];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0 ; j < array.length; j++) {
				if (i ==j )
					array[i][j] = (i+1)*(i+2);
			}
		}		
		return array;				
	}
	
	/////////////////ALGORITHM 3//////////////////////////
	public static int[][] createMatrix3(int size){
		int[][] array = new int [size][size];
		for(int i = 0; i <(array.length / 2); i++) {
			for(int j = i ; j < array.length - i; j++) {
					array[i][j] = 1;
			}
		}
		
		for(int i = array.length - 1; i >= (array.length / 2); i--) {
			for(int j = i ; j >= (array.length - i - 1) ; j--) {
					array[i][j] = 1;
			}
		}	
		return array;				
	}

	
//////////////////////////////////////////////////////////////	
///////////////////////MAIN///////////////////////////////////
	public static void main(String[] args) {
		System.out.print("Input half size of the array : ");
        Scanner in = new Scanner(System.in);
        int size = (in.nextInt()) * 2;
        in.close();
        
        System.out.println("Array (1 algorithm) : ");
		int[][] array1 = createMatrix1(2 * size);
		PrintMatrix.print(array1);
		System.out.println();
		
		System.out.println("Array (2 algorithm) : ");
		int[][] array2 = createMatrix2(2 * size);
		PrintMatrix.print(array2);
		System.out.println();
		
		System.out.println("Array (3 algorithm) : ");
		int[][] array3 = createMatrix3(2 * size);
		PrintMatrix.print(array3);
		System.out.println();
	}
}
