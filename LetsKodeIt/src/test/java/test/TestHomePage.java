package test;

import homepage.pageobject.HomePagePageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePagePageObject {

    public void getInitElements() {
        PageFactory.initElements(driver, HomePagePageObject.class);

    }
     @Test()
    public void testPractice() throws InterruptedException {
        getInitElements();
        clickPractice();
        sleepFor(2);
    }
    @Test()
    public void  testRadioButton()throws InterruptedException{
        getInitElements();
        clickPractice();
        sleepFor(2);
        clickRadioButton();
        sleepFor(2);
    }
    @Test()
    public void testSelectClass()throws InterruptedException{
        getInitElements();
        clickPractice();
        sleepFor(2);
        clickSelectClass();
        sleepFor(2);
    }
    @Test()
    public void testMultipleSelect() throws InterruptedException{
        getInitElements();
        clickPractice();
        sleepFor(2);
        clickMultipleSelect();
        sleepFor(2);
        clickMultipleSelect1();
        sleepFor(2);

    }
   @Test()
    public void testCheckBox()throws InterruptedException{
        getInitElements();
        clickPractice();
        sleepFor(2);
        clickCheckBox();
        sleepFor(2);
   }
    @Test()
    public void testSwitchToNewWindow()throws InterruptedException{
        getInitElements();
        clickPractice();
        sleepFor(3);
        clickSwitchToNewWindow();
        sleepFor(4);
    }
    @Test()
    public void testSwitchToNewTab()throws InterruptedException{
        getInitElements();
        clickPractice();
        sleepFor(2);
        clickSwitchToNewTab();
        sleepFor(4);


    }
    @Test()
    public void testAlertHandling()throws InterruptedException{
        getInitElements();
        clickPractice();
        sleepFor(2);
        clickSwitchToNewAlert("Rana");
        sleepFor(2);
        clickSwitchToNewAlert1();
        sleepFor(2);
        cancelAlert();
        clickSwitchToNewAlert("Rana");
        sleepFor(2);
        clickSwitchToNewAlert2();
        sleepFor(2);
        okAlert();
    }
    @Test()
    public void testMouseHover()throws InterruptedException{
        getInitElements();
        clickPractice();
        sleepFor(2);
        scrollUpDown(750);
        useMouseHover();
        sleepFor(3);
    }
    @Test()
    public void testSignUp()throws InterruptedException{
        getInitElements();
        clickPractice();
        sleepFor(2);
        clickSignUp();
        sleepFor(1);
        clickFirstName("Tofayel Rana");
        sleepFor(1);
        clickEmail("aabc2625@gmail.com");
        sleepFor(1);
        clickPassword("23456768");
        sleepFor(1);
        clickConfirmPassword("23456768");
        sleepFor(1);
        scrollUpDown(500);
//        clickIAmNotRobot();
//        sleepFor(1);
        clickCheckBox1();
        sleepFor(1);
        clickCheckBox2();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(4);
    }
    @Test()
    public void testHideOrShowButton()throws InterruptedException{
        getInitElements();
        clickPractice();
        sleepFor(2);
        scrollUpDown(500);
        clickHide();
        sleepFor(2);
        clickShow();
        sleepFor(2);
    }
    @Test()
    public void testGetTable()throws InterruptedException {
        getInitElements();
        clickPractice();
        sleepFor(2);
        scrollUpDown(500);
        useGetTable();
        sleepFor(2);

    }

    @Test()
        public void testiFrame () throws InterruptedException {
            getInitElements();
            clickPractice();
            sleepFor(2);
            scrollUpDown(1300);
            sleepFor(2);
            driver.switchTo().frame(iFrame);
            useiFrame1("Rana");
            //useiframe2();
            sleepFor(2);
        }


   @Test()
   public void testScreenShotTaken() throws InterruptedException{
            getInitElements();
            clickPractice();
            sleepFor(2);
            screenShot();
            sleepFor(3);

        }


    }

