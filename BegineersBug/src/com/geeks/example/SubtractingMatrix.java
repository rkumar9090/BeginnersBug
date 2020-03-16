package com.geeks.example;

public class SubtractingMatrix {

	public static void main(String[] args) {
		try {

			int a[][] = { { 50, 60 }, { 20, 15 } };
			int b[][] = { { 25, 20 }, { 10, 5 } };

			// Declaring the diff matrix
			int[][] diff = new int[a.length][b.length];

			// Subtracting two matrix
			for (int i = 0; i < a.length; i++) {

				for (int j = 0; j < b.length; j++) {
					diff[i][j] = a[i][j] - b[i][j];
				}
			}

			// Printing the diff matrix
			for (int i = 0; i < diff.length; i++) {
				for (int j = 0; j < diff[i].length; j++) {
					System.out.print(diff[i][j] + " ");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
