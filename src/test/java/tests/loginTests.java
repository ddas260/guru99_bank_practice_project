package tests;

import Pages.LoginPage;
import base.BaseTest;
import org.testng.annotations.Test;

public class loginTests extends BaseTest {
    @Test
    public void successfulLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("mngr605446", "zYpunUv");

    }
}
