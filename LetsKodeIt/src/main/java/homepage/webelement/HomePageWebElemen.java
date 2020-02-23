package homepage.webelement;

import common.WebAPI;

public class HomePageWebElemen extends WebAPI {

    public static final String webElementPractice = "//a[@class='fedora-navbar-link navbar-link']";
    public static final String webElementRadioButton = "//input[@id='bmwradio']";
    public static final String webElementSelectClass= "//option[contains(text(),'Benz')]";

    public static final String webElementMultipleSelect = "//option[contains(text(),'Peach')]";
    public static final String webElementMultipleSelect1 = "//option[contains(text(),'Apple')]";

    public static final String webElementCheckBox = "//input[@id='benzcheck']";
    public static final String webElementSwitchToNewWindow = "//button[@id='openwindow']";
    public static final String webElementSwitchToNewTab = "//a[@id='opentab']";

    public static final String webElementSwitchToAlert = "//input[@id='name']";
    public static final String webElementSwitchToAlert1 = "//input[@id='alertbtn']";
    public static final String webElementSwitchToAlert2 = "//input[@id='confirmbtn']";

    public static final String webElementMouseHover = "//button[@id='mousehover']";

    public static final String webElemenSignUp = "//a[@id='header-sign-up-btn']";
    public static final String webElemenFirstName = "//input[@id='user_name']";
    public static final String webElemenEmail = "//input[@id='user_email']";
    public static final String webElemenPassword = "//input[@id='user_password']";
    public static final String webElemenConfirmPassword= "//input[@id='user_password_confirmation']";
    public static final String webElemenIAmNotRobot= "//div[@class='g-recaptcha']";
    public static final String webElemenCheckBox1= "//input[@id='user_unsubscribe_from_marketing_emails']";
    public static final String webElemenCheckBox2= "//input[@id='user_agreed_to_terms']";
    public static final String webElemenSignUpButton= "//form[@id='new_user']//center";

    public static final String webElemenHide= "//input[@id='hide-textbox']";
    public static final String webElemenShow= "//input[@id='show-textbox']";

    public static final String webElemenGetTable= "//table[@id='product']";

    public static final String webElemeniFrame= "//iframe[@id='courses-iframe']";
    public static final String webElemeniFrame1= "//input[@id='search-courses']";
    public static final String webElemeniFrame2= "//i[@class='fa fa-search']";

}
