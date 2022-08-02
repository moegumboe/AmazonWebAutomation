package com.amazon.steps;

import com.amazon.BaseClass;
import com.amazon.TestApp;
import com.amazon.modules.HamburgerMenu;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepDefs extends BaseClass {

    HamburgerMenu hamburgerMenu;

    public MyStepDefs() {
        hamburgerMenu = new HamburgerMenu();
    }

    @Given("I launch the browser")
    public void launchBrowser() {
        //set chromedriver in properties
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\src\\main\\java\\com\\amazon\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @And("I navigate to {string}")
    public void navigateToWebsite(String website) {
        driver.get(website);
    }

    @And("I navigate to Televisions")
    public void navigateToTelevisions() {
//        hamburgerMenu.clickTelevisionsOption();
//        hamburgerMenu.clickTvAudioAndCamerasOption();
//        hamburgerMenu.clickTelevisionsOption();
        driver.findElement(By.id("nav-hamburger-menu")).click();
        driver.findElement(By.xpath("//div[contains(text(),'TV, Appliances, Electronics')]")).click();
        driver.findElement(By.linkText("Televisions")).click();
    }

    //close the browser
    @And("I close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }
}
