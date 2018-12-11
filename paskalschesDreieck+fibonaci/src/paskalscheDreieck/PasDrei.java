package paskalscheDreieck;

public class PasDrei {
	
	public static int pd (int z, int i)
	{
		
		if (i == 0)
		{
			return 1; 
		}
		
		if (z == i)
		{
			return 1; 
		}
		
		
		return pd(z-1,i-1) + pd(z-1,i); 
		
	}

	
	
	public static int fibo (int i)
	{
		if (i == 1 || i == 0)
		{
			return 1; 
		}
		
		return fibo(i-2) + fibo(i-1); 
	}
	
	public static void main (String[]args)
	{
		System.out.println(pd(4,2));
		System.out.println(fibo(5)); 
	}
}
