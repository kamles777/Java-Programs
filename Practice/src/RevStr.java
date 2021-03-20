import java.util.Scanner;

public class RevStr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		char y[]=st.toCharArray();
		int size=st.length();
		char a[]=new char[size];
		int i=0;
		while (i!=size) {

			a[size-1-i]=y[i];
			i++;


		}		
		System.out.println(a);

	}

}
