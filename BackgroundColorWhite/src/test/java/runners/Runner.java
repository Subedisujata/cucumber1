package runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "\\Techfios\\Spring2019\\Driver\\BackgroundColorWhite\\src\\test\\java\\features\\whitebackground.feature", glue = {
		"steps" }, dryRun = false, plugin = { "pretty", "html:test-output" }, monochrome = true)
public class Runner {

}
