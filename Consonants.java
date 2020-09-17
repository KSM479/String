package com.flexon.javabasics;

import java.util.Scanner;

public class Consonants {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input here: ");
		String str = sc.nextLine();
		Integer count = 0;
		String strlowercase = str.toLowerCase();
		String newstr = "";
		for (int i = 0; i <str.length(); i++) {
			if (strlowercase.charAt(i) == 'a' || strlowercase.charAt(i) == 'e' ||strlowercase.charAt(i) == 'i' || strlowercase.charAt(i) == 'o' || strlowercase.charAt(i) == 'u' || strlowercase.charAt(i) == ' ')
			{
				newstr = newstr + str.charAt(i);
			} 
			else if(strlowercase.charAt(i) >='a' && strlowercase.charAt(i) <='z') {
				count = count + 1;
				newstr = newstr + '*';
			}
		}
		System.out.println("The number of Consonants in the given String are: " + count);
		System.out.println(newstr);
	}

}
