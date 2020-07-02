package by.epam.matrix.task;
import java.util.Scanner;


public class MagicSquare {

	/////////////////OddMagicSquare////////////////////////////
	public static int[][] oddMagicSquare(int n){
		int[][] magicSqr = new int[n][n];
		int i;
		int j;
		int value;
		i = 0;
		j = n / 2;
		value = 1;
		magicSqr[i][j] = value++;
		
		while(value <= n*n) {
			if((value - 1) % n == 0)
				i++;
			else {
				i--;
				j++;
				if(i < 0)
					i = n - 1;
				if(j > n-1)
					j = 0;
			}
			magicSqr[i][j] = value++;
		}
		
		return magicSqr;
	}
	
	/////////////////EvenEvenMagicSquare///////////////////////
	public static int[][] evenEvenMagicSquare(int n){
		int[][] magicSqr = new int[n][n];
		int value;
		
		value = 1;
		for(int i = 0; i < n;i++)
			for(int j = 0; j < n; j++)
				magicSqr[i][j] = value++ ;
		
		
		int temp;
		//change in main diagonals
		for(int i = 0; i < (n/2); i++) {
			int j;
			j = i;
			while(j < n) {
				temp = magicSqr[i][j];
				magicSqr[i][j] = magicSqr[n - i - 1][n - j - 1];
				magicSqr[n - i - 1][n - j - 1] = temp;
				j +=4;
			}
		}
		
		//change in side diagonals
		for(int i = 0; i < (n/2); i++) {
			int j;
			j = n - i - 1;
			while(j > -1) {
				temp = magicSqr[i][j];
				magicSqr[i][j] = magicSqr[n - i - 1][n - j - 1];
				magicSqr[n - i - 1][n - j - 1] = temp;
				j -=4;
			}
		}
		return magicSqr;
	}
	
	/////////////////EvenOddMagicSquare///////////////////////
	public static int[][] evenOddMagicSquare(int n){
		int half = n / 2;
		int[][]magicOddSqr = oddMagicSquare(half);
		
		//create square from 4 oddMagic 
		int[][] magicSqr = new int[n][n];
		for(int i = 0; i < half; i++) {
			for(int j = 0; j < half; j++) {
				magicSqr[i][j] = magicOddSqr[i][j];
				magicSqr[i + half][j] = magicOddSqr[i][j] + half*half*3;
				magicSqr[i][j + half] = magicOddSqr[i][j] + half*half*2;
				magicSqr[i + half][j + half] = magicOddSqr[i][j] + half*half;
			}
		}
		
		//change in 0 column
		int temp;
		temp = magicSqr[0][0];
		magicSqr[0][0] = magicSqr[half][0];
		magicSqr[half][0] = temp;
		
		temp = magicSqr[half - 1][0];
		magicSqr[half - 1][0] = magicSqr[n - 1][0];
		magicSqr[n - 1][0] = temp;
		
		//change in 1 column
		for(int i = 1; i < half - 1; i++) {
			temp = magicSqr[i][1];
			magicSqr[i][1] = magicSqr[half + i][1];
			magicSqr[half + i][1] = temp;
		}
		
		//change in center columns
		int countOfChange;
		int column1;
		int column2;
		countOfChange = half - 3;
		while(countOfChange != 0) {
			column1 = half - (countOfChange / 2);
			column2 = half + (countOfChange / 2) - 1;
			for(int i = 0; i < half; i++) {
				temp = magicSqr[i][column1];
				magicSqr[i][column1] = magicSqr[half + i][column1];
				magicSqr[half + i][column1] = temp;
				
				temp = magicSqr[i][column2];
				magicSqr[i][column2] = magicSqr[half + i][column2];
				magicSqr[half + i][column2] = temp;
			}
			countOfChange -= 2;
		}

		
		return magicSqr;
	}
	
	
//////////////////////////////////////////////////////////////
///////////////////////MAIN///////////////////////////////////
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Input size of the magic square: ");
        n = in.nextInt();
        while(n < 3) {
        	System.out.println("The size should be > 2: ");
        	System.out.print("Input size of the magic square: ");
        	n = in.nextInt();
        }        	
        in.close();
        
        int[][] magicSquare = new int[n][n];
    	if(n % 2 == 1)
    		magicSquare = oddMagicSquare(n);
    	if(n % 4 == 0)
    		magicSquare = evenEvenMagicSquare(n);
    	if(n % 4 == 2)
    		magicSquare = evenOddMagicSquare(n);
    	
    	PrintMatrix.print(magicSquare);
    	PrintMatrix.printSum(magicSquare);
	}
}