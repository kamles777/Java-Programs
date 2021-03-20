
public class InSort {
	public static void main(String[] args) {


		int item,j;

		int arr[]= {14,11,58,52,87,78};

		for (int i = 0; i < arr.length; i++) {

			item=arr[i];
			for ( j = i+1; j>=0 && arr[j]>item; j++) {

				arr[j+1]=arr[j]; //place arr[j] one level above
			}

			arr[j+1]=item;//place item arr[j+1]

		}
		for(int elements:arr)
		{
			System.out.print(elements+" ");
		}

	}
}
