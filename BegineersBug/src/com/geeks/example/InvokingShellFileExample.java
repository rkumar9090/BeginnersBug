package com.geeks.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InvokingShellFileExample {

	public static void main(String[] args) {
		try {

			Process exec = Runtime.getRuntime().exec("C://script//shellscript.bat");
			// below line will wait to execute the command
			exec.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
