package Jan22;
import java.util.Scanner;


public class StringBasics {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	String str=" ";
	String str1 = "I like rain";
	String str2 = new String("But I got cold easily.");
	
	System.out.println(str);
	System.out.println(str1);
	System.out.println(str2);
	
//	 taking input
	str = sc.next();
	System.out.println(str);
	
	str1 = sc.nextLine();
	System.out.println(str1);

	}

}
