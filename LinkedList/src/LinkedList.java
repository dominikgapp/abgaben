
public class LinkedList {
	
	private Note head = null; 
	
	
	public LinkedList ()
	{
		
	}
	
	public void add (int value)
	{
		Note node = new Note(value);
		//list is empty
		if (head == null) {
			head = node;
			return; 
		} 
		
		//list has one element
		if (head.getNext() == null) {
			head.setNext(node);
			return; 
		}
		
		Note tmp = head; 
		while (tmp.getNext() != null)
		{
			tmp = tmp.getNext(); 
		}
		tmp.setNext(node);
	}
	
	
	public int getV (int index)
	{
		Note gv = head; 
		for (int i=0; i<index; i++)
		{
			gv = gv.getNext(); 
		}
		
		return gv.getValue(); 
	}
	
	
	public void delete (int index)
	{
		Note del = head; 
		Note dele = head; 
		
		for (int i= 0; i<index-1; i++)
		{
			del = del.getNext(); 
		}
		Note vor = del; 
		
		for (int j= 0; j<index; j++)
		{
			dele = dele.getNext(); 
		}
		Note nach = dele.getNext(); 
		
		vor.setNext(nach); 
	}
	

}
