import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGoogle {

    @Test
    public void GoogleTest() throws InterruptedException {
        String a;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/?hl=ru");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("macbook");
        driver.findElement(By.xpath("//span[@class='ly0Ckb']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
        a = driver.getCurrentUrl();
        System.out.println(a);

        Assert.assertTrue(driver.getCurrentUrl().contains("macbook"));

        driver.quit();
    }
}
