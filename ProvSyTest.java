import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import system.*;

public class ProvSyTest extends TestCase {
	private ProvSy pro;
	
	@Override
	   protected void setUp() throws Exception {  
	        super.setUp();  
	        pro=new ProvSy();
	    }  
	@Test
	public void testnextNumber() {
		
		 assertEquals(pro.nextNumber,69);
		 System.out.println("Test0 Successfully!");
	}
	@Test
	public void testsize() {
		
		 assertEquals(pro.users.size(),6);
		 System.out.println("Test1 Successfully!");
	}
	@Test
	public void testnotnull() {
	
		assertNotNull(pro.users.get(0));
		 System.out.println("Test2 Successfully!");
	}
	@Test
	public void testnotequal(){
		assertNotEquals(pro.users.get(0).meter.get(0),pro.users.get(1).meter.get(0));
		 System.out.println("Test3 Successfully!");
	}

}
