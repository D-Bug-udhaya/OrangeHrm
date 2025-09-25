package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/Adac.feature",
		glue= {"step_adact"},
		plugin= {"pretty","html:target/adact-reports.html","json:target/adact.json"})
public class Adact_Runner {
	

}
