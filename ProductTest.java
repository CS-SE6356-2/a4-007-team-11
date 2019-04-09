import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProductTest {

	//test for "When a new product is added, the number of items must be incremented"
	@org.junit.Test
	public void newProductAddedItemsIncrementTest() 
	{
		ShoppingCart example = new ShoppingCart();
		int numItems = example.getItemCount();
		example.addItem(new Product("Some Product", 100.00));
		assertEquals(numItems + 1, example.getItemCount());
		numItems++;
		example.addItem(new Product("Another Product to check when list is greater than 0", 200.00));
		assertEquals(numItems + 1, example.getItemCount());
	}
	
	//test for "When a new product is added, the new balance must be the sum of the previous balance plus the cost of the new product"
	@org.junit.Test
	public void newProductAddedBalanceUpdateTest() 
	{
		ShoppingCart example = new ShoppingCart();
		double balance = example.getBalance();
		example.addItem(new Product("Some Product", 100.00));
		assertEquals(balance + 100.00, example.getBalance());
		balance = example.getBalance();
		example.addItem(new Product("Another Product to check when list is greater than 0", 200.00));
		assertEquals(balance + 200.00, example.getBalance());		
	}

}
