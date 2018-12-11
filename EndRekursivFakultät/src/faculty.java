
public class faculty {
	
	
	public static int facE(int a, int b)
	{
		if (a == 0)
		{
			return b; 
		}
		
		if (b<0)
		{
			return 0; 
		}
		
		
		return facE(a-1,a*b);
	}
	
	public static int fac(int i)
	{
		if (i == 1)
		{
			return 1; 
		}
		
		return fac(i-1)*i; 
	}
	
	public static void main (String [] args)
	{
		long startzeit; 
		startzeit = System.nanoTime(); 
		System.out.println(facE(5,1));
		startzeit = System.nanoTime() - startzeit; 
		System.out.println(startzeit);
		
		startzeit = System.nanoTime();
		System.out.println(fac(5));
		startzeit = System.nanoTime() - startzeit; 
		System.out.println(startzeit);
	}

}

