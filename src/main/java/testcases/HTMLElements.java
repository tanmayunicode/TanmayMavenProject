package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HTMLElements {

	@Test
	public void runTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Testing-Tools\\Selenium\\WebDriver\\ChromeAndFFDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/uth/gadgetsgallery/catalog/index.php");
		
		//Step 1: Define WebElement Step 2: Click on it
		
		/*
		WebElement loginLink = driver.findElement(By.linkText("log yourself in"));
		loginLink.click();
		*/
		
		driver.findElement(By.linkText("log yourself in")).click();
		driver.findElement(By.name("email_address")).sendKeys("demo2@unicodetechnologies.in");
		driver.findElement(By.name("password")).sendKeys("unicode2");
	
		driver.findElement(By.id("tdb1")).click();
		
		Thread.sleep(1000);
		
		
		//Validation 
		
		
		WebElement manufacturers = driver.findElement(By.name("manufacturers_id"));  //Line 1
		Select sel = new Select(manufacturers);  //Line 2
		sel.selectByVisibleText("Motorola");  //Line 3
		
		driver.findElement(By.linkText("Log Off")).click();
		
		driver.findElement(By.id("tdb1")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"top_menu\"]/span[3]/a")).getText());
		
		driver.findElement(By.linkText("create an account")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
		
		driver.findElement(By.name("newsletter")).click();
		
		WebElement countryDD = driver.findElement(By.name("country"));
		Select country = new Select(countryDD);
		country.selectByVisibleText("India");
		
		
		
		
		Thread.sleep(5000);
		
		driver.close();  //Close will close the current browser window
		
		
		
		
	}

}
