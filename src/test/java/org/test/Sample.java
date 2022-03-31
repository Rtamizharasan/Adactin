package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("gugan");
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("12345");
}
}
