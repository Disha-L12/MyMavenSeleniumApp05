package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WindowType;

public class App {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");

        FirefoxOptions options = new FirefoxOptions();
        

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("-profile");
        options.addArguments("/home/vboxuser/snap/firefox/common/.mozilla/firefox/vm8oz4h9.seleniumprofile");

        WebDriver driver = new FirefoxDriver(options);

        driver.manage().window().maximize();

        // Open first website
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);

        // Open second website
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://automationexercise.com/");
        Thread.sleep(2000);

        // Open third website
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://practicetestautomation.com/");
        Thread.sleep(2000);

        // Keep browser open
        Thread.sleep(2000);

        driver.quit();
    }
}
