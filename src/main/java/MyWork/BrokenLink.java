package MyWork;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrokenLink {
	static WebDriver driver;
	
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		 driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		 By aTag = By.tagName("a");
		 List<WebElement> atagElemt = driver.findElements(aTag);
		 System.out.println(atagElemt.size());
		List<String> storeHref = new ArrayList<String>();
		 for(WebElement webEle : atagElemt) {
			 String webStr = webEle.getAttribute("href");
			 System.out.println(webEle.getText()+"::: "+webStr);
			 storeHref.add(webEle.getAttribute("href"));
			 
		 }
//		 URL url = new URL(storeHref);
		 

	}
public static void u(String storeHref) throws IOException {
	URL url = new URL(storeHref);
}
}


