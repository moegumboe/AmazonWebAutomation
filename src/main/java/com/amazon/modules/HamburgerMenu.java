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

    @FindBy(css = "div.a-column.a-span12:nth-of-type(2) div div div.a-section:nth-of-type(21) li:nth-of-type(3) input")
    WebElement samsungCheckbox;

    @FindBy(css = "div.s-matching-dir span div.s-main-slot div.sg-col-4-of-12:nth-of-type(3) div.a-section.a-spacing-small div.a-section:nth-of-type(1) a")
    WebElement secondTvInList;

    public HamburgerMenu(WebDriver driver) {
        super(driver);
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
