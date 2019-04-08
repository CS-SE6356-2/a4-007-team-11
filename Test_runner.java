import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Test_runner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(A4_test_case.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	
		System.out.println(result.wasSuccessful());
	}
}
