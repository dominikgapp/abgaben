package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import LinkedList.LinkedList;
  

class DoubleLinkedListTest {

	@Test
	void test() {
		
		LinkedList<Integer> llt = new LinkedList<>();
		LinkedList<String> ll = new LinkedList<>();
		
		
		//testen, ob addFront und addTail funktioniert.
		llt.addFront(2);
		llt.addFront(3);
		llt.addTail(1);
		
	   assertEquals(1,(int)llt.getValueBack(0));
	   assertEquals(2,(int)llt.getValueBack(1));
	   assertEquals(3,(int)llt.getValueBack(2)); 
	   
	   /*testen ob delete funktioniert. 
	   llt.delete(1);
	  assertEquals(3,(int)llt.getValueBack(1)); */
		
		/*testen, ob die getValue Befehle funktionieren. 
	   llt.addFront(6);
	   llt.addFront(9);
	   llt.addTail(4);
	  
	   assertEquals(4,(int)llt.getValueBack(0));
	   assertEquals(1,(int)llt.getValueBack(1));
	   assertEquals(2,(int)llt.getValueBack(2));
	   assertEquals(3,(int)llt.getValueBack(3));
	   assertEquals(6,(int)llt.getValueBack(4));
	   assertEquals(9,(int)llt.getValueBack(5));
	   
	   assertEquals(9,(int)llt.getValueFront(0));
	   assertEquals(6,(int)llt.getValueFront(1));
	   assertEquals(3,(int)llt.getValueFront(2));
	   assertEquals(2,(int)llt.getValueFront(3));
	   assertEquals(1,(int)llt.getValueFront(4));
	   assertEquals(4,(int)llt.getValueFront(5));
	   */
	   
		/*llt.addFront(1);
		llt.addFront(2);
		llt.addFront(3);
		
		
		llt.delete(0);
		assertEquals(2,(int)llt.getValueBack(0));*/
	   
	   ll.addFront("testtest");
	   ll.addFront("jhuiz");
	   
	   assertEquals("testtest",(String)ll.getValueBack(0));
		
		
		
	}
	

}
