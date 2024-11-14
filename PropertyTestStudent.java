import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestStudent {
	Property p1,p2,p3;

	@BeforeEach
	void setUp() throws Exception {
		p1 = new Property("BobStreet", "Silver", 1345.0, "Bob");
		p2 = new Property("ElmoStreet", "SesameCity", 2345.0, "Elmo",5,5,2,2);
		p3 = new Property(p1);
	}

	@AfterEach
	void tearDown() throws Exception {
		p1=p2=p3=null;
	}

	@Test
	void getOwner() {
		assertEquals(p2.getOwner(), "Elmo");
		assertEquals(p1.getOwner(), "Bob");
	}
	
	@Test
	void getPlot() {
		assertTrue(p2.getPlot().equals(new Plot(5,5,2,2)));
	}
	
	

}
