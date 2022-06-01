package com.example.seleniumtests.infraestructure.scheduler;

import com.example.seleniumtests.domain.services.ScrapingEncuentrosServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.util.logging.Level;

@Configuration
@EnableScheduling
@RequiredArgsConstructor
@Log
public class Scheduler {

    private final ScrapingEncuentrosServiceImpl scrapingEncuentrosServiceImpl;

    @Scheduled(fixedDelay = 1000*15)
    public void scrapingEncuentros(){
        log.log(Level.SEVERE, "Scheduled service: " + LocalDateTime.now());
        scrapingEncuentrosServiceImpl.startScrapingProcess();
    }

}
