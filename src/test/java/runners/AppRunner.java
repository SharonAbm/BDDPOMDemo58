package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src\\test\\resources\\features\\PlaceOrder.feature",
		glue = {"stepDefs"},
		monochrome=true,
		dryRun=false,
		plugin= {"pretty"
				})
public class AppRunner extends AbstractTestNGCucumberTests{

}
