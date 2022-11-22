package testsuite;
//4. Write down the following test into ‘ForgotPasswordTest’class

import com.google.common.base.Verify;
import com.sun.org.glassfish.external.statistics.annotations.Reset;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class ForgotPasswordTest extends Utility {

    String baseurl = " https://opensource-demo.orangehrmlive.com/ ";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }


    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on the ‘Forgot your password’ link

        // WebElement forgotPassword=driver.findElement(By.xpath("//*[text()='Forgot your password? ']"));
        //forgotPassword.click();
        clickOnElement(By.xpath("//p[contains(@class,'-forgot-header')]"));

        //Verify the text ‘Reset Password’
        String expectedMessageField = "Reset Password";
        String actualMessage = getTextFromElement(By.xpath("//h6[contains(@class,'forgot-password-title')]"));
        Assert.assertEquals("no search message passed", expectedMessageField, actualMessage);


        // WebElement actualElementField= driver.findElement(By.xpath(""));
        //actualElementField.getText();
        // Assert.assertEquals("Reset password","Reset password");
    }

    @After
    public void testDown() {
        // closeBrowser();
    }
}
