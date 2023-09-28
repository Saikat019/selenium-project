import com.qa.base.Base;
import com.qa.pages.LoginPage;
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

    public void loginPageTitleTest() {

    }
    @Test
    public void loginPageTest(){
        loginTest.loginPage(properties.getProperty("email"), properties.getProperty("password") );

    }
}