import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gart {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\eclipse java\\drive\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String a1 = driver.getCurrentUrl();
        driver.manage().window().minimize();
        driver.close();
        System.setProperty("webdriver.chrome.driver", "C:\\eclipse java\\drive\\chromedriver.exe");
        WebDriver drive = new ChromeDriver();
        drive.get("https://www.facebook.com/");
        String a = drive.getCurrentUrl();
        System.out.println("First one is Chrome " + a1);
        System.out.println("Second one is FireFox" + a);
        drive.manage().window().maximize();
        drive.manage().window().minimize();
        drive.close();
        System.setProperty("webdriver.edge.driver", "C:\\eclipse java\\drive\\msedgedriver.exe");
        WebDriver Edge=new EdgeDriver();
        Edge.get("https://www.wikipedia.org/");
        Edge.manage().window().maximize();
        Edge.findElement(By.id("searchInput")).sendKeys("Welcome Da Ambi");
        Edge.findElement(By.className("pure-button pure-button-primary-progressive")).click();


    }
}
