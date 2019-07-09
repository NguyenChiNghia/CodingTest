import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDemo{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.navigate().to("http://testapp.galenframework.com/");
        WebElement login_btn = driver.findElement(By.xpath("//button[contains(@class,'button-login')]"));
        login_btn.click();
        WebElement email_txt = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
        WebElement password_txt = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
        WebElement logIn_btn = driver.findElement(By.xpath("//button[1]"));
        email_txt.sendKeys("testuser@example.com");
        password_txt.sendKeys("test123");
        logIn_btn.sendKeys(Keys.ENTER);
        WebElement addNote_btn = driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]"));
        if(addNote_btn.isDisplayed()){
            System.out.println("Login successfully");
        }
        addNote_btn.click();
        WebElement title_txt = driver.findElement(By.xpath("//input[contains(@name,'title')]"));
        WebElement description_txt = driver.findElement(By.xpath("//textarea[contains(@name,'description')]"));
        title_txt.sendKeys("tester");
        description_txt.sendKeys("testing");
        if(addNote_btn.isDisplayed()){
            addNote_btn.click();
        }
        driver.close();
    }
}
