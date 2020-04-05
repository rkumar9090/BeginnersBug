package com.geeks.example.files;

import java.io.File;
import java.text.SimpleDateFormat;

public class LastModifedDate {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Project.log");
		
			if (file.exists()) {
				long lastModified = file.lastModified();

				SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
				System.out.println(sdf.format(lastModified));

			} else {
				System.err.println("File path is not correct ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
