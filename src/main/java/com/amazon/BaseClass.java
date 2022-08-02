package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    public BaseClass(WebDriver driver) {
        BaseClass.driver = driver;
    }

    public void launchApplication() {
        System.out.println("super constructor invoked");
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\src\\main\\java\\com\\amazon\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void tearDown() {
        driver.quit();
    }


}
