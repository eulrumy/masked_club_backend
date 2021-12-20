package com.kryptonium.masked.club.core.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MaskedClubCoreService {
    public static final Logger LOGGER = LogManager.getLogger(MaskedClubCoreService.class);

    public static void main(String[] args) {
        LOGGER.info("Starting PropertyIndexCoinBankService...");
        SpringApplication.run(MaskedClubCoreService.class, args);
    }
}
