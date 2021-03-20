import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		int sum=0,rem=0,count=0;float avg=0;
		do {
			rem=n%10;//give the reminder(digit)
			sum=sum+rem;
			n=n/10;//give the number except last digit
			count++;
			 avg=sum/count;

		} while (n!=0);
		System.out.println(sum);
		System.out.println("no of digits =" +count);
		System.out.println("avg of digits ="+avg);

	}

}
