package by.epam.mtv.task4;

public class PrintMatrix {
	
	
	public static void Print(double[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0 ; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "  " );
			}
			System.out.println();
		}
	}
	
	
	public static void Print(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0 ; j < matrix[0].length; j++) {
				System.out.printf ("% 5d", matrix[i][j] );
			}
			System.out.println();
		}
	}
	
	public static void PrintSum(int [][]matrix) {
		int sum;
		
		//Sum in rows
		System.out.println("Sum in rows");
		for(int i = 0; i < matrix.length; i++) {
			sum = 0;
			for(int j = 0; j < matrix.length; j++)
				sum += matrix[i][j];
			System.out.println(i + " : " + sum);	
		}
		//System.out.println();
		
		//Sum in columns
		System.out.println("Sum in columns");
		for(int j = 0; j < matrix.length; j++) {
			sum = 0;
			for(int i = 0; i < matrix.length; i++)
				sum += matrix[i][j];
			System.out.println(j + " : " + sum);	
		}
		//System.out.println();
		
		//Sum in main diagonal
		System.out.print("Sum in main diagonal : ");
		sum = 0;
		for(int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
		}
		System.out.println(sum);
		//System.out.println();
		
		//Sum in side diagonal
		System.out.print("Sum in side diagonal : ");
		sum = 0;
		for(int i = 0; i < matrix.length; i++) {
			sum += matrix[i][matrix.length - i - 1];
		}
		System.out.println(sum);
		//System.out.println();
		
	}
	
}
