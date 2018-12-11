
public class aendern {
	
	
	public static void modifyObject(DtContainer c)
	{
		c.c= 4; 
		c.s= "hallo"; 
	}
	
	public static void modifyPrimitive(int a)
	{
		a= 5; 
	}
	
	
	public static void modifyString (String s)
	{
		s="hallo"; 
	}
	
	public static void modifyPrimitiveInteger(int a)
	{
		a= 5; 
	}
	
	public static void main (String [] args)
	{
		DtContainer d = new DtContainer (0,"h"); 
		modifyObject(d); 
		System.out.println(d);
		
		int a = 8; 
		modifyPrimitive(a); 
		System.out.println(a);
		
		String s = "h"; 
		modifyString(s); 
		System.out.println(s);
		
		Integer e = new Integer(9); 
		modifyPrimitiveInteger(e); 
		System.out.println(e);		
	}

}
