package com.flexon.javabasics;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDEFDEF";
		Integer count = 0;
		String strlowercase = str.toLowerCase();
		for (int i = 0; i <str.length(); i++) {
			if (strlowercase.charAt(i) == 'a' || strlowercase.charAt(i) == 'e' ||strlowercase.charAt(i) == 'i' || strlowercase.charAt(i) == 'o' || strlowercase.charAt(i) == 'u' )
				count  = count + 1 ; 
		}
		System.out.println(count);
	}

}
