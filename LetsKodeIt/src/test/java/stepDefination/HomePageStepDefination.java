package stepDefination;

import io.cucumber.java.en.Given;
import test.TestHomePage;

public class HomePageStepDefination extends TestHomePage {



    @Given("I Select on Radio Button")
    public void i_Select_on_Radio_Button() throws InterruptedException {
        testRadioButton();
    }
    @Given("I Select from SelectClass")
    public void i_Select_from_SelectClass() throws InterruptedException{
       testSelectClass();

    }
    @Given("I Select from MultipleSelect")
    public void i_Select_from_MultipleSelect() throws InterruptedException{
        testMultipleSelect();

    }
    @Given("I Select from CheckBox")
    public void i_Select_from_CheckBox() throws InterruptedException{
       testCheckBox();
    }
    @Given("I Select SwitchToNewWindow")
    public void i_Select_SwitchToNewWindow() throws InterruptedException{
      testSwitchToNewWindow();
    }


    @Given("I Select SwitchToNewTab")
    public void i_Select_SwitchToNewTab() throws InterruptedException{
    testSwitchToNewTab();
    }



    @Given("I click on Alert")
    public void i_click_on_Alert() throws InterruptedException{
    testAlertHandling();
    }



    @Given("I do MouseHover")
    public void i_do_MouseHover() throws InterruptedException {
        testMouseHover();
    }



    @Given("I click on SignUpButton")
    public void i_click_on_SignUpButton() throws InterruptedException{
    testSignUp();
    }



    @Given("I click on Hide and Show")
    public void i_click_on_Hide_and_Show() throws InterruptedException{
    testHideOrShowButton();
    }



    @Given("Get text from Table")
    public void get_text_from_Table() throws InterruptedException {
    testGetTable();
    }



    @Given("iFrame Handling")
    public void iframe_Handling() throws InterruptedException{
    testiFrame();
    }

    @Given("I Take ScreenShot")
    public void i_Take_ScreenShot() throws InterruptedException {
        testScreenShotTaken();
    }

}
