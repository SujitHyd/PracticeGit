
public class FibanocciSeries {
	
	//0,1,1,2,3,5,8,13,21,34,55...

	public static void main(String[] args) {
		
		int a=0,b=1,sum=0,i=0;
		while (i<10) {
			
			sum=a+b;
			System.out.print(sum + " ");
			a=b;
			b=sum;
			
			i++;
		}

	}

}
