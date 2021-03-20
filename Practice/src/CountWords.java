import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		String y[]=	st.split(" ");
		System.out.println("no of words" + y.length);

	}

}
