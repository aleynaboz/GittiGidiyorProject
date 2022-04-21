package pages;

import methods.Methods;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;
    public LoginPage(){
        methods = new Methods();
    }

    public void login() {
        methods.click(By.id("FormLoginEmail"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("FormLoginEmail"), "aleynaaboz@gmail.com");
        methods.waitBySeconds(2);
        methods.click(By.id("FormLoginPassword"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("FormLoginPassword"), "123456Aa");
        methods.waitBySeconds(2);
        methods.click(By.id("loginForm"));
        methods.waitBySeconds(2);
        methods.isElementVisible(By.id("loginForm"));
        methods.waitBySeconds(2);
    }


}
