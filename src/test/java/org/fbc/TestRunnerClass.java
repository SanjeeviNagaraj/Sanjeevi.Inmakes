package org.fbc;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources" , glue = "org.fbc" , monochrome = true , dryRun = true)
public class TestRunnerClass {

}
