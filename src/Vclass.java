import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Vclass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\eclipse java\\drive\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //URL launch
        driver.get("https://www.tutorialspoint.com/videotutorials/subscription.php");
        // identify element with class
        WebElement n = driver.findElement(By.className("input"));
        n.sendKeys("JavaScript");
        //identify element with cssSelector
        WebElement n1= driver.findElement(By.cssSelector("input[class='input']"));
        String str = n1.getAttribute("value");
        System.out.println("Attribute value is : " + str);
        //identify element with xpath
        WebElement p = driver.findElement(By.xpath("//input[@class='input']"));
    }
}


