import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

	//test for "When created, the cart has 0 items"
	@org.junit.Test
	public void createZeroItemsCartTest() {
		ShoppingCart cart=new ShoppingCart();
		assertEquals("When created, the cart should have 0 items", 0, cart.getItemCount());
	}
	
	//test for "when empty, the cart has 0 items"
	@org.junit.Test
	public void cartEmptyZeroItemsTest() {
		ShoppingCart cart = new ShoppingCart();
		Product exProduct = new Product("example", 1);
		cart.addItem(exProduct);
		cart.empty(); 
		
		assertEquals( "When empty, the cart should have 0 items", 0, cart.getItemCount() );
	}
	
	//test for the removeItem() function, ensuring number of items decremented
	//"When an item is removed, the number of items must be decreased"
	@org.junit.Test
	public void itemRemovedTest() {
		ShoppingCart cart1 = new ShoppingCart();
		ShoppingCart cart2 = new ShoppingCart();
		Product exProduct = new Product("example", 1);
		cart1.addItem(exProduct);
		cart2.addItem(exProduct);
		cart2.removeItem(exProduct);
		
		assertTrue( "When an item is removed, the number of items should be decreased", cart2.getItemCount() < cart1.getItemCount() );
	}

}
