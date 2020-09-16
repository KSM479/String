package com.flexon.javabasics;

public class WordCount {

	public static void main(String[] args) {
		String str = " My name is Kalpan    ";
		if (str == null || str.isEmpty()) {
			System.out.println(" This String is Empty");
		}
		else {
			String[] words = str.split("\\s+");
			System.out.println(" This String has " + words.length + " words");
		}
		

	}

}
