package com.JanSeleniumBDD.execution;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/FeatureFiles"},
		glue = {"com.JanSeleniumBDD.steps"},
		tags = "@formfilling"
		)
public class TestRunner {

}
