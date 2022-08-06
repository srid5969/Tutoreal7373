import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Another1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\eclipse java\\drive\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.id("search_query_top")).sendKeys("Hoe");
        driver.findElement(By.name("submit_search")).click();

    }
}
