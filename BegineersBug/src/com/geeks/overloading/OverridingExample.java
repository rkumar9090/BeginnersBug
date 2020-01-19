package com.geeks.overloading;

class SuperClass {

	public void print(String printText) {
		System.out.println("Super Class: " + printText);
	}
}

class ChildClass extends SuperClass {

	@Override
	public void print(String printText) {
		System.out.println("Child Class : " + printText);
	}

}

public class OverridingExample {
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.print("GeeksCoding");
	}
}
