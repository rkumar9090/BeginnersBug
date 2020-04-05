package com.geeks.example.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFileExample {

	public static void main(String[] args) {
		try {
			
			File file = new File("C://temp/sample.txt");
			FileInputStream fileInputStream = new FileInputStream(file);
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			
			// Converting input stream to buffer reader
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String temp = "";
			StringBuffer textFileContent = new StringBuffer();
			while ((temp = bufferedReader.readLine()) != null) {
				textFileContent.append(temp);
			}
			
			System.out.println(textFileContent);
			// In below line we are closing the bufferReader
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
