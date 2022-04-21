package test;

import driver.BaseTest;
import org.junit.Test;
import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){

        ProductPage productPage = new ProductPage();
        productPage.scrolAndSelectProduct();
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
    @Test
    public void getTextTest(){
        ProductPage productPage = new ProductPage();
        LoginPage loginPage = new LoginPage();
        productPage.scrolAndSelectProduct();
        loginPage.login();

    }

}
