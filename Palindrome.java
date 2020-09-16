package com.flexon.javabasics;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCBA";
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
