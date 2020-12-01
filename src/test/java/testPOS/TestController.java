package testPOS;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import workflow.Register;
import workflow.Store;

public class TestController {
	Register controller;

	@Before
	public void setUp() throws Exception {
		Store tienda = new Store();
		controller = tienda.getRegister();
		
		System.out.println("Capturo 1 articulo (COD=1) de a 100 pesos");
		controller.EnterItem(1,1);

		System.out.println("Capturo 2 articulos (COD=2) de a 200 pesos");
		controller.EnterItem(2,2);

		System.out.println("Capturo 1 articulo (COD=1) de a 100 pesos");
		controller.EnterItem(1,1);
		
		System.out.println("Finalizo la venta...");
		controller.endSale();
		
		System.out.println("Pago con 650 pesos...");
		controller.makePayment(650);
		
	}

	@Test
	public void testMakePayment() {
		assertTrue(controller.getSale().getBalance()==50.0);
	}

	@Test
	public void testGetTotal() {
		assertTrue(controller.getSale().total()==600.0);
	}
	
	@Test
	public void testBecomeComplete()
	{
		assertTrue(controller.getSale().isComplete());
	}

}
