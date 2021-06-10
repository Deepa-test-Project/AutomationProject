	package StepDefinitions;
	
	import org.junit.runner.RunWith;
	
	import io.cucumber.junit.CucumberOptions;
	import io.cucumber.junit.Cucumber;
	
	
	@RunWith(Cucumber.class)
	@CucumberOptions
	
	(features = "src/test/resources/Features/ Onlineshopping.feature", 
	glue= {"StepDefinitions"}, 
	monochrome=true,
	plugin= {"pretty","html:target/site/cucumber-pretty",
	"json:target/cucumber.json"})
	
//	plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber.json" })
	
	public class TestRunner {
	
	}
