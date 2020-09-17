package com.flexon.javabasics;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input here: ");
		String s = sc.nextLine();
		if (s==null || s.isEmpty()) {
			System.out.println("Run this code again and input a string.");
		}
		else {
		Integer count = 0;
		String strlowercase = s.toLowerCase();
		for (int i = 0; i <s.length(); i++) {
			if (strlowercase.charAt(i) == 'a' || strlowercase.charAt(i) == 'e' ||strlowercase.charAt(i) == 'i' || strlowercase.charAt(i) == 'o' || strlowercase.charAt(i) == 'u' )
				count  = count + 1 ; 
		}
		System.out.println("Total number of vowels in this input string are: "+ count);
		}
	}

}
