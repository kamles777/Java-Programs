import java.util.Scanner;

public class CountVow {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		st=st.toUpperCase();
		char y[]=st.toCharArray();
		
		int size=st.length();
		int vowCnt=0;
		int conCnt=0;
		int splCnt=0;
		int i=0;
		while (i!=size) {

			if(y[i]>='A'&& y[i]<='Z')
			{
				if(y[i]=='A'||y[i]=='E'||y[i]=='I'||y[i]=='O'||y[i]=='U')
				{
					vowCnt++;
				}
				else
					conCnt++;
			}

			else
			{
				splCnt++;

			}



			i++;

		}
		System.out.println("no of vowels ="+vowCnt);
		System.out.println("no of consonants ="+conCnt);
		System.out.println("no of special character ="+splCnt);

	}

}
