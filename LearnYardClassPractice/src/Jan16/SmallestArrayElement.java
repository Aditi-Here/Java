package Jan16;
import java.util.Scanner;

public class SmallestArrayElement {

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
		int minNumber = Integer.MAX_VALUE;
		int secondMinMumber=Integer.MAX_VALUE;
		
//		for(int i : arr) {
//			if(i < minNumber) {
//				minNumber=i;
//			}
//		}
//		for(int i: arr) {
//			if(i<secondMinMumber && i>minNumber) {
//				secondMinMumber=i;
//			}
//		}
		
		for(int i=0; i<N; i++) {
			if(arr[i] < minNumber) {
				secondMinMumber = minNumber;
				minNumber = arr[i];
			}
			else if(arr[i]!= minNumber && arr[i] < secondMinMumber) {
				secondMinMumber = arr[i];
			}
		}
		if(secondMinMumber == Integer.MAX_VALUE) {
			minNumber = -1;
			secondMinMumber = -1;
		}
		
		System.out.println("Smallest number is: "+minNumber);
		System.out.println("Second smallest number is: "+ secondMinMumber);
		
		
		sc.close();
	}
}
