import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTestStudent {
	ManagementCompany Mc, Mc2, Mc3, Mc4, Mc5;
	Property p1, p2, p3;
	
	@BeforeEach
	void setUp() throws Exception {
		Mc = new ManagementCompany();
		Mc2 = new ManagementCompany("fishInc", "453565", 8);
		Mc3 = new ManagementCompany("Amazon", "4534456", 4, 0,0,10,10);
		Mc5 = new ManagementCompany("test", "3233223",102);
		Mc4 = new ManagementCompany(Mc3);
		
		p1 = new Property("BobStreet", "Silver", 1345.0, "Bob");
		p2 = new Property("ElmoStreet", "SesameCity", 2345.0, "Elmo",5,5,2,2);
		p3 = new Property(p1);
		Mc2.addProperty(p1);
		Mc2.addProperty(p2);
	}

	@AfterEach
	void tearDown() throws Exception {
		Mc=Mc2=Mc3=Mc4=null;
	}

	@Test
	void findHighestRent() {
		assertEquals(Mc2.getHighestRentPropperty(), p2);
	}
	@Test
	void findMgmFee() {
		assertEquals(Mc2.getMgmFeePer(), 8.0);
		assertEquals(Mc3.getMgmFeePer(), 4.0);
	}
	@Test
	void removeLastPropertyTest() {
		assertEquals(Mc2.getProperties()[1],p2);
		Mc2.removeLastProperty();
		assertEquals(Mc2.getProperties()[1],null);
	}
	@Test
	void isManagementFeeValid() {
		assertEquals(Mc2.isManagementFeeValid(),true);
		assertEquals(Mc5.isManagementFeeValid(),false);
	}

}
