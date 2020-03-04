package com.garantibbva.test;

import com.garantibbva.base.BaseTest;
import com.garantibbva.page.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    @Before
    public void before(){


       loginPage = new LoginPage(getDriver());



    }
    @Test
    public void loginTest(){
        loginPage.login("emre","1234").complete().loginOut().login("saasa","dsadsa").complete().loginOut();

    }
}
