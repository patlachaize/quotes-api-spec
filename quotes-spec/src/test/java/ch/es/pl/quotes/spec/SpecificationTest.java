package ch.es.pl.quotes.spec;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/scenarios/", plugin = {"pretty", "html:target/cucumber"})
public class SpecificationTest {
}