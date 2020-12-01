package ui;

// import domain.*;
import workflow.*;


class Principal {
	public static void main(String[] args)
	{
		Store tienda = new Store();
		Register controller = tienda.getRegister();

		System.out.println("Capturo 1 articulo (COD=1) de a 100 pesos");
		controller.EnterItem(1,1);

		System.out.println("Capturo 2 articulos (COD=2) de a 200 pesos");
		controller.EnterItem(2,2);

		System.out.println("Capturo 1 articulo (COD=1) de a 100 pesos");
		controller.EnterItem(1,1);

		System.out.println("Finalizo la venta...");
		controller.endSale();

		System.out.println("Total de la venta..."+controller.getSale().total());

		System.out.println("Pago con 650 pesos...");
		controller.makePayment(650);

		System.out.println("La feria es: ..."+ controller.getSale().getBalance());
	}
}
