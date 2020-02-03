package testCase;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="csdemo.feature",glue= {"cucumbercs"},tags= {"@FunctionalTest","~@SmokeTest","~@RegressionTest"},plugin= {"json:target/cucumber-report.json"})

public class CaseRunner {

}
