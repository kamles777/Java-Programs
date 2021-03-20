
public class BubSort {

	public static void main(String[] args) {
		int temp;
		int a[]= {56,25,14,85,89,69,98,11};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {

					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}

			}
		}
		for (int j = 0; j < a.length; j++) {

			System.out.println(a[j]);
		}

	}

}
