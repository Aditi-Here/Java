package Jan10;
import java.util.Scanner;

public class PrimeNumbers {
	static boolean isPrime(int n) {
		if(n<=1) return false;
		for(int i = 2; i<n/2; i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int input_number = sc.nextInt();
		boolean ans = test.isPrime(input_Number);
		System.out.println(ans);
	}

}
