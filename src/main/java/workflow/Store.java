package workflow;

import domain.*;

public class Store {
	private ProductCatalog productCatalog = new ProductCatalog();
	private Register controller = new Register( productCatalog );

	public Register getRegister() { return controller; }
}