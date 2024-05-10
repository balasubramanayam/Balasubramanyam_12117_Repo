//package com.ofds;
//
//
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class SeleniumTestUser {
//	private WebDriver driver = new ChromeDriver();
//
//	@Test
//	public void testUser() throws InterruptedException {
//		driver.manage().window().maximize();
//		Thread.sleep(500);
//		driver.get("http://localhost:3000/");
//		WebElement usernameField = driver.findElement(By.id("username"));
//		usernameField.sendKeys("Balasubramanyam");
//		Thread.sleep(500);
//
//		WebElement passwordField = driver.findElement(By.id("password"));
//		passwordField.sendKeys("Password");
//		Thread.sleep(500);
//
//		driver.findElement(By.id("submit")).click();
//		Thread.sleep(500);
//	}
//}
