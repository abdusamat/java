package com.startjava.dog;

public class Dog {
	private String name;
	private int age;
	private String gender;
	private float weight;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void bark() {
		System.out.println("Bark! Bark! Bark!");
	}

	public void sleep() {
		System.out.println("ZZZzzz...");
	}

	public void eat(String nameFood) {
		if (nameFood == "Whiskas") {
			System.out.println("R-R-R-R-R");
		} else if (nameFood == "Bread") {
			bark();
		} else if (nameFood == "Chappi") {
			bark();
			bark();
			bark();
		} else {
			System.out.println("AF-AF-AF");
		}
	}
}