package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

// Write down the following test into ‘LoginTest’ class
public class LoginTest extends Utility {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";


    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter “Admin” username
        sendTextToElement(By.name("username"), "Admin");
        // Enter “admin123“ password
        sendTextToElement(By.name("password"), "admin123");
        // Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//button[@type='submit']"));

        String expectedMessage = "Dashboard";
        //Verify the ‘Dashboard’ text is display
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h6[contains(@class,'header-breadcrumb-module')]"));
        String actualTextMessage = actualTextMessageElement.getText();
        //Assert.assertEquals("Dashboard is not present",expectedMessage,actualTextMessage);



        //Verify the ‘Dashboard’ text is display
       // WebElement actualTextMessageElement = driver.findElement(By.xpath("//h6[contains(@class,'header-breadcrumb-module')]"));
        //String actualTextMessage = actualTextMessageElement.getText();
       // String expectedMessage = "Dashboard";
       // Assert.assertEquals("Dashboard",expectedMessage,actualTextMessage);

    }
    @After
    public void testDown() {
        // closeBrowser();
    }

}
