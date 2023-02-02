package selenium;
import java.util.List;

import org.openqa.selenium.By;
//import necessary Selenium WebDriver classes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class seleniumTest {
  //declare Selenium WebDriver
  private WebDriver webDriver;		
  
  @Test
  public void checkroomServlet() {
	  //Load website as a new page
	  webDriver.navigate().to("http://localhost:8080/DevOpsProject/index.jsp");
	  List<WebElement> links =  webDriver.findElements(By.tagName("a"));
	  
	  links.get(1).click();
	  Assert.assertEquals(webDriver.getTitle(), "Rooms");
  }
//  @Test
//  public void checkTitle() {
//	  //Load website as a new page
//	  webDriver.navigate().to("https://devopsessentials.github.io");
//	  
//	  //Assert the title to check that we are indeed in the correct website
//	  Assert.assertEquals(webDriver.getTitle(), "Home");
//	  
//	  System.out.println("title: "+webDriver.getTitle());
//	  
//	  //Retrieve link using it's class name and click on it
//	  webDriver.findElement(By.className("link")).click();
//
//	  //Assert the new title to check that the title contain Wikipedia and the button had successfully bring us to the new page
//	  Assert.assertTrue(webDriver.getTitle().contains("Wikipedia"));
//	  System.out.println("new title: "+webDriver.getTitle());
//  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  //Setting system properties of ChromeDriver
	  //to amend directory path base on your local file path
	  String chromeDriverDir = "C:\\Program Files\\Google\\Chrome\\chromedriver.exe";

	  System.setProperty("webdriver.chrome.driver", chromeDriverDir);

	  //initialize FirefoxDriver at the start of test
	  webDriver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  //Quit the ChromeDriver and close all associated window at the end of test
	  webDriver.quit();			
  }

}
