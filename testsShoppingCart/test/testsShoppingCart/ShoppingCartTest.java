package testsShoppingCart;
/*Cuando se crea, el carro tiene 0 elementos.
Cuando est� vac�o, el carro tiene 0 elementos.
Cuando se a�ade un producto, el n�mero de elementos debe incrementarse.
Cuando se a�ade un producto, el balance nuevo debe ser la suma del balance anterior y el precio del producto a�adido.
Cuando se elimina un producto, el n�mero de elementos debe decrementarse.
Cuando se intenta eliminar un producto que no est� en el carro, se debe lanzar una excepci�n ProductNotFoundException. 
Pista: inserta la llamada en un bloque try y pon un m�todo fail() despu�s de la llamada a removeItem().*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import shoppingCart.Product;
import shoppingCart.ProductNotFoundException;
import shoppingCart.ShoppingCart;

class ShoppingCartTest {

	@Test
	void testShoppingCart() {//PARA SABER QUE LA LISTA SE CREA Y SE CREA VAC�A
		ShoppingCart cart = new ShoppingCart();
		assertEquals(0, cart.getItemCount());
	}

	@Test
	void testGetBalance() {
		ShoppingCart cart = new ShoppingCart();
		assertEquals(0.00, cart.getBalance());
	}
	
	@Test
	void testGetBalanceConUnProductos() {
		ShoppingCart cart = new ShoppingCart();
		Product product = new Product("patata", 3);
		cart.addItem(product);
		assertEquals(3.00, cart.getBalance());
	}
	
	@Test
	void testGetBalanceConMasProductos() {
		ShoppingCart cart = new ShoppingCart();
		Product product = new Product("patata", 3);
		cart.addItem(product);
		assertEquals(3.00, cart.getBalance());
		Product product2 = new Product("m�vil", 200);
		cart.addItem(product2);
		assertEquals(203.00, cart.getBalance());
	}

	@Test
	void testAddItem() {
		ShoppingCart cart = new ShoppingCart();
		Product product = new Product("patata", 3);
		cart.addItem(product);
		assertEquals(3.00, cart.getBalance());
	}

	@Test
	void testRemoveItem() {
		ShoppingCart cart = new ShoppingCart();
		Product product = new Product("patata", 3);
		cart.addItem(product);
		try {
			cart.removeItem(product);
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
		}
		assertEquals(0, cart.getItemCount());
	}
	
	@Test
	void testRemoveItemConMasProductos() {
		ShoppingCart cart = new ShoppingCart();
		Product product = new Product("patata", 3);
		cart.addItem(product);
		Product product2 = new Product("coche", 3000);
		cart.addItem(product2);
		try {
			cart.removeItem(product);
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
		}
		assertEquals(1, cart.getItemCount());
	}
	
	@Test
	void testRemoveItemSinProducto() {
		ShoppingCart cart = new ShoppingCart();
		Product product = new Product("patata", 3);
		try {
			cart.removeItem(product);
			fail("El test no pasa la excepci�n");
		} catch (ProductNotFoundException e) {
		}
	}

	@Test
	void testGetItemCount() {
		ShoppingCart cart = new ShoppingCart();
		Product product = new Product("patata", 3);
		cart.addItem(product);
		assertEquals(1, cart.getItemCount());
	}

	@Test
	void testEmpty() {
		ShoppingCart cart = new ShoppingCart();
		Product product = new Product("patata", 3);
		cart.addItem(product);
		cart.empty();
		assertEquals(0, cart.getItemCount());
	}

}
