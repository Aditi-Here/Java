package Jan12;

public class DiamondStar {

	public static void main(String[] args)
	{
		int N = 5;
		int numStars = 1;
		for(int row=1; row<=N; row++)
		{
			for(int sp=0; sp<=(N-(row+1)) ; sp++)
				System.out.print(" ");
			for(int col=1;col<=numStars;col++)
				System.out.print("*");
			System.out.println(" ");
			numStars+=2;		
		}
		numStars = 2*(N-1) -1;
		for(int row=N-1; row>=1; row--)
		{
			for(int sp=1; sp<=N-row; sp++)
				System.out.print(" ");
			for(int col=1; col<=numStars; col++)
				System.out.print("*");
			System.out.println(" ");
			numStars-=2;
		}
	}
}
