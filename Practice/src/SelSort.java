
public class SelSort {
	public static void main(String[] args) {
		int temp;
		int a[]= {45,25,58,21,89,78,96,9};
		for (int i = 0; i < a.length-1; i++) {
			int	min=i;
			for (int j = i+1; j < a.length; j++) {
				if (a[j]<a[min]) {
					min=j;//searching for min index value


				}

			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;


		}
		for (int i : a) {
			System.out.print(i+" ");
		}

	}

}
