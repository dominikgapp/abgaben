
public class Main {

	
	public static void main (String [] args) {
		
		Tree baum = new Tree(); 
		
		baum.addValue(10);
		baum.addValue(20);
		baum.addValue(5);
		baum.addValue(3);
		baum.addValue(2);
		baum.addValue(30);
		baum.addValue(40);
		
		
		//Information im Programm
		System.out.println("ein Ergebniss von -1111 weißt darauf hin, dass der gesuchte Wert nicht vorhanden ist!");
		System.out.println();
		
		Node x = baum.getNode(20); 
		
		System.out.println(x.getValue());
		
		
		//Löschen
		baum.delete(20);
		
		Node y = baum.getNode(20);
		System.out.println(y.getValue());  
		
		Node z = baum.getNode(10).getBigger(); 
		System.out.println(z.getValue()); 
	}
}
