import com.qa.base.Base;
import com.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
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
        Assert.assertEquals("Mulberri | Login", title);
        System.out.println(title);
    }

    @Test(priority = 2)
    public void loginPageTest(){
        loginTest.loginPage(properties.getProperty("email"), properties.getProperty("password") );

    }
}