package testaFacebook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;


import org.junit.Test;

public class TesteFacebookComJunit {
    @Test

    public void testeFacebook () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\LESLIE\\QE Gama Academy\\web driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://pt-br.facebook.com/r.php?locale=pt_BR&display=page");
        driver.findElement(By.name("firstname")).sendKeys("leslie s");
        driver.findElement(By.name("lastname")).sendKeys("cespedes gamarra");
        driver.findElement(By.name("reg_email__")).sendKeys("testu479@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("testu479@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("password");

        driver.findElement(By.xpath("//select[@id='month']")).sendKeys("May");
        driver.findElement(By.xpath("//select[@id='day']")).sendKeys("14");
        driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1986");

        driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
        Thread.sleep(3000);


    }
}
