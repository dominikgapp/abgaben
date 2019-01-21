
public class Node {

	private int value; 
	private Node bigger = null; 
	private Node smaller = null;
	private Node previous =null; 
	
	public Node(int value)
	{
		this.value = value; 
	}
	
	public int getValue ()
	{
		return this.value; 
	}
	
	public void setValue(int x)
	{
		this.value = x; 
	}
	
	public Node getBigger()
	{
		return bigger; 
	}
	
	public Node getSmaller()
	{
		return smaller; 
	}
	
	
	public void setBigger (Node bigger)
	{
		this.bigger = bigger; 
	}
	
	
	public void setSmaller (Node smaller)
	{
		this.smaller = smaller; 
	}
	
	public Node getPrevious()
	{
		return previous; 
	}
	
	public void setPrevious(Node pre)
	{
		this.previous = pre; 
	}

}