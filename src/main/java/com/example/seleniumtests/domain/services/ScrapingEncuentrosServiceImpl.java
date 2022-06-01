package com.example.seleniumtests.domain.services;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

import java.util.logging.Level;

@Service
@AllArgsConstructor
@Log
public class ScrapingEncuentrosServiceImpl {

    private static final String URL_BASE = "https://www.google.com/";
    private final ChromeDriver driver;

    public void startScrapingProcess() {
        this.scrapinEtiquetasPrincipales();
    }

    public void scrapinEtiquetasPrincipales() {
        driver.get(ScrapingEncuentrosServiceImpl.URL_BASE);
        log.log(Level.INFO, "Nombre pestaña del navegador: " + driver.getTitle());
    }

}
    