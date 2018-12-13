import java.util.ArrayList;

public class tuerme {
	
	
	public static void printStatus(ArrayList<Integer> src, ArrayList<Integer> aux, ArrayList<Integer> target)
	{
		System.out.println(src);
		System.out.println(aux); 
		System.out.println(target); 
	}
	
	public static void move (int n, ArrayList<Integer> src, ArrayList<Integer> aux, ArrayList<Integer> target)
	{
		if (n==0) return;
		
		move (n-1,src,target,aux);
		//printStatus(src,aux,target); 
		target.add(src.remove(src.size()-1));
		//printStatus(src,aux,target); 
		move (n-1, aux,target,src); 
		//printStatus(src,aux,target); 
	}
	
	
	public static void main (String [] args)
	{
		int n = 3; 
		
		ArrayList<Integer> src = new ArrayList<Integer>();
		ArrayList<Integer> aux = new ArrayList<Integer>();
		ArrayList<Integer> target = new ArrayList<Integer>();
	
		for (int i = n; i>=1; i--)
		{
			src.add(i); 
		}
		

		move(n,src,aux,target); 
		System.out.println(target);

	
	}

}
