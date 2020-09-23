package helloworld_kalpan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestHelloWorld {
	
	public void testHelloWorld	() {
		assertTrue( true );
		System.out.println(" .. Hellow World ..");
	}
	@Test
	public void testSumMethod(){
		int result;
		result = App.sum(1, 1);
		
    	    assertEquals(2, result);
    	    System.out.println("Test sum 1 + 1 passed!!");
	}
	
	@Test
	public void testSumMethod1(){
		int result;
		result = App.sum(2, -1);
		
    	    assertEquals(1, result);
    	    System.out.println("Test sum 2 + -1 passed!!");
	}

}
