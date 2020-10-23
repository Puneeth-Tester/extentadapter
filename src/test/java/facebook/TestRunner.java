package facebook;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/java/facebook"}, 
		 glue= {"facebook"},
		 plugin = {
				 	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				 	})
public class TestRunner extends AbstractTestNGCucumberTests{

}