import java.util.Scanner;

public class AmstrongNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		int sum=0,rem=0,t=n;
		do {
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;

		} while (n!=0);
		if(sum==t)
			System.out.println("no is amstrong");
		else
			System.out.println("no is not amstrong");
	}

}
