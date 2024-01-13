package Jan12;

/**
 * 
 */
public class DiamondStarTest {
	public static void main(String[] args)
	{
		int sum=0;
		int a=12;
		int b = a%10;
		int c = a/10;
		
		for(int i=a; i>0;i/=10) {
			int lastDigit = i%10;
			sum+=lastDigit;
		}
		System.out.println(sum);
		
			
	}
		
}
