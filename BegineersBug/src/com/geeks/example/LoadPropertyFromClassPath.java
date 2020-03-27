package com.geeks.example;

import java.io.InputStream;
import java.util.Properties;

public class LoadPropertyFromClassPath {

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			InputStream stream = LoadPropertyFromClassPath.class.getResourceAsStream("database.properties");
			if (stream != null) {
				prop.load(stream);
				System.out.println(prop.getProperty("database.url"));
				System.out.println(prop.getProperty("database.username"));
				System.out.println(prop.getProperty("database.password"));
			} else {
				System.err.println("Please check the file present in classpath");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
