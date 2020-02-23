package stepDefination;

import common.WebAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Hook extends WebAPI {
    @Given("I am in LetsKodeIt Practice Page")
    public void i_am_in_LetsKodeIt_Practice_Page() {
        getLocalDriver("OS X", "chrome");
        driver.get("https://learn.letskodeit.com/p/practice");
    }
    @Then("close the browser")
    public void close_the_browser() {
     driver.close();
    }
}
