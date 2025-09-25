package testrunner;

	

	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	    features = "src/test/resources/features/Adactin.feature",  // or directory
	    glue = {"stepdefinitions_Adactin"},
	    plugin = { "pretty", "html:target/fb-reports.html", "json:target/cucumber.json" },
	    monochrome = true
	)
	public class AdactinRunner {
	    // empty
	}

