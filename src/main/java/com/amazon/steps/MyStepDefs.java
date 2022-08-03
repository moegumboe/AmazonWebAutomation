package com.amazon.steps;

import com.amazon.BaseClass;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyStepDefs extends BaseClass {

    public MyStepDefs() {
        super(driver);
    }


    @Given("I launch the browser")
    public void launchBrowser() {
        //set chromedriver in properties
        super.launchApplication();
    }

    @And("I navigate to {string}")
    public void navigateToWebsite(String website) {
        driver.get(website);
    }

    @Given("I navigate to Televisions")
    public void navigateToTelevisions() throws InterruptedException {
        driver.findElement(By.id("nav-hamburger-menu")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'TV, Appliances, Electronics')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Televisions")).click();
        Thread.sleep(3000);
    }

    @And("I add a filter to my search by brand")
    public void iAddAFilterToMySearch() throws InterruptedException {

        driver.findElement(By.cssSelector(
                        "div.a-column.a-span12:nth-of-type(2) div div div.a-section:nth-of-type(21) li:nth-of-type(3) i"))
                .click();
        Thread.sleep(3000);
    }

    @And("I sort the results by High to Low")
    public void iSortTheResultsBy() {
        driver.findElement(By.cssSelector("span.a-dropdown-prompt")).click();
        driver.findElement(By.cssSelector("div.a-popover-inner  li:nth-of-type(3) a")).click();
    }

    @And("I select the second TV")
    public void iSelectTheSecondTV() {
        driver.findElement(By.cssSelector(
                "div.s-matching-dir span div.s-main-slot div.sg-col-4-of-12:nth-of-type(3) " +
                        "div.a-section.a-spacing-small div.a-section:nth-of-type(1) a")).click();
    }

    @Then("I verify the product description")
    public void iVerifyTheProductDescription() {
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        Assert.isTrue(driver.findElement(By.cssSelector("div#feature-bullets")).isDisplayed(),
                "About this item section is not displayed on the page.");
        //for each bullet-point print out to the console
        List<WebElement> listOfBullets = driver.findElements(By.cssSelector("div#feature-bullets li"));
        for (WebElement listOfBullet : listOfBullets) {
            System.out.println(listOfBullet.getText());
        }
    }

    @Given("I close the browser")
    public void closeBrowser() {
        tearDown();
    }
}
