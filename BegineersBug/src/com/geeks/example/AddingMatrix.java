package com.geeks.example;

public class AddingMatrix {

	public static void main(String[] args) {
		try {

			int a[][] = { { 54, 67 }, { 45, 56 } };
			int b[][] = { { 25, 56 }, { 85, 96 } };

			// Declaring the sum matrix
			int[][] sum = new int[a.length][b.length];

			// Adding two matrix
			for (int i = 0; i < a.length; i++) {

				for (int j = 0; j < b.length; j++) {
					sum[i][j] = a[i][j] + b[i][j];
				}
			}

			// Printing the sum matrix
			for (int i = 0; i < sum.length; i++) {
				for (int j = 0; j < sum[i].length; j++) {
					System.out.print(sum[i][j] + " ");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
