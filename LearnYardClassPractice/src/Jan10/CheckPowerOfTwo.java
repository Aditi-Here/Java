package Jan10;
import java.util.Scanner;
public class CheckPowerOfTwo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number<=0)
		{
			System.out.println("false");
		}
		else {
			while(number%2==0) 
				number/=2;
			if(number==1)
				System.out.println("power of two");
			else
				System.out.println("false");
		}
		
	}
 }
