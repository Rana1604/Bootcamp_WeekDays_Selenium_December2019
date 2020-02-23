package stepDefination;

import io.cucumber.java.en.Given;
import test.TestHomePage;

public class HomePageStepDefination extends TestHomePage {

    @Given("I am resizing the Button")
    public void i_am_resizing_the_Button() throws InterruptedException {
        testResizeElement();
    }
    @Given("I am Selecting Image")
    public void i_am_Selecting_Image() throws InterruptedException{
        testJQueryImageSelection();
    }

//    @Given("I am Selecting Date from Calender")
//    public void i_am_Selecting_Date_from_Calender() throws InterruptedException {
//       testCalenderDatePicker();
//    }
    @Given("I am Selecting DropDown")
    public void i_am_Selecting_DropDown() throws InterruptedException{
        testDragAndDrop();
    }

    @Given("I am Right Clicking on Mouse")
    public void i_am_Right_Clicking_on_Mouse()throws InterruptedException {
     testRightMouseClick();
    }

//    @Given("I am Doing HoverContributeTab")
//    public void i_am_Doing_HoverContributeTab() throws InterruptedException{
//       testMouseHoverContributeTab();
//    }

    @Given("I am Doing PopUp Handling")
    public void i_am_Doing_PopUp_Handling() throws InterruptedException{
        testIsPopUpDisplayed();
    }
    @Given("I am Doing PDrag And Drop Handling")
    public void i_am_Doing_PDrag_And_Drop_Handling() throws InterruptedException {
       testDragAndDrop();
    }
}
