package testPOS;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestController.class, testPayment.class, TestProductSpecification.class })

public class AllTests {

}
