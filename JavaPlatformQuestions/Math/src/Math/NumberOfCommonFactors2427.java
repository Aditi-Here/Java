package Math;

public class NumberOfCommonFactors2427 {
	public static void main(String[] args)
	{
		int num = 199;
		int sum = 0;
		for(int i=num; i>0;i/=10)
		{
			sum= sum+i%10;
			
		}
		System.out.println(sum);
		int count=0;
		if(sum/10 >0) {
			
			for(int i=sum; i>0;i/=10)
			{
				count+=i%10;
				
			}
			
		}
		System.out.println(count);
	}

}
