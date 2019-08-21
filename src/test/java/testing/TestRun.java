package testing;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="login.feature", glue={"cucumber1"},tags= {"@dataTest"},plugin= {"pretty","html:target/cucumber-html-report"})

public class TestRun {

}
