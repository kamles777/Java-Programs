package collection;

import java.util.Scanner;

public class PalindromeNo {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no you want to check for palindrome");
		 int x=sc.nextInt();
		 int temp=x,sum=0,rem;
		 while (x!=0) {
			 rem=x%10;
			 sum=sum*10+rem;
			 x=x/10;
			
		}
		 if (sum==temp) {
			 System.out.println("no is palindrome");
			
		} else {
			System.out.println("no is not palindrome");

		}
		 
	}

}
