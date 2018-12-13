package LinkedList;

public class LinkedList <T>{

private Node<T> head = null; 
private Node<T> pre = null; 
	
	
	public LinkedList ()
	{
	
	}
	
	
	
	public void addFront (T value)
	{
		Node<T> node = new Node<>(value);
		//list is empty
		if (head == null) {
			head = node;
			pre = node; 
			return; 
		} 
		
		//list has one element
		/*if (head.getNext() == null) {
			head.setNext(node);
			
			return; 
		} 
		*/
		
		Node<T> tmp = head; 
		while (tmp.getNext() != null)
		{
			tmp = tmp.getNext(); 
		}
		tmp.setNext(node);
		node.setPrevious(tmp);
		pre = node; 
		
		
	}
	
	
	public void addTail (T value)
	{
		Node<T> node = new Node<>(value); 
	
		if (pre == null) {
			head = node; 
			pre = node; 
			return; 
		}
		
		Node<T> tmp = pre; 
		while (tmp.getPrevious()!= null) {
			tmp = tmp.getPrevious(); 
		}
		tmp.setPrevious(node);
		node.setNext(tmp);
		head = node; 
	
	}
	
	
	public T getValueBack(int index)
	{
		Node<T> gv = head; 
		for (int i=0; i<index; i++)
		{
			gv = gv.getNext(); 
		}
		
		return gv.getValue(); 
	}
	
	public T getValueFront (int index)
	{
		Node<T> fv = pre;  
		for (int i= 0; i<index; i++)
		{
			fv = fv.getPrevious(); 
		}
		
		return fv.getValue(); 
	}
	
	public void delete (int index)
	{
		Node<T> del = head; 
		Node<T> dele = head;
		
		if (index == 0)
		{
			head = head.getNext(); 
		}else {
		
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
		nach.setPrevious(vor);
		}
		
	}
	
}

