import java.util.Scanner;

public class lowToUp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		
		char y[]=st.toCharArray();
		int size=st.length();
		 y[0]=(char)(y[0]-32);
		 int i=1;
		 while (i!=size) {
			 
			 if (y[i]==' ') {
				 
				 y[i+1]=(char)(y[i+1]-32);
				
			}
			 i++;
			
		}
		 System.out.println(y);
		
	}

}
