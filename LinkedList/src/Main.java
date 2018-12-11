
public class Main {
	
	static public void main (String[] args) {
		
		LinkedList ll = new LinkedList(); 
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
			
		
		System.out.println("Alle Elemente der LinkedList");
				
		for (int i=0; i<5; i++)
		{
			System.out.println(ll.getV(i));
		}
		
		ll.delete(2);	//zweites Element löschen.
		
		System.out.println("");
		
		System.out.println("Liste nach Löschen von Element 2");
		//neu ausgeben aber for-Schleife ändern, da man nur mehr 4 Elemente hat!
		for (int i=0; i<4; i++)
		{
			System.out.println(ll.getV(i));
		}
	
	
			
	}

}
