package com.PayBill;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
	public static void runTest() throws Exception {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path + "\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:9090/PaymentBilling-0.0.1-SNAPSHOT.war/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Mani");
		driver.findElement(By.xpath("//input[@name='userpass']")).sendKeys("Mani");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}