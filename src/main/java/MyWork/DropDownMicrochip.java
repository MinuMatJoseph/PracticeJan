package MyWork;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownMicrochip {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		 driver.get("https://www.microchip.com/prochiplicensing/#/");
		 Thread.sleep(6000);
//		 driver.findElement(By.id("hostID")).sendKeys("00-00-4A-F8-FW-A8");
		 Thread.sleep(5000);
//		WebElement selectElement = driver.findElement(By.xpath("(//div[@class='select-control']/select)[1]/"));
//		
//		
////		
//		 Select select = new Select(selectElement);
//		 select.selectByVisibleText("2024");
		 
//		 List<WebElement> listOptions = select.getOptions();
//		 System.out.println(listOptions.size());
		 
		 
//		 List<WebElement> selectElementWithOutSelect = driver.findElements(By.xpath("(//div[@class='select-control']/select)[1]/option"));
//		 System.out.println(selectElementWithOutSelect.size());
//		 for(WebElement web : selectElementWithOutSelect) {
//			 if(web.getText().equals("2024")) {
//				 web.click();
//			 }
//		 }
		 
		 
		 
	By slectEleProd = By.xpath("//label[text()='When is your design planned for production?']/preceding-sibling::select");
	plannedProductionDropDown(slectEleProd);
	}
	public static void plannedProductionDropDown(By locator) {
		WebElement prodElement = driver.findElement(locator);
		Select select = new Select(prodElement);
		select.selectByValue("2024");
		
		
		
		
	}

}
