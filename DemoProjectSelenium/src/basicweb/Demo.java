package basicweb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok\\Selenium - Jars\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://cdn3.digialm.com/EForms/configuredHtml/1815/74930/login.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("PG005909");
	driver.findElement(By.xpath("//*[@id=\"confData\"]")).sendKeys("5958399");
	driver.findElement(By.xpath("//*[@id=\"log\"]/div[3]/div/div/a")).click();
	
	 //driver.switchTo().alert().accept();
	  //String alertMessage= driver.switchTo().alert().getText();
	  //System.out.println(alertMessage);
	//alert	
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/form/div[3]/div[6]/div/div/div[3]/div/div/a")).click();
	driver.findElement(By.xpath("//*[@id=\"edit\"]/a")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/div/div/a")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1500)", "");
	
	driver.findElement(By.xpath("//*[@id=\"showcontent3\"]")).click();
	driver.switchTo().alert().accept();
	
	//driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/div/div/a")).click();

	
	//driver.quit();
	
    }
}

	





