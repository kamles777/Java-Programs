package collection;

import java.util.Scanner;

public class WordReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		String str[]=st.split(" ");
		for (int i =  str.length-1; i >=0; i--) {
			System.out.println(str[i]);

		}

	}

}
