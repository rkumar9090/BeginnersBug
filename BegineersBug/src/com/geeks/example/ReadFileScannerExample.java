package com.geeks.example;

import java.io.File;
import java.util.Scanner;

public class ReadFileScannerExample {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\temp\\sample.txt");
			
			Scanner scanner = new Scanner(file);
			StringBuffer textFileContent = new StringBuffer();
			while (scanner.hasNextLine()) {
				textFileContent.append(scanner.nextLine());
			}
			System.out.println(textFileContent);
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
