package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources" , glue = "org.stepdefinition" ,dryRun = true , monochrome = true , strict = true , snippets = SnippetType.CAMELCASE , plugin = {"html:Report" , "junit:Report\\junitreport.xml" , "json:Report\\jsonreport.xml"} )
public class TestRunner {

}
