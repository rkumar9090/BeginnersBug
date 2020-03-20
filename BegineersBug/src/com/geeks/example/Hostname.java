package com.geeks.example;

import java.net.InetAddress;

public class Hostname {

	public static void main(String[] args) {
		try {

			String hostName = InetAddress.getLocalHost().getHostName();
			System.out.println(hostName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
