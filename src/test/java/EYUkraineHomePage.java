import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class EYUkraineHomePage extends TestInit{

    public EYUkraineHomePage(Object driver) {
        super();
    }
    public WebDriver driver;
    ChromeOptions options = new ChromeOptions();

    public void navigateEYUkraine() {
        driver.get("https://www.ey.com/en_ua");
    }

    public WebElement getCookies() {
        return driver.findElement(By.xpath("//button[@class='cookiePolicy-accept']"));
    }

    public WebElement getMyaccountEY() {
        return driver.findElement(By.xpath("//a[@class='my-ey-login-state__logged-out']"));
    }

    public WebElement getSignIn() {
        return driver.findElement(By.xpath("//button[@class='ant-btn custom-button ant-btn-primary']"));
    }

    public WebElement getYourEmail() {
        return driver.findElement(By.xpath("//input[@id='username']"));

    }

    public WebElement getNext() {
        return driver.findElement(By.xpath("//button[@name='action']"));
    }

    public WebElement getGoogleAccount() {
        return driver.findElement(By.xpath("//span[contains(text(),  'Увійти')]"));
    }
}
