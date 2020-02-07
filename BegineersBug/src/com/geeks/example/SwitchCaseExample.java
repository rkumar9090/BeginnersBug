package com.geeks.example;

public class SwitchCaseExample {

	public static void main(String[] args) {
		try {
			String language = "python";

			switch (language) {
			case "JAVA":
				System.out.println("Java is choosed");
				break;
			case "C++":
				System.out.println("C++ is choosed");
			case "python":
				System.out.println("Python is choosed");
				break;
			default:
				System.out.println("default");
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
