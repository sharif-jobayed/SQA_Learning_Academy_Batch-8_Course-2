package com.parabank.parasoft.tests;

import com.parabank.parasoft.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

    private final LoginPage LOGINPAGE=new LoginPage();
    @Test
    public void loginPageTest(){
        LOGINPAGE
                .thisPageTitle()
                .enterUsername()
                .enterUserPassword()
                .pressLoginBtn()
        ;
    }

}
