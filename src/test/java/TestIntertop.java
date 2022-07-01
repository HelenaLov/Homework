import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntertop extends TestInit {
    @Test
    public void testIntertop() {
        driver.get("https://intertop.ua/ua/");
        openFullscreanWindow();
        driver.findElements(By.xpath("//span[@class='menu-item__name']")).get(2).click();
        driver.findElement(By.xpath("//a[@href='/catalog/zhenskaya_obuv/adidas/']")).click();
        driver.findElements(By.xpath("//span[@class='menu-item__name']")).get(3).click();
        driver.findElement(By.xpath("//div[@class='auth-ico']")).click();
        sleep(2);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("111");
        driver.findElements(By.xpath("//button[@type='submit']")).get(0).click();
        sleep(2);
        Assert.assertEquals(driver.findElements(By.xpath("//div[contains(text(), 'Невірний логін або пароль')]")).size(), 2);
    }
}
