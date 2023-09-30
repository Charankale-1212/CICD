package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

(
		
features=".//Features/PP/Login.feature",
glue="stepdefination",
dryRun=false,
monochrome=true,
plugin= {"pretty","html:test-output"}
		
		
		
		
		
)



public class Runner {

}
