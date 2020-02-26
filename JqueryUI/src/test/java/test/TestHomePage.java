package test;

import homepage.pageobject.HomePagePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends HomePagePageObject {

    static HomePagePageObject homepage;

    //PageFactory
    public void getInItElements(){
        homepage= PageFactory.initElements(driver,HomePagePageObject.class);}

    @Test
    public void testResizeElement() throws InterruptedException {
        getInItElements();
        clickOnElement(xPathResizeableButton);
        resizeElement(xPathResizeFrameLocator, xPathResizeSnippet);
        sleepFor(2);
    }



    @Test
    public void testRadioButton() throws InterruptedException {
        getInItElements();
        clickOnElement(xPathRadioButtonTab);
        iframeHandle(radioFrame);
        //clickOnElement("/html[1]/body[1]/div[1]/fieldset[1]");
        sleepFor(2);
        radioButton(xPathRadioButton1, xPathRadioButton2, xPathRadioButton3);
        sleepFor(2);
    }

    @Test
    public void testCheckBox1() throws InterruptedException {
        getInItElements();
        clickOnElement(xPathCheckBoxTab);
        iframeHandle(radioFrame);
        checkBox(xPathCheckboxSelect1);
        sleepFor(2);
        checkBox(xPathCheckboxSelect2);
        sleepFor(2);
        checkBox(xPathCheckboxSelect3);
        checkBox(xPathCheckboxSelect4);
        sleepFor(2);
    }

    @Test
    public void testDragAndDrop() throws InterruptedException {
        getInItElements();
        clickOnElement(xPathDragAndDropButton);
        iframeHandle(dragAndDropFrame);
        sleepFor(2);
        dragAndDrop(xPathDragFrom, xPathDropTo);
        sleepFor(2);
    }

    @Test
    public void testIsPopUpDisplayed(){
        getInItElements();
        clickOnElement(xPathDialogTab);
        //clickOnElement(xPathDialogiFrame);
        Assert.assertTrue(driver.findElement(By.xpath(xPathDialogPopUp)).isDisplayed());

    }

//    @Test
//    public void testIsPopUpClosed() {
//        getInItElements();
//        clickOnElement(xPathDialogTab);
//        iframeHandle(dialogiFrame);
//        clickOnElement("/html[1]/body[1]/div[1]/div[1]");
//        driver.switchTo().alert().accept();
//        //clickOnElement(xPathDialogPopUpClose);
//    }

//    @Test
//    public void testMouseHoverContributeTab(){
//        getInItElements();
//        mouseHoverByXpath(xPathMouseHoverContributeTab);
//        clickOnElement(xPathMouseHoverContributeCLASelect);
//    }

    @Test
    public void testJQueryImageSelection(){
        getInItElements();
        clickOnElement(xPathJQueryImage);
        if (driver.getTitle().equals("jQuery UI")) {
            System.out.println("We are back at JQuery homepage");
        } else {
            System.out.println("We are NOT in JQuery homepage");
        }
    }

//    @Test
//    public void testCalenderDatePicker(){
//        getInItElements();
//        clickOnElement(xPathJQueryCalenderTab);
//        iframeHandle(calenderIFrame);
//        clickOnElement(xPathJQueryCalenderbox);
//        calenderDays(xPathJQueryCalenderbox);
//    }


//    @Test
//    public void testDropDown(){
//        getInItElements();
//        clickOnElement(xPathJQuerySelectMenuTab);
//        iframeHandle(selectMenuIFrame);
//        dropDown(xPathJQuerySelectDropDownBar);
//    }

    @Test
    public void testRightMouseClick() throws InterruptedException {
        getInItElements();
        sleepFor(5);
        rightClickMouse(xPathResizeableButton);
        sleepFor(2);
    }
}
