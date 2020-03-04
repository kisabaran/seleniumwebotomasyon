package com.garantibbva.base;

import com.garantibbva.page.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {


    static WebDriver driver = null; //drivere sağa tıkla getter setter yap

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "properties/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notification");
        options.addArguments("disable-popup-blocking");
        options.addArguments("start-maximized");

        setDriver(new ChromeDriver(options));
        getDriver().navigate().to("https://www.trendyol.com/");


    }
    @After
    public void tearDown(){
        getDriver().quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        BaseTest.driver = driver;
    }

}
