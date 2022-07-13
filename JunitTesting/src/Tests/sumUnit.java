package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumUnit {

	@Test
	public void test() {
		UnitTesting obj1 = new UnitTesting();
		int output = obj1.sum(4,6);
//Test the output
		assertEquals(10, output);	
	
	}

}
