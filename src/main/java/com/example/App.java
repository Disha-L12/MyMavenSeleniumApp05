package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class App {

    public static void main(String[] args) throws InterruptedException {

        FirefoxOptions options = new FirefoxOptions();
        

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("-profile");
        options.addArguments("/home/vboxuser/snap/firefox/common/.mozilla/firefox/vm8oz4h9.seleniumprofile");

        WebDriver driver = new FirefoxDriver(options);

        // Open SauceDemo
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        // Navigate to Practice Test site
        driver.get("https://practicetestautomation.com/practice-test-login/");

        Thread.sleep(2000);

        // Login
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        Thread.sleep(3000);

        driver.quit();
    }
}
