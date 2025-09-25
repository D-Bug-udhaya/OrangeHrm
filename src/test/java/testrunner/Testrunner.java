package testrunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions
( features = "classpath:features/login.feature",
glue = "Stepdefinitions",
plugin= {"pretty","html:target/login-report.html"})
public class Testrunner {

}
