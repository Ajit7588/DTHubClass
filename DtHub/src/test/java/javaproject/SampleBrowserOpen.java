package javaproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleBrowserOpen {
  @Test
  public void f() 
  {
	

	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chrome.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.google.com");
	  
	  
  }
}
