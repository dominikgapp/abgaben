package LinkedList;

public class Node <T>{
	
	private T value; 
	private Node<T> next = null; 
	private Node<T> previous = null;
	
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
	
	public Node<T> getPrevious()
	{
		return previous; 
	}
	
	public void setPrevious (Node<T> previous)
	{
		this.previous = previous; 
	}

}
