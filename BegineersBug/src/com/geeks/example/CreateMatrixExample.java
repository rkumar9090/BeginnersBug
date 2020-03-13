package com.geeks.example;

public class CreateMatrixExample {
	public static void main(String[] args) {
		try {

			// Creating 2x2 matrix
			int a[][] = { { 1, 2 }, { 2, 4 } };

			// printing above 2d array in matrix format
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
