package Jan13;
import java.util.Arrays;
public class arrayBasic {
	public static void main(String[] args) {
		int arr[] = new int[5];
		int arr1[] = {1,2,3,4,5,6};
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println(" ");
		int a[] = new int[5];
		Arrays.fill(a , 1);
		System.out.println(Arrays.toString(a));
		for(int i : arr1) {
			System.out.println(i);
		}
	}

}
