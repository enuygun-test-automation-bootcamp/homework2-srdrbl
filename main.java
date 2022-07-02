import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.nio.file.Path;
import java.nio.file.Paths;

public class openBrowser {
    public static void main(String[] args) {
        Path resourceDirectory = Paths.get("src", "main", "resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();

        System.out.println(absolutePath);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\srdrb\\IdeaProjects\\untitled3\\src\\main\\resources\\binary\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/webtables/";
        driver.get(url);
        driver.findElement(By.xpath("//*[@autocomplete=\"off\"]")).click();
    }
}