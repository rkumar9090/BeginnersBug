package com.geeks.example;

import java.io.InputStream;
import java.util.Properties;

public class PrintPropertis {

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			InputStream stream = LoadPropertyFromClassPath.class.getResourceAsStream("database.properties");
			if (stream != null) {
				prop.load(stream);
				prop.keySet().stream().map(key -> key + ": " + prop.getProperty(key.toString()))
						.forEach(System.out::println);
			} else {
				System.err.println("Please check the file present in classpath");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
