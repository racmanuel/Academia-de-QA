package tarea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tarea {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\ra_cm\\\\eclipse-workspace\\\\QA-Academy\\\\src\\\\Driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	private void tearDown() {
	}

	@Test(priority = 1)
	public void Practica5() {
		Actions action=new Actions(driver);
		driver.get("http://automationpractice.com/index.php");
		WebElement Dresses = driver.findElement(By.cssSelector(".sf-menu>li>a[title=\"Dresses\"]"));
		Dresses.click();
		WebElement Casual = driver.findElement(By.xpath("//img[@src='http://automationpractice.com/img/c/9-medium_default.jpg']"));
		action.moveToElement(Casual).perform();
		Casual.click();
		WebElement Add_Hover = driver.findElement(By.cssSelector(".left-block>.product-image-container"));
		action.moveToElement(Add_Hover).perform();
		WebElement Add_Cart = driver.findElement(By.cssSelector(".button-container>.ajax_add_to_cart_button"));
		Add_Cart.click();
		WebElement Add_CartModal = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		action.moveToElement(Add_CartModal).perform();
		Add_CartModal.click();
		/*
		 * WebElement Add =
		 * driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]")
		 * ); Add.click(); WebElement Add_Shop =
		 * driver.findElement(By.cssSelector(".left-block>.product-image-container"));
		 * Add_Shop.click(); WebElement Add_Shop2 =
		 * driver.findElement(By.cssSelector("p#add_to_cart>button>span"));
		 * Add_Shop2.click();
		 */

	}

}
