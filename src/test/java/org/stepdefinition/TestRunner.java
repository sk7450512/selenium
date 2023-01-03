package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepdefinition",
dryRun = false,monochrome = true,strict = true,snippets = SnippetType.CAMELCASE,tags = "@te4",
plugin = {"html:Report","junit:Report\\junitReport.xml","json:Report\\jsonReport.json"})

public class TestRunner {

}
