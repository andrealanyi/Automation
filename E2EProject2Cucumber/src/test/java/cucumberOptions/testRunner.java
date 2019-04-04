package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(
//		features="src/test/java/features/Login.feature",<- runs this feature only
		features="src/test/java/features",
		glue="stepDefinitions")//package name
public class testRunner extends AbstractTestNGCucumberTests{
	

}
