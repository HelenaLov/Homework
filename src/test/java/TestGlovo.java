import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestGlovo {

    @Test
    public void openKFCRestaurant(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://glovoapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@data-test-id='address-input-button']")).click();
        driver.findElement(By.xpath("////span[@data-test-id='address-input-placeholder']']")).click();
        //дописати тест
        driver.findElement(By.xpath("//div[@data-test-id='address-input-button']")).sendKeys();
    }
}
