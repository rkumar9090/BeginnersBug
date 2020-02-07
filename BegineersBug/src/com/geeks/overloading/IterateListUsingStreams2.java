package com.geeks.overloading;

import java.util.ArrayList;
import java.util.List;

public class IterateListUsingStreams2 {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();
		Student student = null;

		student = new Student();
		student.setId(1);
		student.setName("Rajesh");
		student.setAddress("Chennai");
		studentList.add(student);

		student = new Student();
		student.setId(1);
		student.setName("Kumar");
		student.setAddress("Chennai");
		studentList.add(student);

		studentList.stream().forEach((x) -> System.out.println("Student Id is "+x.getId()+" Name is "+x.getName()));

	}

}
