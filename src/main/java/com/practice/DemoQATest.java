package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQATest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            // Step 1 - Open demoqa forms page directly
            driver.get("https://demoqa.com/automation-practice-form");
            System.out.println("Page Title: " + driver.getTitle());

            // Step 2 - Fill First Name
            WebElement firstName = driver.findElement(By.id("firstName"));
            firstName.sendKeys("Rabeya");
            System.out.println("First name entered");

            // Step 3 - Fill Last Name
            WebElement lastName = driver.findElement(By.id("lastName"));
            lastName.sendKeys("Test");
            System.out.println("Last name entered");

            // Step 4 - Fill Email
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("rabeya@test.com");
            System.out.println("Email entered");

            // Step 5 - Fill Mobile Number
            WebElement mobile = driver.findElement(By.id("userNumber"));
            mobile.sendKeys("1234567890");
            System.out.println("Mobile entered");
             Thread.sleep(1000);
            // Step 6 - Scroll down and Submit
            WebElement submitBtn = driver.findElement(By.id("submit"));
            js.executeScript("arguments[0].click();", submitBtn);
            System.out.println("Form submitted!");

            // Step 7 - Verify success popup
            Thread.sleep(5000);
            WebElement popup = driver.findElement(By.id("example-modal-sizes-title-lg"));
            System.out.println("Success Message: " + popup.getText());

        } catch (Exception e) {
            System.out.println("Test Failed: " + e.getMessage());
        } finally {
            driver.quit();
        }
      
    }
}
