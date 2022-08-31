package com.nttdata.bootcamp.bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMicroserviceBootcoinApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringBootMicroserviceBootcoinApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicroserviceBootcoinApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Init Bootcoin");
    }

}