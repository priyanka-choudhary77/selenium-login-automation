package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPage = new LoginPage(driver);
    }


    @Test(priority = 1)
    public void testValidLogin() {
        loginPage.login("student", "Password123");
        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Login failed");
    }

    @Test(priority = 2)
    public void testInvalidLogin() {
        loginPage.login("wrongUser", "wrongPass");
        Assert.assertTrue(loginPage.isErrorDisplayed(), "Error message should be visible");
    }

    @Test(priority = 3)
    public void testEmptyUsername() {
        loginPage.login("", "Password123");
        Assert.assertTrue(loginPage.isErrorDisplayed(), "Error message should be visible");
    }

    @Test(priority = 4)
    public void testEmptyPassword() {
        loginPage.login("student", "");
        Assert.assertTrue(loginPage.isErrorDisplayed(), "Error message should be visible");
    }

    @Test(priority = 5)
    public void testEmptyFields() {
        loginPage.login("", "");
        Assert.assertTrue(loginPage.isErrorDisplayed(), "Error message should be visible");
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
