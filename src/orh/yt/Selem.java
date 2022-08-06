package orh.yt;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Selem {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\eclipse java\\drive\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.id("email")).sendKeys("Hello mother fucker");
        WebElement j=driver.findElement(By.id("email"));
        j.sendKeys("7094715969");
        WebElement g=driver.findElement(By.id("pass"));
        g.sendKeys("Pugalarasan");

    }
}
