package ideaScale_0001.tests;

import ideaScale_0001.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

    private final LoginPage LOGINPAGE=new LoginPage();

    @Test()
    protected void loginPageTest(){
        LOGINPAGE
                .logPageTitle()
                .acceptCookies()
                .enterAdminEmail()
                .enterAdminPassword()
        ;
    }

}
