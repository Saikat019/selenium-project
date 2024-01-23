import com.qa.base.Base;
import com.qa.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginPageTest extends Base {

    LoginPage loginTest;

    LoginPageTest(){
        super();
    }

    @BeforeSuite
    public void setUp() {
        initialization();
        loginTest = new LoginPage();
    }
    @Test(priority = 1)
    public void loginPageTitleTest() {
        String title = loginTest.loginPageTitle();
        Assert.assertEquals(title,"Mulberri | Login");
        System.out.println(title);
    }
    @Test(priority = 2)
    public void loginPageTest() throws InterruptedException {
        loginTest.setEmail(properties.getProperty("email"));
        loginTest.setPassword(properties.getProperty("password"));
        loginTest.clickLogin();
        Thread.sleep(15000);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getCurrentUrl(),"https://dev.mulberriinsurance.net/peo/customer/listing");
    }
    @AfterSuite
    public void quit(){
        driver.quit();
    }
}