
import java.util.ArrayList;
import java.util.Random;

public class sortieren {

	public static ArrayList<Integer> zv (ArrayList<Integer> alist)
	{
		int a;
		int b; 
		
			
		for(int i=0; i<10; i++)
		{
			for (int j=0;j<9;j++)
			{
				if(alist.get(j) > alist.get(j+1))
				{
					a = alist.get(j); 
					b = alist.get(j+1); 
					
					alist.set(j, b);
					alist.set(j+1, a); 
				}
			}
			
 
		}
		
		return alist; 
	}
		
	public static void main(String[] args)
		{
		
		ArrayList<Integer> alist  = new ArrayList <Integer> ();
		
		Random r = new Random(); 
		
		for (int i = 0; i<10; i++)
		{
			alist.add(r.nextInt(50)); 
		}
		
		System.out.println(alist);
		zv(alist);
		System.out.println(alist);
	
		


	}


}
