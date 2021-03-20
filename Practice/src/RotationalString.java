import java.util.Scanner;

public class RotationalString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the original string");
		String st=sc.nextLine();
		System.out.println("enter the key string");
		String st1=sc.nextLine();
		String newString=st.concat(st);
		if (newString.contains(st1)) {
			System.out.println("Rotational String");

		} else {
			System.out.println("Non Rotational String");

		}

	}

}
