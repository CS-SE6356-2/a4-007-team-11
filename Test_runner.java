import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Test_runner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(ShoppingCartTest.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	
		System.out.println(result.wasSuccessful());
		
		Result productResult = JUnitCore.runClasses(ProductTest.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	
		System.out.println(productResult.wasSuccessful());
	}
}
