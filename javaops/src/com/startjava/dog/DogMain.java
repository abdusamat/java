package com.startjava.dog;

import java.util.Scanner;

public class DogMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Dog mydog = new Dog();
		mydog.setName(scanner.next());
		mydog.setAge(3);
		mydog.setColor("orange");

		mydog.eat("Bread");
		mydog.eat("Whiskas");
		mydog.eat("Chappi");

		System.out.println("My dog name" + mydog.getName());
	}
}