package pages;

import methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class ProductPage {
    Methods methods;
    Logger Logger = LogManager.getLogger(ProductPage.class);

    public ProductPage(){
        methods = new Methods();
    }

    public void scrolAndSelectProduct(){
        methods.isElementVisible(By.xpath("//*[@class='sc-1fjiks5-2 fWWvjs']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[contains(@href,'/super-fiyatlar')]"));
        methods.waitBySeconds(2);
        methods.scrolWithAction(By.xpath("//span[contains(text(),'Yetişkin')]"));
        methods.waitBySeconds(1);
        methods.isElementVisible(By.xpath("//span[contains(text(),'Yurt Dışı')]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//h2[contains(text(),'Jcb Pro Plus 2400 W 46')]"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("button#add-to-basket"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[contains(@class,'default padding-none')]"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("select.amount"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//option[@value='2']"));
        methods.waitBySeconds(2);
        methods.isElementVisible(By.cssSelector("//option[@value='2']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//input[@type='submit']"));
        methods.waitBySeconds(2);
        methods.isElementVisible(By.cssSelector("div#cart-login-container"));
        methods.waitBySeconds(2);

    }

}
