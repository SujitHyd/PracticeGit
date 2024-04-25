import java.util.ArrayList;

public class NewArray {
	
	// Compare same indexes of two different arrays and create another array of matching values

	public static void main(String[] args) {
		
		int a[] = {10,2,4,9,7};
		int b[] = {1,27,4,2,7};
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			
			
			if (a[i]==b[i])
			{
				
				al.add(a[i]);
				
				
			}
			
			
		}
		 Object[] obj = al.toArray();
			 for(Object Ob: obj)
			 {
				 System.out.println(Ob);
			 }
			
		}
			

	}


