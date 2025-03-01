package tutorialspointPageTestProject.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/tutorialspointPageTestProject/features",
        glue = {"tutorialspointPageTestProject/stepDefinitions","tutorialspointPageTestProject/hooks"},
        plugin = {"pretty","html:target/cucumber-html-report.html","json:target/cucumber-json-report.json","junit:target/cucumber-junit-report.xml"}
        //tags = ("@test1 or @test2")
        //tags = ("@test1 and @test2")
        //tags = ("not @test2")
)

public class TestRunner {
}
