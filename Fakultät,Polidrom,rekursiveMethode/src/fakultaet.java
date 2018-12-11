import java.util.ArrayList;

public class fakultaet {

	public static int fac (int n)
	{
		int ergebnis = 1;
	
		for (int i=1; i<=n; i++)
		{
			ergebnis = ergebnis *i; 
		}
		
		return ergebnis; 
	}
	
	public static boolean isPolidrom (String s)
 	{

		ArrayList<String> wort1 = new ArrayList<String>(); 
		ArrayList<String> wort2 = new ArrayList<String>(); 
		
		for (int i=0; i<s.length();i++)
		{
			wort1.add(String.valueOf(s.charAt(i))); 
		}
		
		
		for (int i=s.length()-1; i>0; i--)
		{
			wort2.add(String.valueOf(s.charAt(i))); 
		}
		
		if (wort1.equals(wort2) )
		{
			return true; 
		}else {
			return false; 
		}
		 
	}
	
	public static boolean rekrusivPolidrom (String s)
	{
		/* eine rekrusive Funktion zeichnet sich durch folgende Punkte aus: 
		 * --> sie hat eine Abbruchbedingung 
		 * --> sie wird selbst aufgeruft 
		 * --> die Parameter werden beim Selbstaufruf verändert*/
		
		
		// --> die 2 Abbruchbedingungen
		if (s.length()==1 || s.length() == 0)
		{
			return true; 
		}
		if (s.charAt(0) != s.charAt(s.length()-1))
		{
			return false; 
		}
		
		return rekrusivPolidrom(s.substring(1, s.length()-1)); 
		
	}
	
	
	public static void main (String [] args)
	{
		System.out.println(fac(5)); 
		
		System.out.println(isPolidrom("otto")); 
		
		System.out.println(rekrusivPolidrom("otto"));
	}
}
