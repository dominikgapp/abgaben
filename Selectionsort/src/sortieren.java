import java.util.ArrayList;
import java.util.Random;

public class sortieren {
	
	public static ArrayList<Integer> sortieren1 (ArrayList<Integer> alist)
	{
		ArrayList<Integer> sortiertesArray = new ArrayList<Integer>();  
		int minimum = alist.get(0); 
		int in=0;
	
	while(alist.size()>0)
	{
		
		in=0;
		minimum=alist.get(0);
		for (int i = 0; i < alist.size(); i++)
		{
			if (minimum > alist.get(i))
			{
					minimum = alist.get(i); 
					in=i;
				 
			}
		}
		alist.remove(in);
		
		sortiertesArray.add(minimum); 
		
	}
			
		
		return sortiertesArray; 
	}
	
	public static ArrayList<Integer>zufall (int size, ArrayList<Integer> list)
	{
		Random r = new Random(); 
		
		for (int i= 0; i<=size; i++)
		{
			list.add(r.nextInt(100)); 
		}
		
		
		
		return list; 
	}
	
	
	public static void main(String[] args)
	{
		
		long starttime; 
		long laufzeit; 

	ArrayList<Integer> alist  = new ArrayList <Integer> ();
	
	
	
	Random r = new Random(); 
	
	for (int i = 0; i<10; i++)
	{
		alist.add(r.nextInt(50)); 
	}
	

	starttime = System.nanoTime(); 
	System.out.println(sortieren1(alist));
	
	

	
	zufall(100,alist);
	starttime = System.nanoTime(); 
	System.out.println(sortieren1(alist));
	laufzeit= System.nanoTime()-starttime; 
	
	System.out.println(laufzeit);
	


}
}
