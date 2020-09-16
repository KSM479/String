package com.flexon.javabasics;

public class LastLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My name is Kalpas";
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
			System.out.println(str1);
	}

}
