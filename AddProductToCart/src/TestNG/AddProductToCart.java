package TestNG;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AddProductToCart {
	
  	static WebDriver driver;
  	
  @Test
  public void f() {
	  
		  	//Setting up the chrome driver exe, the second argument is the location where you have kept the driver in your system
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaffe\\Downloads\\chromedriver_win32_path\\chromedriver.exe");  	 
		  	//Setting the driver to chrome driver
		  	  driver = new ChromeDriver();
		  	  String url = "https://www.amazon.com";
		  	  driver.get(url);
		  	  
		      // Step 2: Search for "gift card" and click the first result
		      WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		      searchBox.sendKeys("gift card");
		      searchBox.submit();

		      // Wait for search results to load (use explicit wait if necessary)
		      // ...

		      // Click on the first gift card product
		      WebElement firstGiftCardProduct = driver.findElement(By.cssSelector("[data-component-type='s-search-result'] h2 a"));
		      firstGiftCardProduct.click();

		      // Step 3: Add the gift card to the cart
		      // Note: The steps to add the gift card to the cart depend on the website's structure
		      // You might need to inspect the elements and find the relevant locators
		      // Example (assumes there's an "Add to Cart" button):
		      WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
		      addToCartButton.click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  	  System.out.println("Starting the browser session");
  }
 
  @AfterMethod
  public void afterMethod() {
  	  System.out.println("Closing the browser session");
  	  driver.quit();
  }

}
