package com.java.sel;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {
	
	static void elementName(WebDriver driver, By locator, String text) {
		WebElement ele = driver.findElement(locator);
		ele.sendKeys(text);
	}
	
	static void elementClick(WebDriver driver, By locator) {
		WebElement ele = driver.findElement(locator);
		ele.click();
	}

	static void scrollElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
//	static void date() {		
//        LocalDate ld = LocalDate.now();
//        LocalDate dd = ld.minusDays(7);
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        String formatDate = dd.format(df);
//        System.out.println(formatDate);
//	}
//	
//	static void time() {
//		LocalTime lt = LocalTime.now();
//		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
//		String formatTime = lt.format(df);
//		System.out.println(formatTime);
//	}

	public static void main(String[] args) throws InterruptedException {
		
        LocalDate ld = LocalDate.now();
        LocalDate dd = ld.minusDays(7);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatDate = dd.format(df);
		
        LocalTime lt = LocalTime.now();
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("HH");
		String formatTime = lt.format(df1);
		
		LocalTime lt1 = LocalTime.now();
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("mm");
		String formatTime1 = lt.format(df2);

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tawfe\\eclipse-workspace\\SeleniumEx\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
		//Open the google form
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSep9LTMntH5YqIXa5nkiPKSs283kdwitBBhXWyZdAS-e4CxBQ/viewform");
		//Fill the name in the textbox
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].setAttribute('value', 'ff')", driver.findElement(By.xpath("//textarea[@class = 'KHxj8b tL9Q4c']")));
//		Selenium.elementName(driver, By.xpath("//div[@jsname = 'LwH6nd']/preceding-sibling::input[@type = 'text']"), "Mohamed Tawfeek");
//		Selenium.elementName(driver, By.xpath("//textarea[@class = 'KHxj8b tL9Q4c']"), "To learn a new skills");
//		Selenium.elementClick(driver, By.xpath("(//div[@class = 'rseUEf nQOrEb'])[1]"));
//		Selenium.scrollElement(driver, driver.findElement(By.xpath("(//div[@class='rq8Mwb'])[1]")));
//		Selenium.elementClick(driver, By.xpath("(//div[@class='rq8Mwb'])[1]"));
//		Selenium.elementClick(driver, By.xpath("(//div[@class='rq8Mwb'])[2]"));
//		Selenium.elementClick(driver, By.xpath("(//div[@class='rq8Mwb'])[4]"));
//		Selenium.elementClick(driver, By.xpath("(//div[@jsname = 'wQNmvb'])[1]"));
//		Selenium.elementClick(driver, By.xpath("(//span[text() = 'Mr'])[2]"));
//		Selenium.elementName(driver, By.xpath("//input[@type = 'date']"), formatDate);
//		Selenium.elementName(driver, By.xpath("(//input[@type = 'text'])[2]"), formatTime);
//		Selenium.elementName(driver, By.xpath("(//input[@type = 'text'])[3]"), formatTime1);
//		Selenium.elementClick(driver, By.xpath("//span[text() = 'Submit']"));
		
		driver.get("amazon.in");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
//		finally{
//			driver.quit();
//		}
	}
}
