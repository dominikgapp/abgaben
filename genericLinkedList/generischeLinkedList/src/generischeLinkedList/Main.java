package generischeLinkedList;

public class Main {
	
	public static void main (String [] args) {
		
		LinkedList<String> lls = new LinkedList <>(); 
		LinkedList<Integer> lli = new LinkedList<>(); 
		
		lls.add("Hello");
		lls.add("Generic");
		lls.add("joiejvk");
		
		for (int i= 0; i<3; i++)
		{
			System.out.println(lls.getV(i));
		}
		
		lli.add(3);
		lli.add(5);
		lli.add(8);
		
		lli.delete(1);
		
		for (int i= 0; i<2; i++)
		{
			System.out.println(lli.getV(i));
		}
		
	
	}
	
	

}