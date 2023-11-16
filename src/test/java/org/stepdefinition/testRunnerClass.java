package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", dryRun = false, glue = "org.stepdefinition", snippets = SnippetType.UNDERSCORE, monochrome = true)
public class testRunnerClass {

}
