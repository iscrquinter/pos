package workflow;

import domain.*;


public class Register {
	private ProductCatalog productCatalog;
	private Sale sale;

	public Register( ProductCatalog catalog )
	{
		productCatalog = catalog;
	}

	public void endSale()
	{
		sale.becomeComplete();
	}

	public void EnterItem( int upc, int quantity )
	{
		if( isNewSale() )
		{
			sale = new Sale();
		}
		ProductSpecification spec = productCatalog.getProductSpecification( upc );
		sale.makeLineItem( spec, quantity );
	}

	public void makePayment( float cashTendered )
	{
		sale.makePayment( cashTendered );
	}

	private boolean isNewSale()
	{
		return ( sale == null ) || ( sale.isComplete() );
	}

        public float getTotal()
        {
          return sale.total();
        }

	public Sale getSale()
	{
		return sale;
	}
}
