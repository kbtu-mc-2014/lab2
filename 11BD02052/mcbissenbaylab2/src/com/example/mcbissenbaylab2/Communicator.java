package com.example.mcbissenbaylab2;

public class Communicator {
	private static int category;
	private static int title;
	public static void setCategory(int category) {
		Communicator.category = category;
	}
	public static int getCategory() {
		return category;
	}
	public static void setTitle(int category) {
		Communicator.title = category;
	}
	public static int getTitle() {
		return title;
	}
}
