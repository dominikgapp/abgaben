
public class Main {

	
	public static void main (String[] args) {
		
		LinkedList<Integer> lli = new LinkedList<>(); 
		
		lli.addFront(5);
		lli.addFront(8);
		lli.addFront(3);
		
		for (int i= 0; i<3; i++)
		{
			System.out.println(lli.getV(i)); 		
		}
	
	}
}
