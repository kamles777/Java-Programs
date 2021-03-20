import java.util.Scanner;

public class CountWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		String st1[]=st.split(" ");
		System.out.println(st1.length);
	}

}
