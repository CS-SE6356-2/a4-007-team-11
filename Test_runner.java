import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Test_runner {
	public static void main(String[] args) {
		//Test for ShoppingCart Class
		Result result = JUnitCore.runClasses(ShoppingCartTest.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	
		System.out.println(result.wasSuccessful());
		
		//Test for Product Class
		Result productResult = JUnitCore.runClasses(ProductTest.class);
		for(Failure failure : productResult.getFailures()) {
			System.out.println(failure.toString());
		}
	
		System.out.println(productResult.wasSuccessful());
		
		
		//Test for ProductNotFoundException Class
		Result exceptionResult = JUnitCore.runClasses(ExceptionTest.class);
		for(Failure failure : exceptionResult.getFailures()) {
			System.out.println(failure.toString());
		}
	
		System.out.println(exceptionResult.wasSuccessful());
	}
}
