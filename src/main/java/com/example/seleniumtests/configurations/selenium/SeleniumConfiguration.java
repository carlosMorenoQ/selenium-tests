package com.example.seleniumtests.configurations.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;

@Configuration
public class SeleniumConfiguration {



    @PostConstruct
    public void postConstruct(){
        System.setProperty("webdriver.chrome.driver","/app/.chromedriver/bin/chromedriver");
//        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");

    }

    @Bean
    public ChromeDriver driver(){

        System.setProperty("GOOGLE_CHROME_BIN", "/app/.apt/usr/bin/google-chrome");
        System.setProperty("CHROMEDRIVER_PATH", "/app/.chromedriver/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("/app/.apt/usr/bin/google-chrome");
        options.addArguments("--enable-javascript");
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        return new ChromeDriver(options);
    }

}
