import java.util.Scanner;

public class PerfectNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;int i=1;
		while(i<=n/2)
		{
			if(n%i==0)
				sum=sum+i;
			i++;
		}
		if(sum==n) {
			System.out.println("no is perfect");
		}
		else

			System.out.println("no is not perfect");

	}
}


