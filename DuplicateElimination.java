import java.util.ArrayList;

public class DuplicateElimination {

	public static void main(String[] args) {


		
		int a[]= {3,5,6,3,7,7,2};
		
		
		ArrayList<Integer> ab = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			
			int k=0;
			
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				
				for (int j = i+1; j < a.length; j++) {
					
					if(a[i]==a[j]) {
						
						
						k++;
					}
					
					
				}
				System.out.println(a[i] + "......."+k);
				
			}
			
			
		}
		
		

	}

}
