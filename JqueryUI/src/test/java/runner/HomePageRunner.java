package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"/Users/tofayelrana/IdeaProjects/Bootcamp_WeekDays_Selenium_December2019/JqueryUI/src/test/java/feature"},
        glue={"stepDefination"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
        strict = true,
        monochrome=true,
        tags={}
)

public class HomePageRunner extends AbstractTestNGCucumberTests {


}
