package com.amazon.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HamburgerMenu {

    //all elements for hamburger menu
    @FindBy(id = "#nav-hamburger-menu")
    WebElement hamburgerMenuIcon;

    WebDriver driver;

    public HamburgerMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
