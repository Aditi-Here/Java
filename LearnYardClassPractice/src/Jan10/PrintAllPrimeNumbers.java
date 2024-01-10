package Jan10;
import java.util.Scanner;
public class PrintAllPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int num=1;num<=number;num++)
		{
//			check if num is prime
			boolean isPrime = true;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}		
			
//			if yes then print it.
			if(isPrime) {
				System.out.println(num);
			}
		}
	}
}
