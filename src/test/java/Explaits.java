import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explaits {


    public class ExplicitWait {
        public static void main(String[] args) throws InterruptedException {
            //
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/dynamic_controls");
            driver.findElement(By.xpath("//button[.='Enable']")).click();
            //ElementNotInteractableException: element not interactable
            // happens when an element is either hidden/not active/not interactable
            WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
            // Create an object of Webdriverwait
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.elementToBeClickable(inputBox));
            // Explicit wait applies only to a specific condition and a single element/s
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(inputBox));
            // default polling frequency -> 500ms
            inputBox.sendKeys("Explicit Wait");

        }
    }
}
