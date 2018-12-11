
public class Note {

	private int value; 
	private Note next = null; 
	
	public Note(int value)
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
	
	public Note getNext()
	{
		return next; 
	}
	
	public void setNext (Note next)
	{
		this.next = next; 
	}
}

