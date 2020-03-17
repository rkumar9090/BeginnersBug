package com.geeks.example;

public class MatrixMultiplication {

	public static void main(String[] args) {
		try {

			int a[][] = { { 50, 60 }, { 20, 15 } };
			int b[][] = { { 25, 20 }, { 10, 5 } };

			// Declaring the diff matrix
			int[][] mul = new int[a.length][b.length];

			// multiply 2 matrices
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					mul[i][j] = 0;
					for (int k = 0; k < 2; k++) {
						mul[i][j] += a[i][k] * b[k][j];
					}
					System.out.print(mul[i][j] + " ");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
