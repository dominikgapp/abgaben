import java.util.ArrayList;
import java.util.Random;

public class quicksort {
	
	
	static public Random rand = new Random(); 
	
	public static ArrayList<Integer> quicks (ArrayList<Integer> a)
	{ 
		System.out.println(a);
		ArrayList<Integer> g = new ArrayList<Integer>(); 
		ArrayList<Integer> k = new ArrayList<Integer>(); 

		if (a.size()<=1)
		{
			return a; 
		}
		
		 int pivot = (rand.nextInt(a.size())); 
		int anz=0; 
		
		for (int i = 0; i<=a.size()-1; i++)
		{
			if (a.get(i) < pivot)
			{
				k.add(a.get(i)); 
			}
			
			if (a.get(i) == pivot)
			{
				anz = anz +1; 
				if (anz>1) break; 
				g.add(a.get(i)); 
			}
			
			if (a.get(i) >= pivot)
			{
				g.add(a.get(i));
			}
		}
		
		//entweder Pivot element nur einmal hinzufügen oder den index merken und nicht den Wert; 
		
		
		a.clear();
		a.addAll(quicks(k)); 
		a.addAll(quicks(g)); 
		
		return a; 
		
		
	}
	
	
	
	
	public static void main (String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>(); 
		
		for (int i = 0; i<10; i++)
		{
			a.add(rand.nextInt(10)); 
		}
		
		System.out.println("unsortierte Liste");
		System.out.println(a);
		quicks(a); 
		System.out.println("sortierte Liste");
		System.out.println(a);
		
		
	}

}
