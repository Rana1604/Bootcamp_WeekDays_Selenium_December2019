package homepage.pageobject;

import homepage.webelement.HomePageWebElemen;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePagePageObject extends HomePageWebElemen {
    @FindBy(how = How.XPATH, using = xPathRadioFrame)
    public static WebElement radioFrame;

    public static WebElement getRadioFrame(){
        return radioFrame;
    }

    @FindBy(how = How.XPATH, using = xPathDragAndDropFrame)
    public static WebElement dragAndDropFrame;

    public static WebElement getDragAndDropFrame(){
        return dragAndDropFrame;
    }


    @FindBy(how= How.XPATH, using = xPathJQueryCalenderIFrame)
    public static WebElement calenderIFrame;

    public static WebElement getCalenerIFrame(){
        return calenderIFrame;
    }

    @FindBy(how = How.XPATH, using = xPathDialogiFrame)
    public static WebElement dialogiFrame;

    public static WebElement getDialogiFrame(){
        return dialogiFrame;
    }

    @FindBy(how = How.XPATH, using = xPathJQuerySelectMenuIFrmae)
    public static WebElement selectMenuIFrame;

    public static WebElement getSelectMenuIFrame(){
        return selectMenuIFrame;
    }

    @FindBy(how = How.XPATH, using = xPathPracticeOpenNewTab)
    public static WebElement practiceOpenNewTab;

    public static WebElement getPracticeOpenNewTab(){
        return practiceOpenNewTab;
    }



}


