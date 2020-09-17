package com.flexon.javabasics;

import java.util.Scanner;

public class LastLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input here: ");
		String s = sc.nextLine();
		String str = s.toLowerCase();
		Integer wordlength = 0;
		Integer scount = 0;
		Integer ycount = 0;
		int switchcount = 0;
		String[] words = str.split("\\s+");
		int length = words.length;
		int[] sindex;
		int[] yindex;
		sindex = new int[length];
		yindex = new int[length];
		
			for (int i = 0 ; i < words.length;i++) {
				wordlength = words[i].length();
				if (words[i].charAt(wordlength - 1) == 's') {
					sindex[scount] = i;
					scount = scount + 1;
					
				}
				else if(words[i].charAt(wordlength - 1) == 'y') {
					yindex[ycount] = i;
					ycount = ycount + 1;
					
				}
				else if(words[i].charAt(wordlength - 1) < 'a' || words[i].charAt(wordlength - 1) > 'z') {
					for (int j = words[i].length()-1; j >=0 ; j--) {
						if(words[i].charAt(j ) < 'a' || words[i].charAt(j) > 'z') {
							continue;
						}
						else {
							if (words[i].charAt(j) == 's') {
								sindex[scount] = i;
								scount = scount + 1;
								break;
							}
							else if (words[i].charAt(j) == 'y') {
								yindex[ycount] = i;
								ycount = ycount + 1;
								break;
							}
							else {
								break;
							}
						}
					}
				}
			}
		if (scount > ycount) {
				String temp = words[yindex[switchcount]];
				words[yindex[switchcount]] = words[sindex[switchcount]];
				words[sindex[switchcount]] = temp;
		}
		else {
			String temp = words[yindex[switchcount]];
			words[yindex[switchcount]] = words[sindex[switchcount]];
			words[sindex[switchcount]] = temp;
		}
			
			
			String str1 = String.join(" ", words);
			System.out.println("S count =  " + scount + " Y count  = "+ ycount);
			   String s1 = str1.substring(0, 1).toUpperCase();
			    String nameCapitalized = s1 + str1.substring(1);
			    System.out.println(nameCapitalized);
	
	}

}
