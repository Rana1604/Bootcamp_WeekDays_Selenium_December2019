package homepage.webelement;

import common.WebAPI;

public class HomePageWebElemen extends WebAPI {

    public static final String webElementPractice = "//a[@class='fedora-navbar-link navbar-link']";
    public static final String webElementRadioButton = "//input[@id='bmwradio']";
    public static final String webElementSelectClass = "//option[contains(text(),'Benz')]";
    public static final String webElementMultipleSelect = "//option[contains(text(),'Peach')]";
    public static final String webElementCheckBox = "//input[@id='benzcheck']";
    public static final String webElementSwitchToNewWindow = "//button[@id='openwindow']";
    public static final String webElementSwitchToNewTab = "//a[@id='opentab']";
    public static final String webElementSwitchToNewAlert = "//a[@id='opentab']";
}
