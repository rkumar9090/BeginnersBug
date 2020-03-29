package com.geeks.example;

import java.io.FileOutputStream;
import java.util.Properties;

public class WriteProperties {

	public static void main(String[] args) {
		try {
			Properties properties = new Properties();
			properties.setProperty("database.url", "jdbc:mysql://localhost:3306/beginnersbug");
			properties.setProperty("database.username", "root");
			properties.setProperty("database.password", "password");
			properties.store(new FileOutputStream("database.properties"), "Comments: Updated from java");
			System.out.println("File has writen successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
