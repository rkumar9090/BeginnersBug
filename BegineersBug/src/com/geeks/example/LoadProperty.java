package com.geeks.example;

import java.io.FileReader;
import java.util.Properties;

public class LoadProperty {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("D:\\BB\\Workspace\\database.properties");

			Properties p = new Properties();
			p.load(reader);

			System.out.println(p.getProperty("database.url"));
			System.out.println(p.getProperty("database.username"));
			System.out.println(p.getProperty("database.password"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
