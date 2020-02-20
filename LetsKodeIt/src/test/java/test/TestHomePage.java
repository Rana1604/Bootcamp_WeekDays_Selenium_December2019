package test;

import homepage.pageobject.HomePagePageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePagePageObject {

    public void getInitElements() {
        PageFactory.initElements(driver, HomePagePageObject.class);

    }

    //    @Test()
//    public void testMPractice() throws InterruptedException {
//        getInitElements();
//        clickPractice();
//        sleepFor(2);
//    }
//    @Test()
//    public void  testRadioButton()throws InterruptedException{
//        getInitElements();
//        clickPractice();
//        sleepFor(2);
//        clickRadioButton();
//        sleepFor(2);
//    }
//    @Test()
//    public void testSelectClass()throws InterruptedException{
//        getInitElements();
//        clickPractice();
//        sleepFor(2);
//        clickSelectClass();
//        sleepFor(2);
//    }
//    @Test()
//    public void testMultipleClass() throws InterruptedException{
//        getInitElements();
//        clickPractice();
//        sleepFor(2);
//        clickMultipleSelect();
//        sleepFor(3);
//    }
//   @Test()
//    public void testCheckBox()throws InterruptedException{
//        getInitElements();
//        clickPractice();
//        sleepFor(2);
//        clickCheckBox();
//        sleepFor(2);
//   }
//    @Test()
//    public void testSwitchToNewWindow()throws InterruptedException{
//        getInitElements();
//        clickPractice();
//        sleepFor(3);
//        clickSwitchToNewWindow();
//        sleepFor(4);
//    }
//    @Test()
//    public void testSwitchToNewTab()throws InterruptedException{
//        getInitElements();
//        clickPractice();
//        sleepFor(2);
//        clickSwitchToNewTab();
//        sleepFor(4);
//    }//    @Test()
    public void testSwitchToNewAlert()throws InterruptedException{
        getInitElements();
        clickPractice();
        sleepFor(2);
        clickSwitchToNewAlert();
        sleepFor(4);
    }

}
