package testsShoppingCart;
/*Cuando se crea, el carro tiene 0 elementos.
Cuando está vacío, el carro tiene 0 elementos.
Cuando se añade un producto, el número de elementos debe incrementarse.
Cuando se añade un producto, el balance nuevo debe ser la suma del balance anterior y el precio del producto añadido.
Cuando se elimina un producto, el número de elementos debe decrementarse.
Cuando se intenta eliminar un producto que no está en el carro, se debe lanzar una excepción ProductNotFoundException. 
Pista: inserta la llamada en un bloque try y pon un método fail() después de la llamada a removeItem().*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import shoppingCart.Product;
import shoppingCart.ProductNotFoundException;
import shoppingCart.ShoppingCart;

class ShoppingCartTest {

	@Test
	void testShoppingCart() {//PARA SABER QUE LA LISTA SE CREA Y SE CREA VACÍA
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
		Product product2 = new Product("móvil", 200);
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
			fail("El test no pasa la excepción");
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
