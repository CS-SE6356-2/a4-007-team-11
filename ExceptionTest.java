import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ExceptionTest {

	//test for "When a product not in the cart is removed, a ProductNotFoundException must be thrown"
	@org.junit.Test
	public void itemNotInCartException() throws ProductNotFoundException{
		ShoppingCart cart=new ShoppingCart();
		Product tomato=new Product("Tomato",3);
		cart.addItem(new Product("Orange",5));
		
		//trying to remove a tomato from the cart
		try {
			cart.removeItem(tomato);
			fail();
			
		}catch(ProductNotFoundException e) {
			
		}
	}

}
