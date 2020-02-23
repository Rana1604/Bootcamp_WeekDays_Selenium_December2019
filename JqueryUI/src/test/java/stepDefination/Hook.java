package stepDefination;

import common.WebAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Hook extends WebAPI {
    @Given("I am in JQueryUI Home Page")
    public void i_am_in_JQueryUI_Home_Page(){
        getLocalDriver("OS X", "chrome");
        driver.get("https://jqueryui.com");
    }
    @Then("Close the Browser")
    public void close_the_Browser() {
     driver.close();
    }
}
