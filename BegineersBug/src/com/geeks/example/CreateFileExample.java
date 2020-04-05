package com.geeks.example;

import java.io.File;

public class CreateFileExample {

	public static void main(String[] args) {
		try {
			File file = new File("C://temp//sample.txt");
			// .exists Method check if file already exists on the path
			if (!file.exists()) {
				// Below line will create file sample.txt on C://temp// folder
				file.createNewFile();
				System.out.println("File created succesfully !!");
			} else {

				System.err.println("File already exists");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
