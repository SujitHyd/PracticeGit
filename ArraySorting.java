
public class ArraySorting {

	public static void main(String[] args) {
		
		int a[] = {2,15,1,9,13,8,14};
		int temp=0;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
				
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
		}

	}

}
