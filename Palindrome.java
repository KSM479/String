package com.flexon.javabasics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input here: ");
		String str = sc.nextLine();
		if (str==null || str.isEmpty()) {
			System.out.println("Run this code again and input a string.");
		}
		else {
		String palstr= "";
		
		for (int i = str.length()-1; i >= 0;i--) {
			palstr =  palstr +str.charAt(i); 
		}
		if (palstr.equals(str)) {
			System.out.println("Its a Palindrome ");
			
			
			
		}
		else {
			System.out.println("Not a palindrome");
			
		}
		}
	}

}
