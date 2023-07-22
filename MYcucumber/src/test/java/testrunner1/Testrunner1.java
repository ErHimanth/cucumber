package testrunner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Himanth\\eclipse-workspace\\MYcucumber\\feature11",glue={"stepdefination1"},
monochrome=true,
plugin = { "pretty", "html:target/cucumber-reports" },

dryRun=false // mapping between feature file and step file

)

public class Testrunner1 {

}
