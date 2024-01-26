package Math;
import java.util.Scanner;
public class PlusMinus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		char plus='+';
		char minus='-';
		for(int i=0;i<t;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a+b==c)
				System.out.println(plus);
			else
				System.out.println(minus);
		}
	}
}
