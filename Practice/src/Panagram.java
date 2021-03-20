import java.util.Scanner;

public class Panagram {
	public static void main(String[] args) {
		int arr[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		char[] y=st.toCharArray();
		st=st.replace(" ", "");
		int size=st.length();
		if(size>26)
		{
			System.out.println("not panagram");
		}

		int i=0;
		while (i!=size) {

			int index=y[i]-65;
			arr[index]=1;
			i++;

		}
		int j=0;
		while (i!=26) {

			if (arr[i]==1) 

			{
				i++;
			}
			else {
				System.out.println("not panagram");
			}

		}
		System.out.println("panagram");

	}

}
