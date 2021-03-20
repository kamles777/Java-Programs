package collection;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		str=str.toUpperCase();
		char ch[]=str.toCharArray();
		int size=str.length();
		int vowCnt=0;
		int conCnt=0;
		int splCnt=0;
		int i=0;
		while (i!=size) {
			if (ch[i]>='A'&&ch[i]<='Z') {
				if (ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='I'||ch[i]=='U') {
					vowCnt++;
				}
				else {
					conCnt++;
				}
			}
			else {
				splCnt++;
			}
			i++;
		}
		System.out.println("no of vowels= "+vowCnt);
		System.out.println("no of consonants= "+conCnt);
		System.out.println("no of special digits= "+splCnt);

	}

}