package org.Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources",glue="org.stepDefinition",monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE,tags= {"@feature03"}
		
		
		
		)
public class CommerceTestRun {

}
