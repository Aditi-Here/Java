package Jan16;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
//		 Input for N element of the array
		for(int i=0; i<N ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int val:arr)
			System.out.print(" " +val);
		System.out.println(" ");
		for(int i=N-1; i>=0; i--) {
			System.out.print(arr[i]+ " ");
		}
		
		int temp = 0;
		for(int i=0; i<(N/2); i++) {
			temp = arr[N-1];
			arr[N-1]=arr[i];
			arr[i]=temp;
		}
		System.out.println();
		System.out.println(" Reversed array: ");
		for(int val:arr)
			System.out.print(" " +val);
	 }

}
