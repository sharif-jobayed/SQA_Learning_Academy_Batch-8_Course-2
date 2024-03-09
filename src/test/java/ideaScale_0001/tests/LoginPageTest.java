package ideaScale_0001.tests;

import ideaScale_0001.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

    LoginPage LOGINPAGE=new LoginPage();

    @Test(invocationCount = 5)
    void testLoginPage(){
        LOGINPAGE
                .getPageTitle()
                .acceptCookies()
                .enterAdminEmail()
                .enterAdminPassword()
        ;
    }

}
