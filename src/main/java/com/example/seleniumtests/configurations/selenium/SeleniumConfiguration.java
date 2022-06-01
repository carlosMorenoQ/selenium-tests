package com.example.seleniumtests.configurations.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;

@Configuration
public class SeleniumConfiguration {


    private static final String SCOPE_PROTORYPE = "prototype";

    @PostConstruct
    public void postConstruct(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
    }

    @Bean
    @Scope(SCOPE_PROTORYPE)
    public ChromeDriver driver(){
        return new ChromeDriver();
    }

}
