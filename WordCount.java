package com.flexon.javabasics;

import java.util.Scanner;

// This code uses isBlank function which was added on Java 11. Hence, it may not work for versions 10 and below. 
public class WordCount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input here: ");
		String str = sc.nextLine();
		if (str == null || str.isEmpty()) {
			System.out.println(" This String is Empty");
		}
		else {
			String[] words = str.split("\\s+");
			int count = 0;
			for (int i = 0; i < words.length; i++ ) {
				if(words[i] == null || words[i].isBlank()) {
					count = count;
				}
				else {
					count = count + 1;
				}
			}
			System.out.println("This String has " + count + " words");
		}
		

	}

}
