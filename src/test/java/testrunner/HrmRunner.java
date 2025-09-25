package testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	    features = "src/test/resources/fBFeature.feature",
	    glue = "Stepdefinitions.OLoginCCredentials",
	    plugin = {"pretty", "html:target/cucumber-reports1.html"},
	    monochrome = true
	)
	public class HrmRunner {

}
