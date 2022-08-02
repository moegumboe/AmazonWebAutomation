package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    public static Properties prop;
    public static WebDriver driver;

    @BeforeTest
    public void launchApplication() {
        readConfig();
        System.out.println("super constructor invoked");
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\src\\main\\java\\com\\amazon\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public void readConfig() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
                    + "\\src\\main\\java\\com\\amazon\\configurations\\config.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
