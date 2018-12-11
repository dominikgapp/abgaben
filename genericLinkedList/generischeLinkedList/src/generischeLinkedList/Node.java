package generischeLinkedList;

public class Node <T> {

	private T value; 
	private Node<T> next = null; 
	
	public Node(T value)
	{
		this.value = value; 
	}
	
	public T getValue ()
	{
		return this.value; 
	}
	
	public void setValue(T x)
	{
		this.value = x; 
	}
	
	public Node<T> getNext()
	{
		return next; 
	}
	
	public void setNext (Node<T> next)
	{
		this.next = next; 
	}
}
