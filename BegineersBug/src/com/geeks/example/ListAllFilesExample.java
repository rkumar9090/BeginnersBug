package com.geeks.example;

import java.io.File;

public class ListAllFilesExample {

	public static void main(String[] args) {
		try {

			File file = new File("F:\\Java");
			String[] list = file.list();
			for (String fileName : list) {
				System.out.println(fileName);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
