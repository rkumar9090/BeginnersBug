package com.geeks.example;

import java.util.ArrayList;
import java.util.List;

public class ForEachExampleUsingStreams {

	public static void main(String[] args) {
		try {

			List<Student> studentList = new ArrayList<Student>();
			Student student = null;

			student = new Student();
			student.setId(1);
			student.setName("Rajesh");
			student.setAddress("Mumbai");
			studentList.add(student);

			student = new Student();
			student.setId(1);
			student.setName("Kumar");
			student.setAddress("Chennai");
			studentList.add(student);

			studentList.stream()
					.forEach(x -> System.out.println("Name is " + x.getName() + " Address is " + x.getAddress()));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
