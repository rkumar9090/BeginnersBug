package com.geeks.example;

public class Maths {

	/**
	 * Method with 2 input parameters
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public int sum(int x, int y) {
		return x + y;

	}

	/**
	 * method with 3 input parameters with same data type
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public int sum(int x, int y, int z) {
		return x + y + z;
	}

	/**
	 * Method with 3 input parameters with different data type
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public float sum(int x, int y, float z) {
		return x + y + z;
	}

	public static void main(String[] args) {
		Maths math = new Maths(); // Creating object
		int sum = math.sum(10, 10);// calling sum method with 2 input parameters
		int threeParameter = math.sum(10, 10, 10); // Calling sum method with 3 parameters
		float floatSum = math.sum(10, 20, 10.6F); // Calling sum method with different data types
		System.out.println("Result of 2 Parameters " + sum);
		System.out.println("Result of 3 Parameters " + threeParameter);
		System.out.println("Result of 3 Parameters with different data types " + floatSum);

	}

}
