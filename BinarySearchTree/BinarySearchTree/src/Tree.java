
public class Tree {
	
	
	private Node head = null; 
	
	public Tree () {
		
	}
	
	public void addValue (int value)
	{
		//erstes Element 
		Node node = new Node(value);
		if (head == null) {
			head = node;
			return; 
		} 
		
		//weitere Elemente 
		Node tmp = head;
		while (true) {
			
			if (node.getValue() < tmp.getValue() && tmp.getSmaller() == null) {
				tmp.setSmaller(node);
				node.setPrevious(tmp);
				break; }
			
			if (node.getValue() > tmp.getValue() && tmp.getBigger() == null) {
				tmp.setBigger(node);
				node.setPrevious(tmp);
				break; }  
			
			if (node.getValue() < tmp.getValue() && tmp.getSmaller() != null) tmp = tmp.getSmaller(); 
			if (node.getValue() > tmp.getValue() && tmp.getBigger() != null) tmp = tmp.getBigger(); 
			
		}
		
		}
		
	
	public Node getNode (int value)
	{
		Node tmp = head; 
		Node fehler = new Node(-1111); 
		while (value != tmp.getValue())
		{
			if (value < tmp.getValue() && tmp.getSmaller()!= null) {
				tmp = tmp.getSmaller();
			} else if (value < tmp.getValue() && tmp.getSmaller() == null)
			{
				return fehler; 
			}
			
			
			if (value > tmp.getValue() && tmp.getBigger() != null) {
				tmp = tmp.getBigger();
			} else if (value > tmp.getValue() && tmp.getBigger() == null)
			{
				return fehler; 
			}
		}
		
		return tmp; 
	}
	
	public void delete(int value)
	{
		Node tmp = head;
		
		
		//Nach dem zu löschenden Element suchen. 
		while (value != tmp.getValue())
		{
			if (value < tmp.getValue())
			{
				tmp = tmp.getSmaller(); 
			}
			if (value > tmp.getValue())
			{
				tmp = tmp.getBigger(); 
			}
		}
		
		if (tmp.getBigger() == null && tmp.getSmaller()== null)
		{
			int a = tmp.getValue();
			tmp = tmp.getPrevious(); 
			if (tmp.getBigger().getValue() == a)
			{
				tmp.setBigger(null);
				return; 
			}
			
			if (tmp.getSmaller().getValue() == a)
			{
				tmp.setSmaller(null);
				return; 
			}
			
		}
		
		if (tmp.getBigger() == null && tmp.getSmaller() != null)
		{
			Node nach = tmp.getSmaller(); 
			tmp = tmp.getPrevious(); 
			
			tmp.setSmaller(nach);
			return; 	
		}
		
		if (tmp.getSmaller() == null && tmp.getBigger() != null)
		{
			Node nach = tmp.getBigger();
			tmp = tmp.getPrevious(); 
			
			tmp.setBigger(nach);
			return; 
		}
		
		
		if (tmp.getBigger() != null && tmp.getSmaller() != null)
		{
			rekursiv(tmp); 
		}
		
	
	}

	
	
	public void rekursiv (Node x)
	{ 
		
		/*//eine Node setzen auf die zu löschende Node 
		Node y = x; 
		
		//von der rechten Seite das kleinste Element suchen
		y = y.getBigger(); 
		while (y.getSmaller() != null)
		{
			y = y.getSmaller(); 
		}
		// y ist rechts das kleinste Element 
		
		int neuerWert = y.getValue(); 
		int loeschWert = x.getValue(); 
		
		x.setValue(neuerWert);
		y.setValue(loeschWert);
		*/
		
		x = x.getBigger(); 
		int count = 0; 
		
		
		while (x.getSmaller() != null)
		{
			x = x.getSmaller();
			count += 1; 
		}
		
		Node m = x; 
		
		
		for (int i = 0; i<= count; i++)
		{
			x = x.getPrevious(); 
		}

		
		
		
		
	}

	
}


	

		
 
