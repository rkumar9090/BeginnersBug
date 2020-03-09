package com.geeks.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ListAllFilesUsingJava8 {

	public static void main(String[] args) {
		try {
			Path path = Paths.get("F:/Java");
			Stream<Path> walk = Files.walk(path);
			walk.forEach(x -> System.out.println(x.getFileName()));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
