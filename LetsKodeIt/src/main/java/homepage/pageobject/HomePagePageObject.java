package homepage.pageobject;

import homepage.webelement.HomePageWebElemen;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePagePageObject extends HomePageWebElemen {

    @FindBy(xpath = webElementPractice)
    public static WebElement Practice;

    public static WebElement getPractice() {
        return Practice;
    }

    public static void clickPractice() {
        getPractice().click();
    }

    @FindBy(xpath = webElementRadioButton)
    public static WebElement RadioButton;

    public static WebElement getRadioButton() {
        return RadioButton;
    }

    public static void clickRadioButton() {
        getRadioButton().click();
    }

    @FindBy(xpath = webElementSelectClass)
    public static WebElement SelectClass;

    public static WebElement getSelectClass() {
        return SelectClass;
    }

    public static void clickSelectClass() {
        getSelectClass().click();
    }

    @FindBy(xpath = webElementMultipleSelect)
    public static WebElement MultipleSelect;

    public static WebElement getMultipleSelect() {
        return MultipleSelect;
    }

    public static void clickMultipleSelect() {
        getMultipleSelect().click();
    }

    @FindBy(xpath = webElementMultipleSelect1)
    public static WebElement MultipleSelect1;

    public static WebElement getMultipleSelect1() {
        return MultipleSelect1;
    }

    public static void clickMultipleSelect1() {
        getMultipleSelect1().click();
    }


    @FindBy(xpath = webElementCheckBox)
    public static WebElement CheckBox;

    public static WebElement getCheckBox() {
        return CheckBox;
    }

    public static void clickCheckBox() {
        getCheckBox().click();
    }

    @FindBy(xpath = webElementSwitchToNewWindow)
    public static WebElement SwitchToNewWindow;

    public static WebElement getSwitchToNewWindow() {
        return SwitchToNewWindow;
    }

    public static void clickSwitchToNewWindow() {
        getSwitchToNewWindow().click();
    }

    @FindBy(xpath = webElementSwitchToNewTab)
    public static WebElement SwitchToNewTab;

    public static WebElement getSwitchToNewTab() {
        return SwitchToNewTab;
    }

    public static void clickSwitchToNewTab() {
        getSwitchToNewTab().click();
    }

    @FindBy(xpath = webElementSwitchToAlert)
    public static WebElement SwitchToNewAlert;

    public static WebElement getSwitchToNewAlert() {
        return SwitchToNewAlert;
    }

    public static void clickSwitchToNewAlert(String value) {
        getSwitchToNewAlert().sendKeys(value);
    }

    @FindBy(xpath = webElementSwitchToAlert1)
    public static WebElement SwitchToNewAlert1;

    public static WebElement getSwitchToNewAlert1() {
        return SwitchToNewAlert1;
    }

    public static void clickSwitchToNewAlert1() {
        getSwitchToNewAlert1().click();
    }

    @FindBy(xpath = webElementSwitchToAlert2)
    public static WebElement SwitchToNewAlert2;

    public static WebElement getSwitchToNewAlert2() {
        return SwitchToNewAlert2;
    }

    public static void clickSwitchToNewAlert2() {
        getSwitchToNewAlert2().click();
    }

    @FindBy(xpath = webElementMouseHover)
    public static WebElement MouseHover;

    public static WebElement getMouseHover() {
        return MouseHover;
    }

    public static void useMouseHover() {
        getMouseHover().click();


    }

    @FindBy(xpath = webElemenSignUp)
    public static WebElement SignUp;

    public static WebElement getSignUp() {
        return SignUp;
    }

    public void clickSignUp() {
        getSignUp().click();
    }

    @FindBy(xpath = webElemenFirstName)
    public static WebElement FirstName;

    public static WebElement getFirstName() {
        return FirstName;
    }

    public void clickFirstName(String value) {
        getFirstName().sendKeys(value);
        String expected = "Tofayel Rana";
        System.out.println("Expected Text is::" + expected);
        String actual = ("Tofayel Rana");
        System.out.println("Actual Text is::" + actual);
        assertCheck(actual, expected);
    }

    @FindBy(xpath = webElemenEmail)
    public static WebElement Email;

    public static WebElement getEmail() {
        return Email;
    }

    public void clickEmail(String value) {
        getEmail().sendKeys(value);
    }

    @FindBy(xpath = webElemenPassword)
    public static WebElement Password;

    public static WebElement getPassword() {
        return Password;
    }

    public void clickPassword(String value) {
        getPassword().sendKeys(value);
    }

    @FindBy(xpath = webElemenConfirmPassword)
    public static WebElement ConfirmPassword;

    public static WebElement getConfirmPassword() {
        return ConfirmPassword;
    }

    public void clickConfirmPassword(String value) {
        getConfirmPassword().sendKeys(value);
    }

    @FindBy(xpath = webElemenIAmNotRobot)
    public static WebElement IAmNotRobot;

    public static WebElement getIAmNotRobot() {
        return IAmNotRobot;
    }

    public void clickIAmNotRobot() {
        getIAmNotRobot().click();
    }

    @FindBy(xpath = webElemenCheckBox1)
    public static WebElement CheckBox1;

    public static WebElement getCheckBox1() {
        return CheckBox1;
    }

    public void clickCheckBox1() {
        getCheckBox1().click();
    }

    @FindBy(xpath = webElemenCheckBox2)
    public static WebElement CheckBox2;

    public static WebElement getCheckBox2() {
        return CheckBox2;
    }

    public void clickCheckBox2() {
        getCheckBox2().click();
    }

    @FindBy(xpath = webElemenSignUpButton)
    public static WebElement SignUpButton;

    public static WebElement getSignUpButton() {
        return SignUpButton;
    }

    public void clickSignUpButton() {
        getSignUpButton().click();
    }

    @FindBy(xpath = webElemenHide)
    public static WebElement Hide;

    public static WebElement getHide() {
        return Hide;
    }

    public void clickHide() {
        getHide().click();
    }

    @FindBy(xpath = webElemenShow)
    public static WebElement Show;

    public static WebElement getShow() {
        return Show;
    }

    public void clickShow() {
        getShow().click();
    }

    @FindBy(xpath = webElemenGetTable)
    public static WebElement GetTable;

    public static WebElement getGetTable() {
        return GetTable;
    }

    public void useGetTable() {
           TestLogger.log(getGetTable().getText());

    }

    //       @FindBy(xpath = webElemeniFrame)
//        public static WebElement iFrame;
//        public static WebElement getiFrame () {
//            return iFrame;
//        }
//       public void useiFrame(){
//            getiFrame();
//       }
//       @FindBy(xpath = webElemeniFrame1)
//    public static WebElement iFrame1;
//    public static WebElement getiFrame1 () {
//        return iFrame1;
//    }
//    public void useiFrame1(){
//        getiFrame1().sendKeys("Rana");
//    }
//    @FindBy(xpath = webElemeniFrame3)
//    public static WebElement iFrame3;
//    public static WebElement getiFrame3 () {
//        return iFrame3;
//    }
//    public void useiFrame3(){
//        getiFrame3().click();
//    }
//    }
    @FindBy(xpath = webElemeniFrame)
    public static WebElement iFrame;
//    public static WebElement getiFrame(){
//        return iFrame;
//    }
//    public void useiFrame() {
//       getiFrame();
  //  }

    @FindBy(xpath = webElemeniFrame1)
    public static WebElement iFrame1;
//    public static WebElement getiFrame1(){
//        return iFrame1;
//    }
    public void useiFrame1(String info) {
        iFrame1.sendKeys(info, Keys.ENTER);
    }
    @FindBy(xpath = webElemeniFrame2)
    public static WebElement iFrame2;
    public static WebElement getiFrame2(){
        return iFrame2;
    }
    public void useiframe2(){
        getiFrame2().click();
    }
    public void cleariFrame1() {
        iFrame1.clear();
    }
    public static void screenShot() {
        getPractice().getScreenshotAs(OutputType.FILE);
    }


}