import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String : ");
	String word=sc.next();
	
	String NW=" ";
	
	for (int i = word.length()-1 ; i>=0; i--) {
		
		NW=NW+word.charAt(i);	
		
	}
	
	System.out.println("Original Word : " + word);
	System.out.println("Reverse Word : " + NW);
	
	if( NW.trim().equalsIgnoreCase(word))
	{
		System.out.println("Pallindrom");
		
	}
	else
	{
		System.out.println("Not Palindrom");
	}
	
	
	
}
}


