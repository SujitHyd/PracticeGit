
public class PrimeNumber {

	public static void main(String[] args) {
		
		int a=11,c=0;
		
		//boolean flag = false;
		
		for (int j = 1; j<=a; j++) 
		{
			
			if (a%j==0) {
				c++;
			}
		}
		
		if(c<=2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("not Prime");
		}
		
	}
}
			
		

	


