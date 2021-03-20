package collection;

import java.util.Scanner;

public class EvOddDig {
	static int EvnCnt=0;
	static int OddCnt=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();


		while (x>0) {

			int rem=x%10;
			if (rem%2==0) 
				EvnCnt++;


			else
				OddCnt++;

			x=x/10;
		}


		System.out.println("no of even digits = "+ EvnCnt);
		System.out.println("no of odd digits = "+ OddCnt);

	}
}
