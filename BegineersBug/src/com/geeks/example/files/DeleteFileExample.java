package com.geeks.example;

import java.io.File;

public class DeleteFileExample {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\sample.txt");
			// Below if condition will check that file exists or not
			if (file.exists()) {
				boolean isDeleted = file.delete();
				if (isDeleted == true) {
					System.out.println("File deleted Successfully");
				} else {
					System.out.println("Not able to delete the file");
				}
			} else {
				System.err.println("File path is not correct");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
