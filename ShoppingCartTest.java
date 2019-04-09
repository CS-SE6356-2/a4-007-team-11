import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

	//test for "When created, the cart has 0 items"
	@Test
	public void createZeroItemsCartTest() {
		ShoppingCart cart=new ShoppingCart();
		assertEquals(0,cart.getItemCount());
	}
	
	//test for "when empty, the cart has 0 items"
	@Test
	public void cartEmptyZeroItemsTest() {
		
	}
	
	//test for the removeItem() function, ensuring number of items decremented
	//"When an item is removed, the number of items must be decreased"
	@Test
	public void itemRemovedTest() {
		
	}
	
}
