import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTestStudent {

	private Plot p1, p2, p3, p4;

	@BeforeEach
	public void setUp() throws Exception {
		p1 = new Plot(0, 0, 2, 4);
		p2 = new Plot(1, 1, 4, 4);
		p3 = new Plot(5,5,3,3);
		p4 = new Plot(5,5,1,3);
		
	}

	@AfterEach
	public void tearDown() throws Exception {
		p1 = p2 = p3 = null;
	}

	@Test
	public void testOverlaps() {
		assertTrue(p1.overlaps(p2)); 
		
		assertEquals(p2.overlaps(p3), false);
		
	}
	
	
	@Test
	public void encompassesTest() {
		assertTrue(p3.encompasses(p4));
		
		assertEquals(p1.encompasses(p4), false);
		
	}
	
	@Test
	public void testToString() {
		assertEquals("1,1,4,4",p2.toString());	
	}
}
