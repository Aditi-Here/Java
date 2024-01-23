package Jan22;
import java.util.Scanner;

public class CheckForPalindromeString {
	public static void main(String[] args)
	{
     // reverse of the string should be same as the string itself.
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		
		int i=0, j= inputStr.length();
		
		String ans = "yes";
		
		while(i<=j)
		{
			if(inputStr.charAt(i) != inputStr.charAt(j))
			{
				ans = "no";
				break;
			}
			i++;
			j--;
		}
		System.out.println(ans);
	}

}
