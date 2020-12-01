package testPOS;

import static org.junit.Assert.*;
import domain.Payment;

import org.junit.Before;
import org.junit.Test;

public class testPayment {
	Payment p;

	@Before
	public void setUp() throws Exception {
		p = new Payment(100);
	}

	@Test
	public void testGetAmount() {
		assertTrue(p.getAmount()==100);
	}
}
