package Jan12;

public class RhombusSquarePattern {

	public static void main(String[] args)
	{
		int N = 5;
		for(int i=1; i<=N; i++)
		{
			for(int sp=1; sp<=(i-1);sp++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=N ; j++)
			{
				
				System.out.print("*");
			}
			System.out.println("");
			
		}
	}
}
