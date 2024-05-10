//package com.ofds;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//class SeleniumTestOrder {
//
//	WebDriver driver = new ChromeDriver();
//
//	@Test
//	public void testOrder() throws InterruptedException {
//		driver.manage().window().maximize();
//
//		driver.get("http://localhost:3000/order");
//		Thread.sleep(500);
//		// Enter food name
//		WebElement foodNameInput = driver.findElement(By.name("foodName"));
//		foodNameInput.sendKeys("Biryani");
//		Thread.sleep(500);
//
//		// Enter food price
//		WebElement foodPriceInput = driver.findElement(By.name("foodPrice"));
//		foodPriceInput.sendKeys("100");
//		Thread.sleep(500);
//
//		// Select hotel ID
//		Select hotelSelect = new Select(driver.findElement(By.name("hId")));
//		hotelSelect.selectByVisibleText("1"); // Select the hotel with ID 1
//		Thread.sleep(500);
//
//		// Select user ID
//		Select userSelect = new Select(driver.findElement(By.name("id")));
//		userSelect.selectByVisibleText("3"); // Select the user with ID 1
//		Thread.sleep(500);
//
//		// Click the order button
//		driver.findElement(By.id("AddOrder")).click();
//		Thread.sleep(500);
//	}
//
//}
