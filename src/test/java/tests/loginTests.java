package tests;

import Pages.LoginPage;
import Pages.ManagerHomePage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTests extends BaseTest {
    @Test
    public void successfulLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("mngr605446", "zYpunUv");
        ManagerHomePage managerHomePage = new ManagerHomePage(driver);
        Assert.assertEquals(managerHomePage.getWelcomeText(),"Welcome To Manager's Page of Guru99 Bank", "Welcome message not found");
        Assert.assertEquals(managerHomePage.getTitle(), "Guru99 Bank Manager HomePage", "Title mismatch");

    }

}
