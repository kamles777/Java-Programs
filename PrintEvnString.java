package collection;

import java.util.Scanner;

public class PrintEvnString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		for (String str : st.split(" ")) {
			if (str.length()%2==0) {
				System.out.println(str);

			}

		}
	}

}
