package com.garantibbva.test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

//public class SearchTest {
//    /**
//     * Rigorous Test :-)
//     */
//    WebDriver driver;
//    WebDriverWait wait;
//
//    @Before
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "properties/driver/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//
//        driver = new ChromeDriver(options);
//        wait = new WebDriverWait(driver, 60);//60 saniye boyunca 1 er sabiye aralıklarla elementin gelip gelmediğini kontrol et
//        driver.navigate().to("https://www.hepsiburada.com/");
//
//
//    }
//
//    @Test
//    public void googleSearchTest() throws InterruptedException {
//
//     sendKeys(By.name("q"), "Baran Kısa");
//
//      clickElement(By.cssSelector("li[data-view-type='1']"));
//
//
//
//
//     }
//    @Test
//
//   public void n11SearchTest() throws InterruptedException {
//
//
//      clickElement(By.className("btnSignUp"));
//        sendKeys(By.name("firstName"), "Baran");
//       sendKeys(By.name("lastName"), "Kısa");
//        sendKeys(By.id("registrationEmail"), "barankisa.04@hotmail.com");
//         sendKeys(By.id("registrationPassword"), "123456789");
//       sendKeys(By.id("passwordAgain"), "123456789");
//         sendKeys(By.id("passwordAgain"), "123456789");
//        clickElement(By.id("phoneContainer"));
//         sendKeys(By.id("phoneNumber"), "346320407");
//        clickElement(By.xpath("//*[@id=\"registerForm\"]/div[7]/div[1]/div[1]"));
//        clickElement(By.id("birthDay"));
//       selectByVisibleText(By.id("birthDay"), "18");
//         selectByVisibleText(By.id("birthMonth"), "Mayıs");
//       selectByVisibleText(By.id("birthYear"), "1996");
//
//
//      }
//    @Test
//    public void hepsiBuradaSearchTest() throws InterruptedException {
//        hoverElement(By.id("myAccount"));
//        clickElement(By.id("register"));
//        sendKeys(By.id("firstname"), "Baran");
//        sendKeys(By.id("lastname"), "Kısa");
//        sendKeys(By.id("email-register"), "barankisa.04@gmail.com");
//        sendKeys(By.id("password-register"), "Baran.908");
//        clickElement(By.className("notification-row"));
//        clickElement(By.xpath("//*[@id=\"form-user\"]/div[6]/button"));
//
//
//    }

//    @Test
//  public void hepsiBuradaLoginSearchTest() throws InterruptedException {
//        hoverElement(By.id("myAccount"));
//        clickElement(By.id("login"));
//        clickElement(By.className("controls"));
//        sendKeys(By.id("email"), "barankisa.04@gmail.com");
//        sendKeys(By.id("password"), "Baran.908");
//        clickElement(By.className("form-actions"));
//
//
//        String name=getText(By.className("user-name"));
//        System.out.println("///////////"+name);
//        Assert.assertEquals("Baran Kısa",name);
//
////        Assert.assertFalse("BELİRTİLEN ELEMENT GÖRÜNTÜLENDİ",findElement(By.id("myAccount")).isDisplayed());
////        try{
////            findElement(By.id("myAccount")).isDisplayed();
////        }catch (Exception ex){
////            Assert.fail("element Görüntülenemedi");
////        }

//    }
//
//    @After
//    public void after() {
//    driver.quit();
//    }



//}
