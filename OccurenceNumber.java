import java.util.Iterator;
import java.util.Scanner;

public class OccurenceNumber {

	public static void main(String[] args) {
		
		
		Scanner Wsc = new Scanner(System.in);
		System.out.print("Enter the Word : ");
		String word = Wsc.next();
		
		
		Scanner Csc = new Scanner(System.in);
		System.out.print("Enter the character to find : ");
		char character = Csc.next().charAt(0);
		
		int count=0;
		
		for (int i = 0; i < word.length(); i++) {
			
			if (word.charAt(i)==character)
			{
				count++;
			}
			
		}
		System.out.println(count);
		
		
		
		
		
		
}
}

