package generischeLinkedList;

public class LinkedList <T>{

private Node<T> head = null; 
	
	
	public LinkedList ()
	{
		
	}
	
	public void add (T value)
	{
		Node<T> node = new Node<>(value);
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
		
		Node<T> tmp = head; 
		while (tmp.getNext() != null)
		{
			tmp = tmp.getNext(); 
		}
		tmp.setNext(node);
	}
	
	
	public T getV (int index)
	{
		Node<T> gv = head; 
		for (int i=0; i<index; i++)
		{
			gv = gv.getNext(); 
		}
		
		return gv.getValue(); 
	}
	
	
	public void delete (int index)
	{
		Node<T> del = head; 
		Node<T> dele = head; 
		
		for (int i= 0; i<index-1; i++)
		{
			del = del.getNext(); 
		}
		Node<T> vor = del; 
		
		for (int j= 0; j<index; j++)
		{
			dele = dele.getNext(); 
		}
		Node<T> nach = dele.getNext(); 
		
		vor.setNext(nach); 
	}
	

}
