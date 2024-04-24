import java.util.Scanner;

public class ReverseNumber {
	
	public static void main (String args[]) {
		
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Num : - ");
	
	int num = sc.nextInt();
	int reverse=0;
	
	
	while (num!=0)
	{
		int digit  = num%10;
				reverse = digit + reverse*10;
				num = num/10;
	}
	System.out.println("reverse Num : - " + reverse);
	
	}

	

}
