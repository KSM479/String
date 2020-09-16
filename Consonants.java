package com.flexon.javabasics;

public class Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDEFDEF";
		Integer count = 0;
		String strlowercase = str.toLowerCase();
		String newstr = "";
		for (int i = 0; i <str.length(); i++) {
			if (strlowercase.charAt(i) == 'a' || strlowercase.charAt(i) == 'e' ||strlowercase.charAt(i) == 'i' || strlowercase.charAt(i) == 'o' || strlowercase.charAt(i) == 'u' )
			{
				newstr = newstr + str.charAt(i);
			} 
			else if(strlowercase.charAt(i) >='a' && strlowercase.charAt(i) <='z') {
				count = count + 1;
				newstr = newstr + '*';
			}
		}
		System.out.println(count);
		System.out.println(newstr);
	}

}
