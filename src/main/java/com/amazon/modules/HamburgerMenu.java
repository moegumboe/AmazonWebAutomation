package com.amazon.modules;

import com.amazon.BaseClass;
import com.amazon.steps.MyStepDefs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//This class represents the hamburger menu dropdown
public class HamburgerMenu extends BaseClass {

    //all elements for hamburger menu (in theory you would have all elements of the menu in this class)
    @FindBy(id = "nav-hamburger-menu")
    WebElement hamburgerMenuIcon;


    //elements in the "Shop By Department" section\
    @FindBy(xpath = "//div[contains(text(),'TV, Appliances, Electronics')]")
    WebElement tvAudioAndCamerasOption;

    //sub option
    @FindBy(linkText = "Televisions")
    WebElement televisionsOption;


    public HamburgerMenu() {
        PageFactory.initElements(driver, this);
    }

    public void clickHamburgerMenuIcon() {
        hamburgerMenuIcon.click();
    }

    public void clickTvAudioAndCamerasOption() {
        tvAudioAndCamerasOption.click();
    }

    public void clickTelevisionsOption() {
        televisionsOption.click();
    }
}
