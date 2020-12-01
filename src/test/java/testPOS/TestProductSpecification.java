package testPOS;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import domain.ProductSpecification;

public class TestProductSpecification {
	
	ProductSpecification ps;

	@Before
	public void setUp() throws Exception {
		ps = new ProductSpecification(1,0.50f,"Lapiz");
	}

	@Test
	public void testGetUPC() {
		assertTrue(ps.getUPC()==1);
	}

	@Test
	public void testGetPrice() {
		assertTrue(ps.getPrice()==0.50f);
	}

	@Test
	public void testGetDescription() {
		assertTrue(ps.getDescription().equals("Lapiz"));
	}

}
