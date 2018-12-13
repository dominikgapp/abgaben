package LinkedList;
public class Main {

	
	public static void main (String[] args) {
		
		LinkedList<Integer> lli = new LinkedList<>(); 
		LinkedList<String> lls = new LinkedList<>(); 
		
		lli.addFront(5);
		lli.addFront(8);
		lli.addFront(3);
		lli.addFront(9);
		
		lls.addFront("Hallo!");
		lls.addTail("DVDSIUV");
		
		for (int i=0; i<2;i++)
		{
			System.out.println(lls.getValueBack(i));
		}
		
		
	/*Back ist links!! 
		[1,2,3,4,5,6]  
		getValueBack --> 
		getValueFront <-- */
		
		
		for (int i= 0; i<4; i++)
		{
			System.out.println(lli.getValueBack(i)); 		
		}
		System.out.println("");
		
		System.out.println(lli.getValueFront(2));
		System.out.println(lli.getValueBack(2));
	
	}
}
