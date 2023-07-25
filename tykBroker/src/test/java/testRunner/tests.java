package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"stepDef"},
		plugin = {"pretty", "html:target/cucumber-reports.html"},
		tags = "@test1" //or @test2 or @test3"  
				)

public class tests {
}