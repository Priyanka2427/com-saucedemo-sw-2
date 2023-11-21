package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends BaseTest {

    static String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);

    }

    @Test
    public void verifyUserShouldLoginSuccessfullyWithValidCredentials() {

        // Find the emailField and type the Admin to username field
        WebElement emailField = driver.findElement(By.name("user-name"));
        emailField.sendKeys("standard_user");

        // Find the password field and type the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce");

        // Find the login button element and click
        driver.findElement(By.name("login-button")).click();
      // Verify the text “PRODUCTS”
        String actualText = driver.findElement(By.xpath("//span[contains(text(), 'Products')]")).getText();
        String expectedText = "Products";

        Assert.assertEquals(expectedText, actualText);




    }
     @Test
    public void verifyThatSixProductsAreDisplayedOnPage () {

        // Find the emailField and type the Admin to username field
        WebElement emailField = driver.findElement(By.name("user-name"));
        emailField.sendKeys("standard_user");

        // Find the password field and type the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce");

        // Find the login button element and click
        driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();

      // Verify that six products are displayed on page
         List<WebElement> numberOfProduct = driver.findElements(By.className("inventory_item"));
         System.out.println("Number of Product in Page: " + numberOfProduct.size()); // display the no of products using size method


    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}


























