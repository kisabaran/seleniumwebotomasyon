package com.garantibbva.page;

import com.garantibbva.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static com.garantibbva.constants.ConstantsLoginPage.*;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LoginPage login(String username,String password){
        sendKeys(By.id("username"),username);
        return this;

    }
    public LoginPage complete(){
        clickElement(GIRIS_YAP);
        return this;
    }
    public LoginPage loginOut() {
        clickElement(By.id("okBtn"));
        return this;
    }
}
