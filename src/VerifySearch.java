import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySearchElements {
    public static void main(String[] args) {
        // Set the path to your WebDriver (e.g., ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to example.com
            driver.get("https://www.example.com");

            // Locate the search textbox (Assume it's identified by the name 'q')
            WebElement searchBox = driver.findElement(By.name("q"));

            // Locate the search button (Assume it's identified by the name 'btnK')
            WebElement searchButton = driver.findElement(By.name("btnK"));

            // Verify if the search box is displayed
            if (searchBox.isDisplayed()) {
                System.out.println("Search textbox is present.");
            } else {
                System.out.println("Search textbox is NOT present.");
            }

            // Verify if the search button is displayed
            if (searchButton.isDisplayed()) {
                System.out.println("Search button is present.");
            } else {
                System.out.println("Search button is NOT present.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
