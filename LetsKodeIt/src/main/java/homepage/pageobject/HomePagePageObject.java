package homepage.pageobject;

import homepage.webelement.HomePageWebElemen;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    public static WebElement getRadioButton(){
        return RadioButton;
    }
    public static void clickRadioButton(){
        getRadioButton().click();
    }
    @FindBy(xpath = webElementSelectClass)
    public static WebElement SelectClass;
    public static WebElement getSelectClass(){
        return SelectClass;
    }
    public static void clickSelectClass(){
        getSelectClass().click();
    }
    @FindBy(xpath = webElementMultipleSelect)
    public static WebElement MultipleSelect;
    public static WebElement getMultipleSelect(){
        return MultipleSelect;
    }
    public static void clickMultipleSelect(){
        getMultipleSelect().click();
    }
    @FindBy(xpath = webElementCheckBox)
    public static WebElement CheckBox;
    public static WebElement getCheckBox(){
        return CheckBox;
    }
    public static void clickCheckBox(){
        getCheckBox().click();
    }
    @FindBy(xpath = webElementSwitchToNewWindow)
    public static WebElement SwitchToNewWindow;
    public static WebElement getSwitchToNewWindow(){
        return SwitchToNewWindow;
    }
    public static void clickSwitchToNewWindow(){
        getSwitchToNewWindow().click();
    }
    @FindBy(xpath = webElementSwitchToNewTab)
    public static WebElement SwitchToNewTab;
    public static WebElement getSwitchToNewTab(){
        return SwitchToNewTab;
    }
    public static void clickSwitchToNewTab(){
        getSwitchToNewTab().click();
    }
   @FindBy(xpath = webElementSwitchToNewAlert)
    public static WebElement SwitchToNewAlert;
    public static WebElement getSwitchToNewAlert(){
        return SwitchToNewAlert;
    }
    public static void clickSwitchToNewAlert(){
        getSwitchToNewAlert().click();
    }

}
